package com.yangchoi.module_tab.ui.activity

import android.os.Handler
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.blankj.utilcode.util.GsonUtils
import com.yangchoi.lib_base.base.BaseActivity
import com.yangchoi.lib_network.entity.HotKeyEntity
import com.yangchoi.lib_public.utils.TimeUtil
import com.yangchoi.module_tab.adapter.HistoryAdapter
import com.yangchoi.module_tab.adapter.HotKeyAdapter
import com.yangchoi.module_tab.dao.SearchHistoryEntity
import com.yangchoi.module_tab.dao.db
import com.yangchoi.module_tab.databinding.ActivitySearchBinding
import com.yangchoi.module_tab.utils.DaoUtil
import com.yangchoi.module_tab.viewmodel.SearchActivityVM
import kotlin.concurrent.thread

/**
 * Created on 2021/6/23
 * describe:
 */
class SearchActivity : BaseActivity<SearchActivityVM, ActivitySearchBinding>() {

    private val linearLayoutManager by lazy { LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false) }
    private val linearLayoutManager2 by lazy { LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false) }

    private var hotKeyAdapter:HotKeyAdapter? = null
    private var historyAdapter:HistoryAdapter? = null

    override fun initView() {
        vm.getHotKeyList()
        getHistory(false)
    }

    override fun initClick() {
        v.imgIcon.setOnClickListener {
            val insertEntity = SearchHistoryEntity(
                "${System.currentTimeMillis()}",
                "yangchoi",false,
                v.editSearch.text.toString().trim(),TimeUtil.formatTime(TimeUtil.patYearMonthDay))
            v.editSearch.setText("")
            DaoUtil.insertToDataBase(this,insertEntity)
            //通过新线程更新数据
            newHandler.postDelayed(newRunnable,2*1000)
        }

        v.btnDelete.setOnClickListener {
            DaoUtil.updateDataBase(this,"yangchoi",false)
            newHandler.postDelayed(newRunnable,2*1000)
        }
    }

    override fun initData() {
    }

    override fun initVM() {

        vm.hotKeyList.observe(this, Observer {
            if (!it.isNullOrEmpty())
                initHotKey(it)
        })
    }

    private fun initHotKey(data:MutableList<HotKeyEntity>){
        hotKeyAdapter = HotKeyAdapter(this,data)
        v.hotKeyRv.run {
            layoutManager = linearLayoutManager
            adapter = hotKeyAdapter
        }

        hotKeyAdapter.run {
            this?.setOnMenuItemClickListener(object : HotKeyAdapter.MenuItemClickListener{
                override fun onMenuItemClick(dataBean: HotKeyEntity, menuPosition: Int) {
                    Log.e("itemClickTAG","${GsonUtils.toJson(dataBean)}  position:$menuPosition")
                }
            })
        }
    }

    private val newHandler = Handler()
    private val newRunnable = object : Runnable{
        override fun run() {
            getHistory(true)
            newHandler.removeCallbacks(this)
        }
    }

    private fun getHistory(isNewData:Boolean){
        if (isNewData){
            thread {
                val dao = this.db.dao
                val dataList = dao.getSearchHistory("yangchoi",false)

                runOnUiThread {
                    if (dataList.isNullOrEmpty()){
                        v.historyRv.visibility = View.GONE
                    }else
                        historyAdapter?.newData(dataList as MutableList<SearchHistoryEntity>)
                }
            }
        }else{
            thread {
                val dao = this.db.dao
                val dataList = dao.getSearchHistory("yangchoi",false)

                runOnUiThread {
                    v.historyRv.visibility = View.VISIBLE
                    historyAdapter = HistoryAdapter(this, dataList as MutableList<SearchHistoryEntity>)
                    v.historyRv.run {
                        layoutManager = linearLayoutManager2
                        adapter = historyAdapter
                    }
                }
            }
        }
    }
}