package com.yangchoi.module_tab.ui.fragment

import android.content.Intent
import com.yangchoi.lib_base.base.BaseFragment
import com.yangchoi.module_tab.databinding.FragmentHomeBinding
import com.yangchoi.module_tab.ui.activity.SearchActivity
import com.yangchoi.module_tab.viewmodel.HomeFragmentVM

/**
 * Created on 2021/6/23
 * describe:
 */
class HomeFragment : BaseFragment<HomeFragmentVM, FragmentHomeBinding>() {
    override fun initVM() {
    }

    override fun initView() {
    }

    override fun initClick() {
        v.btnSearch.setOnClickListener {
            startActivity(Intent(mContext,SearchActivity::class.java))
        }
    }

    override fun initData() {
    }

    override fun lazyLoadData() {
    }
}