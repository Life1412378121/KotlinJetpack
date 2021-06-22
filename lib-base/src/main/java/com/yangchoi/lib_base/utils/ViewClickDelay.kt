package com.yangchoi.lib_base.utils

import android.view.View

/**
 * Created on 2021/4/27
 * describe:
 */
object ViewClickDelay {
    var hash: Int = 0
    var lastClickTime: Long = 0
    var SPACE_TIME: Long = 1000
}

//infix fun View.clicks(clickAction: () -> Unit) {
//    this.setOnClickListener {
//        if (this.hashCode() != hash) {
//            hash = this.hashCode()
//            lastClickTime = System.currentTimeMillis()
//            clickAction()
//        } else {
//            val currentTime = System.currentTimeMillis()
//            if (currentTime - lastClickTime > SPACE_TIME) {
//                lastClickTime = System.currentTimeMillis()
//                clickAction()
//            }
//        }
//    }
//}