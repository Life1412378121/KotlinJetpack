package com.yangchoi.module_tab.viewmodel;

import java.lang.System;

/**
 * Created on 2021/6/23
 * describe:
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0010R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/yangchoi/module_tab/viewmodel/HomeFragmentVM;", "Lcom/yangchoi/lib_base/base/BaseViewModel;", "()V", "articlesData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/yangchoi/lib_network/entity/ArticleListBean;", "getArticlesData", "()Landroidx/lifecycle/MutableLiveData;", "setArticlesData", "(Landroidx/lifecycle/MutableLiveData;)V", "bannerData", "", "Lcom/yangchoi/lib_network/entity/BannerEntity;", "getBannerData", "setBannerData", "getArticListData", "", "page", "", "isShowLoading", "", "getBannerList", "module-home_debug"})
public final class HomeFragmentVM extends com.yangchoi.lib_base.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.yangchoi.lib_network.entity.ArticleListBean> articlesData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.yangchoi.lib_network.entity.BannerEntity>> bannerData;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.yangchoi.lib_network.entity.ArticleListBean> getArticlesData() {
        return null;
    }
    
    public final void setArticlesData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.yangchoi.lib_network.entity.ArticleListBean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.yangchoi.lib_network.entity.BannerEntity>> getBannerData() {
        return null;
    }
    
    public final void setBannerData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.yangchoi.lib_network.entity.BannerEntity>> p0) {
    }
    
    public final void getArticListData(int page, boolean isShowLoading) {
    }
    
    public final void getBannerList() {
    }
    
    public HomeFragmentVM() {
        super();
    }
}