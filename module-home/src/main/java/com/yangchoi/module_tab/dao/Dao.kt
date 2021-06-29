package com.yangchoi.module_tab.dao

import androidx.room.*
import androidx.room.Dao

/**
 * Created on 2021/6/29
 * describe: dao
 */
@Dao
interface Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(searchHistoryEntity: SearchHistoryEntity): Long

    @Update
    fun update(searchHistoryEntitys: List<SearchHistoryEntity>): Int

    @Delete
    fun delete(deleteList: List<SearchHistoryEntity>)

    @Query("SELECT * FROM SEARCH_HISTORY WHERE user_id == :uid AND is_delete == :isdelete")
    fun getSearchHistory(uid:String,isdelete:Boolean):List<SearchHistoryEntity>
}