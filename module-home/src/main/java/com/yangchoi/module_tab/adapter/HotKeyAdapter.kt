package com.yangchoi.module_tab.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import com.yangchoi.lib_base.base.BaseAdapter
import com.yangchoi.lib_base.base.BaseViewHolder
import com.yangchoi.lib_network.entity.HotKeyEntity
import com.yangchoi.module_tab.R
import com.yangchoi.module_tab.databinding.ItemHotKeyBinding
import java.util.*

/**
 * Created on 2021/6/25
 * describe:
 */
class HotKeyAdapter(context: Activity,dataList:MutableList<HotKeyEntity>)
    : BaseAdapter<ItemHotKeyBinding,HotKeyEntity>(context,dataList as ArrayList<HotKeyEntity>) {

    private var mInflater: LayoutInflater? = null
    private val mFlexItemTextViewCaches: Queue<TextView> = LinkedList()

    override fun convert(v: ItemHotKeyBinding, t: HotKeyEntity, position: Int) {
    }

    override fun onViewRecycled(holder: BaseViewHolder) {
        super.onViewRecycled(holder)
        val itemView = holder.v.root.findViewById<FlexboxLayout>(R.id.fbl_knowledge)

        for (i in 0 until itemView.childCount) {
            //offer:添加一个元素并返回true,如果队列已满,则返回false
            mFlexItemTextViewCaches.offer(itemView.getChildAt(i) as TextView)
        }
        itemView.removeAllViews()
    }

    private fun createOrGetCacheFlexItemTextView(fbl: FlexboxLayout): TextView {
        val tv = mFlexItemTextViewCaches.poll()
        return tv ?: createFlexItemTextView(fbl)
    }

    private fun createFlexItemTextView(fbl: FlexboxLayout): TextView {
        if (mInflater == null) {
            mInflater = LayoutInflater.from(fbl.context)
        }
        //一个textview的布局
        return mInflater!!.inflate(R.layout.item_knowledge_text, fbl, false) as TextView
    }
}