package com.yangchoi.lib_network

import com.yangchoi.lib_base.base.BaseResult
import com.yangchoi.lib_network.entity.ArticleListBean
import com.yangchoi.lib_network.entity.BannerEntity
import com.yangchoi.lib_network.entity.HotKeyEntity
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created on 2021/4/27
 * describe:接口service
 */
interface ApiService {
    /**
     * 获取首页banner
     * */
    @GET("banner/json")
    suspend fun getBanner():BaseResult<MutableList<BannerEntity>>
    /**
     * 获取首页文章列表
     * */
    @GET("article/listproject/{page}/json")
    suspend fun getArticleList(@Path("page") page: Int): BaseResult<ArticleListBean>
    /**
     * 获取搜索热词
     * */
    @GET("hotkey/json")
    suspend fun getHotKey():BaseResult<MutableList<HotKeyEntity>>
}