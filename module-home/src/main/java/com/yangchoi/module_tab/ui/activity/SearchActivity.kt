package com.yangchoi.module_tab.ui.activity

import android.util.Log
import androidx.lifecycle.Observer
import com.yangchoi.lib_base.base.BaseActivity
import com.yangchoi.lib_public.MMKVDataTypeMenu
import com.yangchoi.lib_public.MMKVUtil
import com.yangchoi.module_tab.databinding.ActivitySearchBinding
import com.yangchoi.module_tab.viewmodel.SearchActivityVM

/**
 * Created on 2021/6/23
 * describe:
 */
class SearchActivity : BaseActivity<SearchActivityVM, ActivitySearchBinding>() {
    override fun initView() {

        Log.e("MMKVTAG","${MMKVUtil.getValue(MMKVDataTypeMenu.INT.toString(),"testString")}")

        vm.getHotKeyList()
    }

    override fun initClick() {
    }

    override fun initData() {
    }

    override fun initVM() {

        vm.hotKeyList.observe(this, Observer {

        })
    }
}