package com.yangchoi.lib_base.base

/**
 * Created on 2021/4/27
 * describe: 数据返回的基类，根据api编写
 */
open class BaseResult<T> {
    val errorMsg: String? = null
    val errorCode: Int = 0
    val data: T? = null
}