
### 一个用Kotlin Jetpack并采用MVVM架构的项目

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