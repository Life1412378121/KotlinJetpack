package com.yangchoi.module_tab.ui.fragment

import android.content.Intent
import android.util.Log
import androidx.lifecycle.Observer
import com.blankj.utilcode.util.GsonUtils
import com.yangchoi.lib_base.base.BaseFragment
import com.yangchoi.lib_network.entity.ArticleBean
import com.yangchoi.lib_network.entity.ArticleListBean
import com.yangchoi.lib_network.entity.BannerEntity
import com.yangchoi.module_tab.databinding.FragmentHomeBinding
import com.yangchoi.module_tab.ui.activity.SearchActivity
import com.yangchoi.module_tab.viewmodel.HomeFragmentVM

/**
 * Created on 2021/6/23
 * describe:
 */
class HomeFragment : BaseFragment<HomeFragmentVM, FragmentHomeBinding>() {

    private var page = 0
    private var list: ArrayList<ArticleBean>? = null//数据集合
    private var dataBean:ArticleListBean? = null

    private var bannerList:MutableList<BannerEntity>? = null

    /**
     * 拿到接口返回的值
     * */
    override fun initVM() {
        vm.articlesData.observe(this, Observer {
            if (page == 0) list?.clear()

            dataBean = it
        })

        vm.bannerData.observe(this, Observer {
            bannerList = it
            Log.e("bannerList","${GsonUtils.toJson(bannerList)}")
        })
    }
    /**
     * 获取接口数据
     * */
    override fun initView() {
        vm.getArticListData(page,true)
        vm.getBannerList()
    }

    override fun initClick() {
    }

    override fun initData() {

    }

    override fun lazyLoadData() {
    }
}