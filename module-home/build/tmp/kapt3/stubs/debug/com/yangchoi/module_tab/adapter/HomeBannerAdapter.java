package com.yangchoi.module_tab.adapter;

import java.lang.System;

/**
 * Created on 2021/6/24
 * describe:
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u00a2\u0006\u0002\u0010\bJ0\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001e\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/yangchoi/module_tab/adapter/HomeBannerAdapter;", "Lcom/youth/banner/adapter/BannerAdapter;", "Lcom/yangchoi/lib_network/entity/BannerEntity;", "Lcom/yangchoi/module_tab/adapter/HomeBannerAdapter$BannerViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "(Landroid/content/Context;Ljava/util/List;)V", "onBindView", "", "holder", "data", "position", "", "size", "onCreateHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BannerViewHolder", "module-home_debug"})
public final class HomeBannerAdapter extends com.youth.banner.adapter.BannerAdapter<com.yangchoi.lib_network.entity.BannerEntity, com.yangchoi.module_tab.adapter.HomeBannerAdapter.BannerViewHolder> {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.yangchoi.module_tab.adapter.HomeBannerAdapter.BannerViewHolder onCreateHolder(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindView(@org.jetbrains.annotations.Nullable()
    com.yangchoi.module_tab.adapter.HomeBannerAdapter.BannerViewHolder holder, @org.jetbrains.annotations.Nullable()
    com.yangchoi.lib_network.entity.BannerEntity data, int position, int size) {
    }
    
    public HomeBannerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yangchoi.lib_network.entity.BannerEntity> dataList) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/yangchoi/module_tab/adapter/HomeBannerAdapter$BannerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/widget/ImageView;", "(Lcom/yangchoi/module_tab/adapter/HomeBannerAdapter;Landroid/widget/ImageView;)V", "imageView", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "module-home_debug"})
    public final class BannerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imageView;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImageView() {
            return null;
        }
        
        public final void setImageView(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        public BannerViewHolder(@org.jetbrains.annotations.NotNull()
        @androidx.annotation.NonNull()
        android.widget.ImageView view) {
            super(null);
        }
    }
}