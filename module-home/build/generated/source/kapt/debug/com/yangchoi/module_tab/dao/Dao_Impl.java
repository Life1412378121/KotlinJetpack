package com.yangchoi.module_tab.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Dao_Impl implements Dao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SearchHistoryEntity> __insertionAdapterOfSearchHistoryEntity;

  private final EntityDeletionOrUpdateAdapter<SearchHistoryEntity> __deletionAdapterOfSearchHistoryEntity;

  private final EntityDeletionOrUpdateAdapter<SearchHistoryEntity> __updateAdapterOfSearchHistoryEntity;

  public Dao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSearchHistoryEntity = new EntityInsertionAdapter<SearchHistoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `search_history` (`id`,`user_id`,`is_delete`,`content`,`date_time`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SearchHistoryEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getUser_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUser_id());
        }
        final int _tmp;
        _tmp = value.is_delete() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getContent() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContent());
        }
        if (value.getDate_time() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDate_time());
        }
      }
    };
    this.__deletionAdapterOfSearchHistoryEntity = new EntityDeletionOrUpdateAdapter<SearchHistoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `search_history` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SearchHistoryEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfSearchHistoryEntity = new EntityDeletionOrUpdateAdapter<SearchHistoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `search_history` SET `id` = ?,`user_id` = ?,`is_delete` = ?,`content` = ?,`date_time` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SearchHistoryEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getUser_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUser_id());
        }
        final int _tmp;
        _tmp = value.is_delete() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getContent() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContent());
        }
        if (value.getDate_time() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDate_time());
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getId());
        }
      }
    };
  }

  @Override
  public long insert(final SearchHistoryEntity searchHistoryEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSearchHistoryEntity.insertAndReturnId(searchHistoryEntity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final List<SearchHistoryEntity> deleteList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfSearchHistoryEntity.handleMultiple(deleteList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final List<SearchHistoryEntity> searchHistoryEntitys) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfSearchHistoryEntity.handleMultiple(searchHistoryEntitys);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<SearchHistoryEntity> getSearchHistory(final String uid, final boolean isdelete) {
    final String _sql = "SELECT * FROM SEARCH_HISTORY WHERE user_id == ? AND is_delete == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (uid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, uid);
    }
    _argIndex = 2;
    final int _tmp;
    _tmp = isdelete ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
      final int _cursorIndexOfIsDelete = CursorUtil.getColumnIndexOrThrow(_cursor, "is_delete");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "date_time");
      final List<SearchHistoryEntity> _result = new ArrayList<SearchHistoryEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SearchHistoryEntity _item;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpUser_id;
        _tmpUser_id = _cursor.getString(_cursorIndexOfUserId);
        final boolean _tmpIs_delete;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsDelete);
        _tmpIs_delete = _tmp_1 != 0;
        final String _tmpContent;
        _tmpContent = _cursor.getString(_cursorIndexOfContent);
        final String _tmpDate_time;
        _tmpDate_time = _cursor.getString(_cursorIndexOfDateTime);
        _item = new SearchHistoryEntity(_tmpId,_tmpUser_id,_tmpIs_delete,_tmpContent,_tmpDate_time);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
