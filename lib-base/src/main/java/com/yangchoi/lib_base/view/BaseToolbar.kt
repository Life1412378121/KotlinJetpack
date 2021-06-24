package com.yangchoi.lib_base.view

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.yangchoi.lib_base.R

/**
 * Created on 2021/6/24
 * describe: 自定义标题栏布局
 */
class BaseToolbar : LinearLayout {

    private var view:View? = null
    private var rightClickCallback:(()-> Unit)? = null

    private var btnBack:ImageView? = null
    private var rightIcon:ImageView? = null
    private var titleText:TextView? = null

    constructor(context: Context) : super(context){
        initView(context)
    }
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs){
        initView(context,attrs)
    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr){
        initView(context,attrs)
    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes){
        initView(context,attrs)
    }

    @SuppressLint("Recycle")
    private fun initView(context: Context, attrs: AttributeSet? = null){
        view = View.inflate(context, R.layout.base_toolbar,this)

        btnBack = view?.findViewById<ImageView>(R.id.btnBack)
        rightIcon = view?.findViewById<ImageView>(R.id.imgRight)
        titleText = view?.findViewById<TextView>(R.id.toolbar_title)


        attrs ?: return

        val attributes = context.obtainStyledAttributes(attrs,R.styleable.BaseToolbar)

        //是否显示返回按钮 默认是显示
        val showLeftIcon = attributes.getBoolean(R.styleable.BaseToolbar_showLeftIcon,true)
        //是否显示标题文字 默认是显示
        val showTitleText = attributes.getBoolean(R.styleable.BaseToolbar_showTitleText,true)
        //是否显示右边图片 默认不显示
        val showRightIcon = attributes.getBoolean(R.styleable.BaseToolbar_showRightIcon,false)
        //设置文字
        val setTitleText = attributes.getString(R.styleable.BaseToolbar_setTitleText) ?: ""

        //是否显示
        if (!showLeftIcon){
            btnBack?.visibility = View.GONE
        }
        if (!showRightIcon){
            rightIcon?.visibility = View.GONE
        }
        if (!showTitleText){
            titleText?.visibility = View.GONE
        }

        //设置值
        titleText?.text = setTitleText

        //点击事件
        btnBack?.setOnClickListener {
            (context as Activity).finish()
        }
    }
    /**
     * 右边按钮点击事件回调
     * */
    fun rightClickListener(clickListener:(()-> Unit)? = null){
        this.rightClickCallback = clickListener
    }
    /**
     * 控制右边按钮显示或者隐藏
     * */
    fun setVisibilityOfRightIcon(show:Boolean){
        when(show){
            true -> rightIcon?.visibility = View.VISIBLE
            false -> rightIcon?.visibility = View.GONE
        }
    }
    /**
     * 设置标题
     * */
    fun setTitleText(title:String){
        titleText?.text = title
    }
}