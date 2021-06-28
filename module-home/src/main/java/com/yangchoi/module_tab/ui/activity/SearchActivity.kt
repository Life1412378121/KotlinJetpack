package com.yangchoi.module_tab.ui.activity

import android.util.Log
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.blankj.utilcode.util.GsonUtils
import com.yangchoi.lib_base.base.BaseActivity
import com.yangchoi.lib_network.entity.HotKeyEntity
import com.yangchoi.module_tab.adapter.HotKeyAdapter
import com.yangchoi.module_tab.databinding.ActivitySearchBinding
import com.yangchoi.module_tab.viewmodel.SearchActivityVM

/**
 * Created on 2021/6/23
 * describe:
 */
class SearchActivity : BaseActivity<SearchActivityVM, ActivitySearchBinding>() {

    private val linearLayoutManager by lazy { LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false) }

    private var hotKeyAdapter:HotKeyAdapter? = null

    override fun initView() {
        vm.getHotKeyList()
    }

    override fun initClick() {
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
}