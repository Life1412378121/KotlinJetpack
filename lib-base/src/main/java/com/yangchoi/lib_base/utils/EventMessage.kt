package com.yangchoi.lib_base.utils

/**
 * Created on 2021/4/27
 * describe:
 */
class EventMessage @JvmOverloads constructor(
    var code: EventCode,
    var msg: String = "",
    var arg1: Int = 0,
    var arg2: Int = 0,
    var obj: Any? = null
)