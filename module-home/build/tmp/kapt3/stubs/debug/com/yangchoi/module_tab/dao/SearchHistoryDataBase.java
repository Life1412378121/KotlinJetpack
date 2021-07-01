package com.yangchoi.module_tab.dao;

import java.lang.System;

/**
 * Created on 2021/6/29
 * describe:
 */
@androidx.room.Database(entities = {com.yangchoi.module_tab.dao.SearchHistoryEntity.class}, exportSchema = false, version = 1)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/yangchoi/module_tab/dao/SearchHistoryDataBase;", "Landroidx/room/RoomDatabase;", "()V", "dao", "Lcom/yangchoi/module_tab/dao/Dao;", "getDao", "()Lcom/yangchoi/module_tab/dao/Dao;", "module-home_debug"})
public abstract class SearchHistoryDataBase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.yangchoi.module_tab.dao.Dao getDao();
    
    public SearchHistoryDataBase() {
        super();
    }
}