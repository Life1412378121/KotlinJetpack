package com.yangchoi.lib_network

import com.yangchoi.lib_network.retrofit.RetrofitClient

/**
 * Created on 2021/4/27
 * describe: 访问网络工具类  简化请求操作  简化 简化  再简化
 */
class RequestUtil {

    private val mService by lazy { RetrofitClient.getInstance().create() }

    //可以直接在BaseViewModel中获取取ApiService对象，简化接口调用
    fun getService(): ApiService {
        return mService
    }

    companion object{
        @Volatile
        private var httpUtil: RequestUtil? = null

        fun getInstance() = httpUtil ?: synchronized(this) {
            httpUtil ?: RequestUtil().also { httpUtil = it }
        }
    }

}