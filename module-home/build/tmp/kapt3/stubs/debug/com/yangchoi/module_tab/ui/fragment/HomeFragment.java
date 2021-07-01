package com.yangchoi.module_tab.ui.fragment;

import java.lang.System;

/**
 * Created on 2021/6/23
 * describe:
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u0016\u0010\u0018\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\u0012\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/yangchoi/module_tab/ui/fragment/HomeFragment;", "Lcom/yangchoi/lib_base/base/BaseFragment;", "Lcom/yangchoi/module_tab/viewmodel/HomeFragmentVM;", "Lcom/yangchoi/module_tab/databinding/FragmentHomeBinding;", "Landroid/view/View$OnClickListener;", "()V", "bannerList", "", "Lcom/yangchoi/lib_network/entity/BannerEntity;", "dataBean", "Lcom/yangchoi/lib_network/entity/ArticleListBean;", "homeArticleAdapter", "Lcom/yangchoi/module_tab/adapter/HomeArticleAdapter;", "homeBannerAdapter", "Lcom/yangchoi/module_tab/adapter/HomeBannerAdapter;", "list", "Lcom/yangchoi/lib_network/entity/ArticleBean;", "page", "", "initBanner", "", "data", "initClick", "initData", "initHomeArticle", "initVM", "initView", "lazyLoadData", "onClick", "v", "Landroid/view/View;", "module-home_debug"})
public final class HomeFragment extends com.yangchoi.lib_base.base.BaseFragment<com.yangchoi.module_tab.viewmodel.HomeFragmentVM, com.yangchoi.module_tab.databinding.FragmentHomeBinding> implements android.view.View.OnClickListener {
    private com.yangchoi.module_tab.adapter.HomeArticleAdapter homeArticleAdapter;
    private com.yangchoi.module_tab.adapter.HomeBannerAdapter homeBannerAdapter;
    private int page = 0;
    private java.util.List<com.yangchoi.lib_network.entity.ArticleBean> list;
    private com.yangchoi.lib_network.entity.ArticleListBean dataBean;
    private java.util.List<com.yangchoi.lib_network.entity.BannerEntity> bannerList;
    
    /**
     * 拿到接口返回的值
     */
    @java.lang.Override()
    public void initVM() {
    }
    
    /**
     * 获取接口数据
     */
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void initClick() {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void lazyLoadData() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void initHomeArticle(java.util.List<com.yangchoi.lib_network.entity.ArticleBean> data) {
    }
    
    private final void initBanner(java.util.List<com.yangchoi.lib_network.entity.BannerEntity> data) {
    }
    
    public HomeFragment() {
        super();
    }
}