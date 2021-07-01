package com.yangchoi.module_tab.adapter;

import java.lang.System;

/**
 * Created on 2021/6/25
 * describe:
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\u0010\bJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u00a2\u0006\u0002\b\u001eR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/yangchoi/module_tab/adapter/HotKeyAdapter;", "Lcom/yangchoi/lib_base/base/BaseAdapter;", "Lcom/yangchoi/module_tab/databinding/ItemHotKeyBinding;", "Lcom/yangchoi/lib_network/entity/HotKeyEntity;", "context", "Landroid/app/Activity;", "dataList", "", "(Landroid/app/Activity;Ljava/util/List;)V", "mFlexItemTextViewCaches", "Ljava/util/Queue;", "Landroid/widget/TextView;", "mInflater", "Landroid/view/LayoutInflater;", "onMenuItemClickListener", "Lcom/yangchoi/module_tab/adapter/HotKeyAdapter$MenuItemClickListener;", "convert", "", "v", "t", "position", "", "createFlexItemTextView", "fbl", "Lcom/google/android/flexbox/FlexboxLayout;", "createOrGetCacheFlexItemTextView", "onViewRecycled", "holder", "Lcom/yangchoi/lib_base/base/BaseViewHolder;", "setOnMenuItemClickListener", "setOnMenuItemClickListener$module_home_debug", "MenuItemClickListener", "module-home_debug"})
public final class HotKeyAdapter extends com.yangchoi.lib_base.base.BaseAdapter<com.yangchoi.module_tab.databinding.ItemHotKeyBinding, com.yangchoi.lib_network.entity.HotKeyEntity> {
    private android.view.LayoutInflater mInflater;
    private final java.util.Queue<android.widget.TextView> mFlexItemTextViewCaches = null;
    private com.yangchoi.module_tab.adapter.HotKeyAdapter.MenuItemClickListener onMenuItemClickListener;
    private final java.util.List<com.yangchoi.lib_network.entity.HotKeyEntity> dataList = null;
    
    public final void setOnMenuItemClickListener$module_home_debug(@org.jetbrains.annotations.NotNull()
    com.yangchoi.module_tab.adapter.HotKeyAdapter.MenuItemClickListener onMenuItemClickListener) {
    }
    
    @java.lang.Override()
    public void convert(@org.jetbrains.annotations.NotNull()
    com.yangchoi.module_tab.databinding.ItemHotKeyBinding v, @org.jetbrains.annotations.NotNull()
    com.yangchoi.lib_network.entity.HotKeyEntity t, int position) {
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    com.yangchoi.lib_base.base.BaseViewHolder holder) {
    }
    
    private final android.widget.TextView createOrGetCacheFlexItemTextView(com.google.android.flexbox.FlexboxLayout fbl) {
        return null;
    }
    
    private final android.widget.TextView createFlexItemTextView(com.google.android.flexbox.FlexboxLayout fbl) {
        return null;
    }
    
    public HotKeyAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yangchoi.lib_network.entity.HotKeyEntity> dataList) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/yangchoi/module_tab/adapter/HotKeyAdapter$MenuItemClickListener;", "", "onMenuItemClick", "", "dataBean", "Lcom/yangchoi/lib_network/entity/HotKeyEntity;", "menuPosition", "", "module-home_debug"})
    public static abstract interface MenuItemClickListener {
        
        public abstract void onMenuItemClick(@org.jetbrains.annotations.NotNull()
        com.yangchoi.lib_network.entity.HotKeyEntity dataBean, int menuPosition);
    }
}