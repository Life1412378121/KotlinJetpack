package com.yangchoi.versionbuild

/**
 * 项目相关参数配置
 */
object AndroidConfig {
    const val compileSdkVersion = 30
    const val buildToolsVersion = "30.0.3"
    const val applicationId = "com.yangchoi.mvvm"
    const val minSdkVersion = 21
    const val targetSdkVersion = 30
    const val versionCode = 1
    const val versionName = "1.0"
    const val isAppMode = false

    /**
     * 项目当前的版本状态
     * 该状态直接反映当前App是测试版 还是正式版 或者预览版
     * 打包前记得修改该状态
     * 正式版:RELEASE、预览版(α)-内部测试版:ALPHA、测试版(β)-公开测试版:BETA
     */
    const val versionStatus = /*"VERSION_STATUS_RELEASE"*/ "VERSION_STATUS_ALPHA" /*"VERSION_STATUS_BETA"*/
}