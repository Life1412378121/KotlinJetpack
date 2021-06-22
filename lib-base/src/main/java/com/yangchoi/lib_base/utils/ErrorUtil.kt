package com.yangchoi.lib_base.utils

import com.yangchoi.lib_base.error.ErrorResult
import retrofit2.HttpException

/**
 * Created on 2021/4/27
 * describe:错误日志工具类
 */
object ErrorUtil {
    fun getError(e: Throwable): ErrorResult {
        val errorResult = ErrorResult()
        if (e is HttpException) {
            errorResult.code = e.code()
        }
        errorResult.errMsg = e.message
        if (errorResult.errMsg.isNullOrEmpty()) errorResult.errMsg = "网络请求失败，请重试"
        return errorResult
    }

    fun getError(apiIndex: Int, e: Throwable): ErrorResult {
        val errorResult = ErrorResult()
        errorResult.index = apiIndex
        if (e is HttpException) {
            errorResult.code = e.code()
        }
        errorResult.errMsg = e.message
        if (errorResult.errMsg.isNullOrEmpty()) errorResult.errMsg = "网络请求失败，请重试"
        return errorResult
    }
}