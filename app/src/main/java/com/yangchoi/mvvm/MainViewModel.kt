package com.yangchoi.mvvm

import androidx.lifecycle.MutableLiveData
import com.yangchoi.lib_base.base.BaseViewModel
import com.yangchoi.lib_network.RequestUtil
import com.yangchoi.lib_network.entity.ArticleListBean

/**
 * Created on 2021/4/27
 * describe:
 */
class MainViewModel : BaseViewModel() {
    var articlesData = MutableLiveData<ArticleListBean>()

    fun getArticlesData(page: Int,isShowLoading: Boolean){
        launch({ RequestUtil.getInstance().getService().getArticleList(page)},articlesData,isShowLoading)
    }
}