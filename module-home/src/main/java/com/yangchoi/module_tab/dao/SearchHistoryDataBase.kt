package com.yangchoi.module_tab.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yangchoi.lib_base.base.BaseApplication

/**
 * Created on 2021/6/29
 * describe:
 */
@Database(entities = [SearchHistoryEntity::class],exportSchema = false,version = 1)
abstract class SearchHistoryDataBase : RoomDatabase(){
    abstract val dao:Dao
}

@Volatile
private var dbInstance: SearchHistoryDataBase? = null

val Context.db: SearchHistoryDataBase
    get() {
        if (dbInstance == null){
            synchronized(SearchHistoryDataBase::class) {
                if (dbInstance == null) {
                    val ctx = BaseApplication.context
                    dbInstance = Room
                        .databaseBuilder(ctx, SearchHistoryDataBase::class.java, "search")
                        .build()
                }
            }
        }
        return dbInstance!!
    }