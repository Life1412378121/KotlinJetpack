package com.yangchoi.lib_base.utils

import android.util.Log
import com.yangchoi.lib_base.BuildConfig

/**
 * Created on 2021/4/27
 * describe: 网络日志打印工具类
 */
object LogUtil {
    private const val TAG = "requestTAG"
    private const val TAG_NET = "requestTAG"

    fun i(message: String?) {
        if (BuildConfig.DEBUG) Log.e(TAG, message.toString())
    }

    fun e(message: String?) {
        if (BuildConfig.DEBUG) Log.e(TAG, message.toString())
    }

    fun showHttpHeaderLog(message: String?) {
        if (BuildConfig.DEBUG) Log.e(TAG_NET, message.toString())
    }

    fun showHttpApiLog(message: String?) {
        if (BuildConfig.DEBUG) Log.e(TAG_NET, message.toString())
    }

    fun showHttpLog(message: String?) {
        if (BuildConfig.DEBUG) Log.e(TAG_NET, message.toString())
    }
}