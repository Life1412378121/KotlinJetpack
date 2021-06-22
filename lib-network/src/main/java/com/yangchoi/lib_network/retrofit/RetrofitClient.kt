package com.yangchoi.lib_network.retrofit

import com.yangchoi.lib_network.ApiService
import com.yangchoi.lib_network.interceptor.LoggingInterceptor
import com.yangchoi.lib_network.utils.URLConstant
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created on 2021/4/27
 * describe:
 */
class RetrofitClient {

    companion object {
        fun getInstance() =
            SingletonHolder.INSTANCE

        private lateinit var retrofit: Retrofit
    }

    private object SingletonHolder {
        val INSTANCE = RetrofitClient()
    }

//    private var cookieJar: PersistentCookieJar = PersistentCookieJar(
//        SetCookieCache(),
//        SharedPrefsCookiePersistor(App.instance)
//    )

    init {
        retrofit = Retrofit.Builder()
            .client(getOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(URLConstant.BASE_URL)
            .build()
    }

    private fun getOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
//            .cookieJar(cookieJar)//根据自己的要求是否添加cookie
            .addInterceptor(LoggingInterceptor())
//            .sslSocketFactory(SSLContextSecurity.createIgnoreVerifySSL("TLS"))//请求https需要配置相关证书
            .build()
    }

    fun create(): ApiService = retrofit.create(
        ApiService::class.java
    )


}