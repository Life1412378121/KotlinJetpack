package com.yangchoi.module_tab.utils;

import java.lang.System;

/**
 * Created on 2021/6/29
 * describe:数据库操作类
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/yangchoi/module_tab/utils/DaoUtil;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "insertToDataBase", "", "context", "Landroid/content/Context;", "searchHistoryEntity", "Lcom/yangchoi/module_tab/dao/SearchHistoryEntity;", "querySearchList", "", "userId", "isDelete", "", "updateDataBase", "module-home_debug"})
public final class DaoUtil {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "DaoUtilTAG";
    @org.jetbrains.annotations.NotNull()
    public static final com.yangchoi.module_tab.utils.DaoUtil INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final void insertToDataBase(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.yangchoi.module_tab.dao.SearchHistoryEntity searchHistoryEntity) {
    }
    
    public final void updateDataBase(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, boolean isDelete) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yangchoi.module_tab.dao.SearchHistoryEntity> querySearchList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, boolean isDelete) {
        return null;
    }
    
    private DaoUtil() {
        super();
    }
}