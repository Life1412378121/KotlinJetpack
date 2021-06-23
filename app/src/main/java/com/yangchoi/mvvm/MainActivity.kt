package com.yangchoi.mvvm

import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import com.alibaba.android.arouter.facade.annotation.Route
import com.yangchoi.lib_base.base.BaseActivity
import com.yangchoi.lib_base.constants.Constants
import com.yangchoi.lib_base.ktx.setupWithNavController
import com.yangchoi.mvvm.databinding.ActivityMainBinding

@Route(path = Constants.MAIN_PATH)
class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    private var currentNavController:LiveData<NavController>? = null

    override fun initView() {
        initBottomNavigationBar()
    }

    override fun initClick() {
    }

    override fun initData() {
    }

    override fun initVM() {
    }

    private fun initBottomNavigationBar(){
        val navGraphIds =
            listOf(R.navigation.navi_home, R.navigation.navi_project, R.navigation.navi_mine)

        val controller = v.navView.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.nav_host_container,
            intent = intent
        )
//        controller.observe(this, Observer { navController ->
//            //setupActionBarWithNavController(navController)
//            navController.addOnDestinationChangedListener { _, destination, _ ->
//                run {
////                    val id = destination.id
////                    if (id == R.id.projectContentFragment) {
////                        v.navView.visibility = View.GONE
////                    } else {
////                        v.navView.visibility = View.VISIBLE
////                    }
//                }
//            }
//        })
        currentNavController = controller
    }

    override fun onSupportNavigateUp(): Boolean {
        return currentNavController?.value?.navigateUp() ?: false
    }
}