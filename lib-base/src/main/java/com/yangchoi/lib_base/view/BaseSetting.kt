package com.yangchoi.lib_base.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.yangchoi.lib_base.R

/**
 * Created on 2021/6/24
 * describe: 自定义设置条目栏布局
 */
class BaseSetting : LinearLayout {
    private var settingView: View? = null

    private var menuIcon:ImageView? = null
    private var menuText:TextView? = null
    private var rightText:TextView? = null
    private var rightIcon:ImageView? = null

    constructor(context: Context) : super(context){
        initSettingView(context)
    }
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs){
        initSettingView(context, attrs)
    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr){
        initSettingView(context, attrs)
    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes){
        initSettingView(context, attrs)
    }

    @SuppressLint("Recycle")
    private fun initSettingView(context: Context,attrs: AttributeSet? = null){
        settingView = View.inflate(context, R.layout.base_setting,this)

        //find id
        menuIcon = settingView?.findViewById(R.id.img_setting_icon)
        menuText = settingView?.findViewById(R.id.tv_setting)
        rightText = settingView?.findViewById(R.id.tv_right)
        rightIcon = settingView?.findViewById(R.id.img_next)

        attrs ?: return

        //get resources
        val attributeSet = context.obtainStyledAttributes(attrs,R.styleable.BaseSetting)

        //设置左边的显示图
        val leftIcon = attributeSet.getDrawable(R.styleable.BaseSetting_settingLeftIcon)
        // 设置右边显示的文字
        val setRightText = attributeSet.getString(R.styleable.BaseSetting_settingRightText) ?: ""
        //是否显示右边文字 默认fasle
        val showRightText = attributeSet.getBoolean(R.styleable.BaseSetting_settingShowRightText,false)
        //是否显示右边图标 默认true
        val showRightIcon = attributeSet.getBoolean(R.styleable.BaseSetting_settingShowRightIcon,true)
        //设置主体显示的文字
        val setMenuText = attributeSet.getString(R.styleable.BaseSetting_menuText) ?: ""

        if (leftIcon != null)
            menuIcon?.setImageDrawable(leftIcon)

        rightText?.text = setRightText
        menuText?.text = setMenuText

        if (!showRightText)
            rightText?.visibility = View.GONE

        if (!showRightIcon)
            rightIcon?.visibility = View.GONE
    }
}