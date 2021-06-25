package com.yangchoi.lib_base.base

import android.app.Application
import android.content.Context
import com.tencent.mmkv.MMKV

/**
 * Created on 2021/6/25
 * describe:
 */
open class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        MMKV.initialize(context)
    }

    companion object{

        @JvmStatic
        lateinit var context: Context
            private set

    }

}