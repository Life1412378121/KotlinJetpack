package com.yangchoi.module_tab.dao;

import java.lang.System;

/**
 * Created on 2021/6/29
 * describe: dao
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\'J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/yangchoi/module_tab/dao/Dao;", "", "delete", "", "deleteList", "", "Lcom/yangchoi/module_tab/dao/SearchHistoryEntity;", "getSearchHistory", "uid", "", "isdelete", "", "insert", "", "searchHistoryEntity", "update", "", "searchHistoryEntitys", "module-home_debug"})
public abstract interface Dao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.yangchoi.module_tab.dao.SearchHistoryEntity searchHistoryEntity);
    
    @androidx.room.Update()
    public abstract int update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yangchoi.module_tab.dao.SearchHistoryEntity> searchHistoryEntitys);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yangchoi.module_tab.dao.SearchHistoryEntity> deleteList);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM SEARCH_HISTORY WHERE user_id == :uid AND is_delete == :isdelete")
    public abstract java.util.List<com.yangchoi.module_tab.dao.SearchHistoryEntity> getSearchHistory(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, boolean isdelete);
}