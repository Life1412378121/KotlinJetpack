package com.yangchoi.module_tab.utils

import android.content.Context
import android.util.Log
import com.yangchoi.module_tab.dao.SearchHistoryEntity
import com.yangchoi.module_tab.dao.db
import kotlin.concurrent.thread

/**
 * Created on 2021/6/29
 * describe:数据库操作类
 */
object DaoUtil {

    val TAG = "DaoUtilTAG"

    fun insertToDataBase(context: Context,searchHistoryEntity: SearchHistoryEntity){
        thread {
            val db = context.db
            db.dao.insert(searchHistoryEntity)
            db.runInTransaction {
                val id = db.dao.insert(searchHistoryEntity)
                Log.e(TAG,"insert:$id")
            }
        }
    }

    fun updateDataBase(context: Context,userId: String,isDelete: Boolean){
        thread {
            val db = context.db
            val dao = db.dao
            val historyList =  dao.getSearchHistory(userId,isDelete)
            historyList.forEach {
                //id  是否在返回的数据里面有
//            it.is_delete = it.id in ids
                it.is_delete = true
            }
            val update = db.dao.update(historyList)
            Log.e(TAG,"update:$update")
            dao.delete(historyList)
        }
    }

    fun querySearchList(context: Context,userId:String,isDelete:Boolean = false):List<SearchHistoryEntity>?{
        var dataList:List<SearchHistoryEntity>? = null
        thread {
            val dao = context.db.dao
            dataList = dao.getSearchHistory(userId,isDelete)
        }
        return dataList
    }

}