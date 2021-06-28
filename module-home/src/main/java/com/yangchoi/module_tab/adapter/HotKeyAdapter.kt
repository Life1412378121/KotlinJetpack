package com.yangchoi.module_tab.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import com.google.android.flexbox.FlexboxLayout
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
class HotKeyAdapter(context: Activity,private val dataList:MutableList<HotKeyEntity>)
    : BaseAdapter<ItemHotKeyBinding,HotKeyEntity>(context,dataList as ArrayList<HotKeyEntity>) {

    private var mInflater: LayoutInflater? = null
    private val mFlexItemTextViewCaches: Queue<TextView> = LinkedList()

    interface MenuItemClickListener{
        fun onMenuItemClick(dataBean: HotKeyEntity,menuPosition:Int)
    }
    private var onMenuItemClickListener:MenuItemClickListener? = null
    
    internal fun setOnMenuItemClickListener(onMenuItemClickListener:MenuItemClickListener){
        this.onMenuItemClickListener = onMenuItemClickListener
    }

    override fun convert(v: ItemHotKeyBinding, t: HotKeyEntity, position: Int) {
        //包裹在一个FlexboxLayout里面 不然会多次实例化
        for (i in 0 until dataList.size){
            val childTv = createOrGetCacheFlexItemTextView(v.fblKnowledge)
            childTv.text = dataList[i].name
            v.fblKnowledge.addView(childTv)

            childTv.setOnClickListener {
                onMenuItemClickListener?.onMenuItemClick(dataList[i],i)
            }
        }
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
        return mInflater!!.inflate(R.layout.item_knowledge_text, fbl, false) as TextView
    }
}