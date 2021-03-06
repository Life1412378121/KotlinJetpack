## 一个用Kotlin Jetpack并采用MVVM架构的项目

### 主要技术要点
    JetPack官方地址:   [https://developer.android.google.cn/jetpack]
    
    1.kotlin         [https://www.kotlincn.net/]
    2.mvvm           [https://github.com/Dawish/GoogleArchitectureDemo]
    3.databinding    [http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0811/3290.html]
    4.RxJava         [https://github.com/ReactiveX/RxJava]
    5.Retrofit       [https://square.github.io/retrofit/]
    6.Navigation     [https://developer.android.google.cn/jetpack/androidx/releases/navigation]
    7.Room           [https://developer.android.google.cn/jetpack/androidx/releases/room]
    8.MMKV           [https://github.com/tencent/mmkv]
### 模块说明
    lib-base            MVVM配置的一些基类
    lib-network         协程+retorfit封装的网络模块
    lib-pubresource     公共资源的存放
    module-home         首页模块
    module-project      项目模块
    module-mine         个人中心模块 


### Navigation
    1. 导入navigation组件库
        `const val NavigationUI = "androidx.navigation:navigation-ui-ktx:${VersionAndroidX.Navigation}"
        const val NavigationFragment = "androidx.navigation:navigation-fragment-ktx:${VersionAndroidX.Navigation}"`
        
    2.layout文件夹下创建menu文件
        `<?xml version="1.0" encoding="utf-8"?>
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
        </menu>`
    
    3.layout文件夹下创建navgation文件
    
        `android:id="@+id/navigation_home"  //注意这里  这个id对应的menu里面的id
    
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
        </navigation>`
        
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
        
### network
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
        
### ROOM
    Jetpack组件的数据库,基于SQlite的基础上提供了一个抽象层让用户能够在充分利用 SQLite 的强大功能的同时，获享更强健的数据库访问机制。
    1.添加依赖
        implementation LibsJetpack.RoomRunTime
        kapt LibsJetpack.RoomCompiler
        
    2.创建表格实体
        @Entity(tableName = "search_history",indices = [Index("user_id","is_delete")])
        data class SearchHistoryEntity @JvmOverloads constructor(
            //字段id
            @ColumnInfo(name = "id")
            @SerializedName("id")
            @PrimaryKey(autoGenerate = false)
            val id:String,
        
            //用户id
            @ColumnInfo(name = "user_id")
            @SerializedName("user_id")
            val user_id:String,
        
            //是否删除
            @ColumnInfo(name = "is_delete")
            @SerializedName("is_delete")
            var is_delete:Boolean = false,
        
            //搜索内容
            @ColumnInfo(name = "content")
            @SerializedName("content")
            val content:String,
        
            //搜索时间
            @ColumnInfo(name = "date_time")
            @SerializedName("date_time")
            val date_time:String
        )   
                 
    3.创建DataBase
        @Database(entities = [SearchHistoryEntity::class],exportSchema = false,version = 1)
        abstract class SearchHistoryDataBase : RoomDatabase(){
            abstract val dao:Dao
        }
        
        @Volatile
        private var dbInstance: SearchHistoryDataBase? = null
        
        val Context.db: SearchHistoryDataBase
            get() {
                if (dbInstance == null){
                    synchronized(SearchHistoryDataBase::class) {
                        if (dbInstance == null) {
                            val ctx = BaseApplication.context
                            dbInstance = Room
                                .databaseBuilder(ctx, SearchHistoryDataBase::class.java, "search")
                                .build()
                        }
                    }
                }
                return dbInstance!!
            }   
    4.创建增删改查操作
        @Dao
        interface Dao {
        
            @Insert(onConflict = OnConflictStrategy.REPLACE)
            fun insert(searchHistoryEntity: SearchHistoryEntity): Long
        
            @Update
            fun update(searchHistoryEntitys: List<SearchHistoryEntity>): Int
        
            @Delete
            fun delete(deleteList: List<SearchHistoryEntity>)
        
            @Query("SELECT * FROM SEARCH_HISTORY WHERE user_id == :uid AND is_delete == :isdelete")
            fun getSearchHistory(uid:String,isdelete:Boolean):List<SearchHistoryEntity>
        }     
            
### MMKV
    微信团队本地数据管理,弃用SharedPreferences。
        object MMKVUtil {
            //获取kv实例
            val kv = MMKV.defaultMMKV()
        
            /**
             * @param dataType 保存数据的类型
             * @param dataKey 保存数据的key
             * @param dataValue 保存数据的value
             * */
            @JvmStatic
            fun saveValue(dataType: String,dataKey:String,dataValue:String){
                when(dataType){
                    MMKVDataTypeMenu.BOOLEAN.toString() -> kv.encode(dataKey,dataValue.toBoolean())
                    MMKVDataTypeMenu.INT.toString() -> kv.encode(dataKey,dataValue.toInt())
                    MMKVDataTypeMenu.LONG.toString() -> kv.encode(dataKey,dataValue.toLong())
                    MMKVDataTypeMenu.FLOAT.toString() -> kv.encode(dataKey,dataValue.toFloat())
                    MMKVDataTypeMenu.DOUBLE.toString() -> kv.encode(dataKey,dataValue.toDouble())
                    MMKVDataTypeMenu.STRING.toString() -> kv.encode(dataKey,dataValue)
                    MMKVDataTypeMenu.ENTITY.toString() -> kv.encode(dataKey,dataValue)
                }
            }
            /**
             * @param dataType 数据类型
             *        boolean 布尔类型
             *        int     int
             *        long    长整形
             *        float   float
             *        double  double
             *        string  字符串
             *        entity  实体类  将实体类转成json字符串再进行保存
             * @param dataKey  保存的key
             * */
            fun getValue(dataType: String,dataKey:String):String{
                return when(dataType){
                    MMKVDataTypeMenu.BOOLEAN.toString() -> "${kv.decodeBool(dataKey)}"
                    MMKVDataTypeMenu.INT.toString() -> "${kv.decodeInt(dataKey)}"
                    MMKVDataTypeMenu.LONG.toString() -> "${kv.decodeLong(dataKey)}"
                    MMKVDataTypeMenu.FLOAT.toString() -> "${kv.decodeFloat(dataKey)}"
                    MMKVDataTypeMenu.DOUBLE.toString() -> "${kv.decodeDouble(dataKey)}"
                    MMKVDataTypeMenu.STRING.toString() -> kv.decodeString(dataKey)
                    MMKVDataTypeMenu.ENTITY.toString() -> kv.decodeString(dataKey)
                    else -> ""
                }
            }
        }    
    
        
### buildSrc
    采用Kotlin DLS的形式管理gradle版本信息、Android版本信息、第三方库版本信息
    
### 创建buildSrc文件
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
     
### 引入第三方类库
    1.在Version.kt文件里面添加版本号
        object VersionAndroid{
            const val Junit = "4.+"
        }
    
    2.在Libs.kt文件里面完善引入路径
        object LibsAndroid {
            const val Junit = "junit:junit:${VersionAndroid.Junit}"
        }
    
    3.在对应的gradle文件使用
        testImplementation LibsAndroid.Junit
        
### 扩展至BaseActivity、BaseFragment
    * 扩展至Activity和Fragment都一直，直接继承BaseActiviy或者BaseFragment
    * 传入参数一: 对应的ViewModel  参数二:对应的布局
    * 布局的传入方式直接就是布局名称驼峰后面加上Binding,
        比如MainActivity对应布局是activity_main.xml那么对应的viewbinding就是ActivityMainBinding
    * 要想使用viewbinding必须在该module的gradle文件添加支持
    buildFeatures {
             viewBinding = true
         }
    class HomeFragment : BaseFragment<HomeFragmentVM, FragmentHomeBinding>()
    class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>()
    
### 扩展至BaseAdapter
    class HomeArticleAdapter(context:Activity,listData:MutableList<ArticleBean>)
        : BaseAdapter<ItemHomeArticleBinding,ArticleBean>(context,listData as ArrayList<ArticleBean>)
        
    参数解析:
    1.context:Activity 只能是Activity的上下文
    2.listData:MutableList<ArticleBean> 数据源  BaseAdapter接收的是ArrayList形式的，所以要进行转换
    3.ItemHomeArticleBinding 注入布局，和上面的activity、fragment一致
    4.ArticleBean 数据类型
    