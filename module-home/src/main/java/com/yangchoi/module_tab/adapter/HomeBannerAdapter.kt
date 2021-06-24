package com.yangchoi.module_tab.adapter

import android.content.Context
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yangchoi.lib_network.entity.BannerEntity
import com.youth.banner.adapter.BannerAdapter


/**
 * Created on 2021/6/24
 * describe:
 */
class HomeBannerAdapter(private val context:Context,dataList:MutableList<BannerEntity>)
    : BannerAdapter<BannerEntity,HomeBannerAdapter.BannerViewHolder>(dataList) {

    inner class BannerViewHolder(@NonNull view: ImageView) :
        RecyclerView.ViewHolder(view) {
        var imageView: ImageView

        init {
            imageView = view
        }
    }

    override fun onCreateHolder(parent: ViewGroup?, viewType: Int): BannerViewHolder {
        val imageView = ImageView(parent!!.context)
        //注意，必须设置为match_parent，这个是viewpager2强制要求的
        imageView.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        return BannerViewHolder(imageView)
    }

    override fun onBindView(holder: BannerViewHolder?, data: BannerEntity?, position: Int, size: Int) {
        Glide.with(context)
            .load(data?.imagePath)
            .into(holder?.imageView!!)
    }
}