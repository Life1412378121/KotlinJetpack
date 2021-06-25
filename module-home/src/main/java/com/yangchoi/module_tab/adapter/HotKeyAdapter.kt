package com.yangchoi.module_tab.adapter

import android.app.Activity
import android.content.Context
import com.yangchoi.lib_base.base.BaseAdapter
import com.yangchoi.lib_network.entity.HotKeyEntity
import com.yangchoi.module_tab.databinding.ItemHotKeyBinding

/**
 * Created on 2021/6/25
 * describe:
 */
class HotKeyAdapter(context: Activity,dataList:MutableList<HotKeyEntity>)
    : BaseAdapter<ItemHotKeyBinding,HotKeyEntity>(context,dataList as ArrayList<HotKeyEntity>) {

    override fun convert(v: ItemHotKeyBinding, t: HotKeyEntity, position: Int) {
        TODO("Not yet implemented")
    }
}