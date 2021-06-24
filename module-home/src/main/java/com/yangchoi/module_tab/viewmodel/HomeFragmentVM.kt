package com.yangchoi.module_tab.viewmodel

import androidx.lifecycle.MutableLiveData
import com.yangchoi.lib_base.base.BaseViewModel
import com.yangchoi.lib_network.RequestUtil
import com.yangchoi.lib_network.entity.ArticleListBean
import com.yangchoi.lib_network.entity.BannerEntity

/**
 * Created on 2021/6/23
 * describe:
 */
class HomeFragmentVM : BaseViewModel() {
    var articlesData = MutableLiveData<ArticleListBean>()
    var bannerData = MutableLiveData<MutableList<BannerEntity>>()

    fun getArticListData(page: Int,isShowLoading: Boolean){
        launch({RequestUtil
            .getInstance()
            .getService()
            .getArticleList(page)},articlesData,isShowLoading)
    }

    fun getBannerList(){
        launch({RequestUtil
            .getInstance()
            .getService()
            .getBanner()},bannerData,true)
    }
}