package com.yangchoi.lib_base.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

/**
 * Created on 2021/4/27
 * describe: recyclerview的viewholder基类
 */
open class BaseViewHolder(var v: ViewBinding, itemView: View) : RecyclerView.ViewHolder(itemView)