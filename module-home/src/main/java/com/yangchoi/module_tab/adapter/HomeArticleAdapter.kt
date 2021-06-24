package com.yangchoi.module_tab.adapter

import android.app.Activity
import android.content.Context
import com.yangchoi.lib_base.base.BaseAdapter
import com.yangchoi.lib_network.entity.ArticleBean
import com.yangchoi.module_tab.databinding.ItemHomeArticleBinding

/**
 * Created on 2021/6/24
 * describe:
 */
class HomeArticleAdapter(context:Activity,listData:MutableList<ArticleBean>)
    : BaseAdapter<ItemHomeArticleBinding,ArticleBean>(context,listData as ArrayList<ArticleBean>) {

    override fun convert(v: ItemHomeArticleBinding, t: ArticleBean, position: Int) {
        v.itemName.text = t.title
        v.itemAuthor.text = t.author
        v.itemTime.text = t.niceDate
    }
}