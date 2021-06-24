package com.yangchoi.versionbuild

/**
 * Created on 2021/6/22
 * describe:
 */

object LibsGoogle{
    const val GoogleMaterial = "com.google.android.material:material:${VersionGoogle.GoogleMaterial}"
}

object LibsAndroid {
    const val Junit = "junit:junit:${VersionAndroid.Junit}"
}

object LibsAndroidX{
    const val AndroidJUnitRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val AppCompat = "androidx.appcompat:appcompat:${VersionAndroidX.AppCompat}"
    const val CoreKtx = "androidx.core:core-ktx:${VersionAndroidX.CoreKtx}"
    const val ConstraintLayout = "androidx.constraintlayout:constraintlayout:${VersionAndroidX.ConstraintLayout}"
    const val TestExtJunit = "androidx.test.ext:junit:${VersionAndroidX.TestExtJunit}"
    const val TestEspresso = "androidx.test.espresso:espresso-core:${VersionAndroidX.TestEspresso}"
    const val ActivityKtx = "androidx.activity:activity-ktx:${VersionAndroidX.ActivityKtx}"
    const val FragmentKtx = "androidx.fragment:fragment-ktx:${VersionAndroidX.FragmentKtx}"
    const val MultiDex = "androidx.multidex:multidex:${VersionAndroidX.MultiDex}"
    const val RecyclerView = "androidx.recyclerview:recyclerview:${VersionAndroidX.RecyclerView}"
    const val NavigationUI = "androidx.navigation:navigation-ui-ktx:${VersionAndroidX.Navigation}"
    const val NavigationFragment = "androidx.navigation:navigation-fragment-ktx:${VersionAndroidX.Navigation}"
}

object LibsJetpack{
    const val LifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel:${VersionJetpack.LifecycleViewModel}"
    const val LifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${VersionJetpack.LifecycleRuntimeKtx}"
    const val LifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${VersionJetpack.LifecycleViewModelKtx}"
    const val LifecycleX = "androidx.lifecycle:lifecycle-extensions:${VersionJetpack.LifecycleX}"
    const val RoomRunTime = "androidx.room:room-runtime:${VersionJetpack.RoomVersion}"
    const val RoomCompiler = "androidx.room:room-compiler:${VersionJetpack.RoomVersion}"
}

object LibsDagger{
    const val Dagger = "com.google.dagger:dagger:${VersionDagger.DaggerVersion}"
    const val DaggerCompiler = "com.google.dagger:dagger-compiler:${VersionDagger.DaggerVersion}"
    const val DaggerSupport = "com.google.dagger:dagger-android-support:${VersionDagger.DaggerVersion}"
    const val DaggerProcessor = "com.google.dagger:dagger-android-processor:${VersionDagger.DaggerVersion}"
}

object LibsKotlin {
    const val Kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${VersionKotlin.Kotlin}"
    const val CoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${VersionKotlin.Coroutines}"
    const val CoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${VersionKotlin.Coroutines}"
}

object LibsGitHub {
    const val OkHttp = "com.squareup.okhttp3:okhttp:${VersionGitHub.OkHttp}"
    const val OkHttpInterceptorLogging = "com.squareup.okhttp3:logging-interceptor:${VersionGitHub.OkHttpInterceptorLogging}"
    const val Retrofit = "com.squareup.retrofit2:retrofit:${VersionGitHub.Retrofit}"
    const val RetrofitConverterGson = "com.squareup.retrofit2:converter-gson:${VersionGitHub.RetrofitConverterGson}"
    const val Gson = "com.google.code.gson:gson:${VersionGitHub.Gson}"
    const val MMKV = "com.tencent:mmkv-static:${VersionGitHub.MMKV}"
    const val Glide = "com.github.bumptech.glide:glide:${VersionGitHub.Glide}"
    const val GlideCompiler = "com.github.bumptech.glide:compiler:${VersionGitHub.Glide}"
    const val ARoute = "com.alibaba:arouter-api:${VersionGitHub.ARoute}"
    const val ARouteCompiler = "com.alibaba:arouter-compiler:${VersionGitHub.ARouteCompiler}"
    const val RecyclerViewAdapter = "com.github.CymChad:BaseRecyclerViewAdapterHelper:${VersionGitHub.RecyclerViewAdapter}"
    const val StatusBar = "com.jaeger.statusbarutil:library:${VersionGitHub.StatusBar}"
    const val EventBus = "org.greenrobot:eventbus:${VersionGitHub.EventBus}"
    const val EventBusAPT = "org.greenrobot:eventbus-annotation-processor:${VersionGitHub.EventBus}"
    const val Bugly = "com.tencent.bugly:crashreport:${VersionGitHub.Bugly}"
    const val BuglyNative = "com.tencent.bugly:nativecrashreport:${VersionGitHub.BuglyNative}"
    const val PermissionX = "com.permissionx.guolindev:permissionx:${VersionGitHub.PermissionX}"
    const val LeakCanary = "com.squareup.leakcanary:leakcanary-android:${VersionGitHub.LeakCanary}"
    const val UtilCodeX = "com.blankj:utilcodex:${VersionGitHub.UtilCodeX}"
    const val Immersionbar = "com.gyf.immersionbar:immersionbar:${VersionGitHub.Immersionbar}"
    const val ImmersionbarFragment = "com.gyf.immersionbar:immersionbar-components:${VersionGitHub.Immersionbar}"
    const val Bannerviewpager = "io.github.youth5201314:banner:${VersionGitHub.Bannerviewpager}"
}