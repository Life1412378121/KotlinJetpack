package com.yangchoi.lib_network.utils

/**
 * Created on 2021/4/27
 * describe:
 */
class URLConstant {
    companion object {

        private const val BASE_URL_DEBUG: String = "https://www.wanandroid.com/"
        private const val BASE_URL_RELEASE: String = "https://www.wanandroid.com/"

        //true 可以通过获取App 是否是debug状态来控制显示不同的 url地址
        val BASE_URL: String = if (true) BASE_URL_DEBUG else BASE_URL_RELEASE

    }
}