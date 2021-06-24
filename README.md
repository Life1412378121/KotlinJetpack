
### 一个用Kotlin Jetpack并采用MVVM架构的项目

#### 主要技术要点
    JetPack官方地址:   [https://developer.android.google.cn/jetpack]
    
    1.kotlin         [https://www.kotlincn.net/]
    2.mvvm           [https://github.com/Dawish/GoogleArchitectureDemo]
    3.databinding    [http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0811/3290.html]
    4.RxJava         [https://github.com/ReactiveX/RxJava]
    5.Retrofit       [https://square.github.io/retrofit/]
    6.Navigation


#### Navigation
    1. 导入navigation组件库
        const val NavigationUI = "androidx.navigation:navigation-ui-ktx:${VersionAndroidX.Navigation}"
        const val NavigationFragment = "androidx.navigation:navigation-fragment-ktx:${VersionAndroidX.Navigation}"
        
    2.layout文件夹下创建menu文件
        <?xml version="1.0" encoding="utf-8"?>
        <menu xmlns:android="http://schemas.android.com/apk/res/android">
            <item
                    android:id="@+id/navigation_home" //这个id是重点  重点，一定要和跳转的目的地的文件名称一样，不然会出现找不到位置的情况
                    android:icon="@mipmap/ic_launcher"
                    android:title="首页"/>
            <item
                    android:id="@+id/navigation_project"
                    android:icon="@mipmap/ic_launcher"
                    android:title="项目"/>
            <item
                    android:id="@+id/navigation_mine"
                    android:icon="@mipmap/ic_launcher"
                    android:title="我的"/>
        </menu>
    
    3.layout文件夹下创建navgation文件
    
        android:id="@+id/navigation_home"  //注意这里  这个id对应的menu里面的id
    
        <?xml version="1.0" encoding="utf-8"?>
        <navigation xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            android:id="@+id/navigation_home"  //注意这里  这个id对应的menu里面的id
            app:startDestination="@id/fragment_home">
            <fragment
                android:id="@+id/fragment_home" //id
                android:name="com.yangchoi.module_tab.ui.fragment.HomeFragment" // 目标fragment 或者 activity
                tools:layout="@layout/fragment_home"/> //目标fragment 或者  activity布局
        </navigation>
        
    4.绑定BottomNavigationView
        private var currentNavController:LiveData<NavController>? = null
        private fun initBottomNavigationBar(){
            val navGraphIds =listOf(R.navigation.navi_home, R.navigation.navi_project, R.navigation.navi_mine)
        
            val controller = v.navView.setupWithNavController(
                navGraphIds = navGraphIds,
                fragmentManager = supportFragmentManager,
                containerId = R.id.nav_host_container,
                intent = intent
            )
            currentNavController = controller
        }
        
        override fun onSupportNavigateUp(): Boolean {
            return currentNavController?.value?.navigateUp() ?: false
        }
        
#### network
    网络请求通过协程和retorfit实现，接口访问步骤如下：
    
    1.ViewModel编写接收数据的数据源
        var bannerData = MutableLiveData<MutableList<BannerEntity>>()
        
    2.访问接口  参数一:{}  请求地址   参数二:T 接收数据的数据源  参数三:Boolean是否显示正在加载
        fun getBannerList(){
            launch({RequestUtil
                .getInstance()
                .getService()
                .getBanner()},bannerData,true)
        }
        
    3.在fragment或者activity的initView中使用vm请求接口
        vm.getBannerList()
        
    4.在fragment或者activity的initVM方法中给数据源赋值
        private var bannerList:MutableList<BannerEntity>? = null
        vm.bannerData.observe(this, Observer {bannerList = it})
        
#### buildSrc
    采用Kotlin DLS的形式管理gradle版本信息、Android版本信息、第三方库版本信息
    
##### 创建buildSrc文件
     1.在根目录new-file创建一个lib文件夹,名字一定要是buildSrc这个名字
     2.编译的时候出现'buildSrc' cannot be used as a project name as it is a reserved name错误
       解决办法：删除掉setting.gradle文件里面的include buildSrc部分，重新编译
            
     3.删除除开src-main-java以外的所有文件
     4.在buildSrc文件夹下根目录创建build.gradle.kts文件，填充如下内容：
         plugins { `kotlin-dsl` }
         repositories { jcenter() }
            
     5.在包名下创建AndroidConfig文件管理app版本等信息，文件名字非固定
     6.在包名下创建GradleConfig文件管理gradle版本信息，文件名字非固定
        
     7.在包名下创建Version.kt文件管理第三方库版本
     8.在包名下创建Libs.kt文件管理依赖加载
     
##### 引入第三方类库
    1.在Version.kt文件里面添加版本号
        ```
        object VersionAndroid{
            const val Junit = "4.+"
        }
        ```
    
    2.在Libs.kt文件里面完善引入路径
        object LibsAndroid {
            const val Junit = "junit:junit:${VersionAndroid.Junit}"
        }
    
    3.在对应的gradle文件使用
        testImplementation LibsAndroid.Junit
        
