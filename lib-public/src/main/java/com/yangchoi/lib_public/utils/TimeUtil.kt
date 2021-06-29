package com.yangchoi.lib_public.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created on 2021/6/29
 * describe: 时间工具类
 */
object TimeUtil {
    val patYearMonthDay = "yyyy-MM-dd"//年月日
    val pathYMDHMS = "yyyy-MM-dd HH:mm:ss"//年月日 时分秒

    fun formatTime(pattern:String):String{
        val sdf = SimpleDateFormat(pattern)
        return sdf.format(Date())
    }

}