package com.yangchoi.module_tab.ui.activity;

import java.lang.System;

/**
 * Created on 2021/6/23
 * describe:
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u0016\u0010\u001c\u001a\u00020\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/yangchoi/module_tab/ui/activity/SearchActivity;", "Lcom/yangchoi/lib_base/base/BaseActivity;", "Lcom/yangchoi/module_tab/viewmodel/SearchActivityVM;", "Lcom/yangchoi/module_tab/databinding/ActivitySearchBinding;", "()V", "historyAdapter", "Lcom/yangchoi/module_tab/adapter/HistoryAdapter;", "hotKeyAdapter", "Lcom/yangchoi/module_tab/adapter/HotKeyAdapter;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager$delegate", "Lkotlin/Lazy;", "linearLayoutManager2", "getLinearLayoutManager2", "linearLayoutManager2$delegate", "newHandler", "Landroid/os/Handler;", "newRunnable", "Ljava/lang/Runnable;", "getHistory", "", "isNewData", "", "initClick", "initData", "initHotKey", "data", "", "Lcom/yangchoi/lib_network/entity/HotKeyEntity;", "initVM", "initView", "module-home_debug"})
public final class SearchActivity extends com.yangchoi.lib_base.base.BaseActivity<com.yangchoi.module_tab.viewmodel.SearchActivityVM, com.yangchoi.module_tab.databinding.ActivitySearchBinding> {
    private final kotlin.Lazy linearLayoutManager$delegate = null;
    private final kotlin.Lazy linearLayoutManager2$delegate = null;
    private com.yangchoi.module_tab.adapter.HotKeyAdapter hotKeyAdapter;
    private com.yangchoi.module_tab.adapter.HistoryAdapter historyAdapter;
    private final android.os.Handler newHandler = null;
    private final java.lang.Runnable newRunnable = null;
    
    private final androidx.recyclerview.widget.LinearLayoutManager getLinearLayoutManager() {
        return null;
    }
    
    private final androidx.recyclerview.widget.LinearLayoutManager getLinearLayoutManager2() {
        return null;
    }
    
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
    public void initVM() {
    }
    
    private final void initHotKey(java.util.List<com.yangchoi.lib_network.entity.HotKeyEntity> data) {
    }
    
    private final void getHistory(boolean isNewData) {
    }
    
    public SearchActivity() {
        super();
    }
}