
### buildSrc文件夹说明

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
    
    