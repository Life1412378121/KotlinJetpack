package com.yangchoi.lib_network

import com.yangchoi.lib_base.base.BaseResult
import com.yangchoi.lib_network.entity.ArticleListBean
import com.yangchoi.lib_network.entity.BannerEntity
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created on 2021/4/27
 * describe:接口service
 */
interface ApiService {

    @GET("banner/json")
    suspend fun getBanner():BaseResult<MutableList<BannerEntity>>

    @GET("article/listproject/{page}/json")
    suspend fun getArticleList(@Path("page") page: Int): BaseResult<ArticleListBean>
}