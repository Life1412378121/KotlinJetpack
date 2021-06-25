package com.yangchoi.module_tab.viewmodel

import androidx.lifecycle.MutableLiveData
import com.yangchoi.lib_base.base.BaseViewModel
import com.yangchoi.lib_network.RequestUtil
import com.yangchoi.lib_network.entity.HotKeyEntity

/**
 * Created on 2021/6/23
 * describe:
 */
class SearchActivityVM : BaseViewModel() {
    var hotKeyList = MutableLiveData<MutableList<HotKeyEntity>>()

    fun getHotKeyList(){
        launch({RequestUtil.getInstance()
            .getService()
            .getHotKey()},hotKeyList,true)
    }
}