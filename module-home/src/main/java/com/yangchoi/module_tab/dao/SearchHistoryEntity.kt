package com.yangchoi.module_tab.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

/**
 * Created on 2021/6/29
 * describe:搜索历史
 */
@Entity(tableName = "search_history",indices = [Index("user_id","is_delete")])
data class SearchHistoryEntity @JvmOverloads constructor(
    //字段id
    @ColumnInfo(name = "id")
    @SerializedName("id")
    @PrimaryKey(autoGenerate = false)
    val id:String,

    //用户id
    @ColumnInfo(name = "user_id")
    @SerializedName("user_id")
    val user_id:String,

    //是否删除
    @ColumnInfo(name = "is_delete")
    @SerializedName("is_delete")
    var is_delete:Boolean = false,

    //搜索内容
    @ColumnInfo(name = "content")
    @SerializedName("content")
    val content:String,

    //搜索时间
    @ColumnInfo(name = "date_time")
    @SerializedName("date_time")
    val date_time:String

)