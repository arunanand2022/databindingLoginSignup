package com.evontech.twowaydatabindingloginsignup.database;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.evontech.twowaydatabindingloginsignup.model.LoginSignupModel;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDetailsDao_Impl implements UserDetailsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LoginSignupModel> __insertionAdapterOfLoginSignupModel;

  public UserDetailsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLoginSignupModel = new EntityInsertionAdapter<LoginSignupModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `user_login_table` (`userId`,`userName`,`userPassword`,`userFirstName`,`userMiddleName`,`userLastName`,`userEmailId`,`userMobileNo`,`userCreateDate`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LoginSignupModel value) {
        if (value.getUserId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUserId());
        }
        if (value.getUserName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserName());
        }
        if (value.getUserPassword() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUserPassword());
        }
        if (value.getUserFirstName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUserFirstName());
        }
        if (value.getUserMiddleName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUserMiddleName());
        }
        if (value.getUserLastName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUserLastName());
        }
        if (value.getUserEmailId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUserEmailId());
        }
        if (value.getUserMobileNo() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUserMobileNo());
        }
        if (value.getUserCreateDate() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getUserCreateDate());
        }
      }
    };
  }

  @Override
  public void signupUser(final LoginSignupModel loginSignupModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLoginSignupModel.insert(loginSignupModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LoginSignupModel loginUser(final String userName) {
    final String _sql = "Select * from user_login_table Where userName =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userName);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
      final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "userName");
      final int _cursorIndexOfUserPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "userPassword");
      final int _cursorIndexOfUserFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "userFirstName");
      final int _cursorIndexOfUserMiddleName = CursorUtil.getColumnIndexOrThrow(_cursor, "userMiddleName");
      final int _cursorIndexOfUserLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "userLastName");
      final int _cursorIndexOfUserEmailId = CursorUtil.getColumnIndexOrThrow(_cursor, "userEmailId");
      final int _cursorIndexOfUserMobileNo = CursorUtil.getColumnIndexOrThrow(_cursor, "userMobileNo");
      final int _cursorIndexOfUserCreateDate = CursorUtil.getColumnIndexOrThrow(_cursor, "userCreateDate");
      final LoginSignupModel _result;
      if(_cursor.moveToFirst()) {
        final Long _tmpUserId;
        if (_cursor.isNull(_cursorIndexOfUserId)) {
          _tmpUserId = null;
        } else {
          _tmpUserId = _cursor.getLong(_cursorIndexOfUserId);
        }
        final String _tmpUserName;
        if (_cursor.isNull(_cursorIndexOfUserName)) {
          _tmpUserName = null;
        } else {
          _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
        }
        final String _tmpUserPassword;
        if (_cursor.isNull(_cursorIndexOfUserPassword)) {
          _tmpUserPassword = null;
        } else {
          _tmpUserPassword = _cursor.getString(_cursorIndexOfUserPassword);
        }
        final String _tmpUserFirstName;
        if (_cursor.isNull(_cursorIndexOfUserFirstName)) {
          _tmpUserFirstName = null;
        } else {
          _tmpUserFirstName = _cursor.getString(_cursorIndexOfUserFirstName);
        }
        final String _tmpUserMiddleName;
        if (_cursor.isNull(_cursorIndexOfUserMiddleName)) {
          _tmpUserMiddleName = null;
        } else {
          _tmpUserMiddleName = _cursor.getString(_cursorIndexOfUserMiddleName);
        }
        final String _tmpUserLastName;
        if (_cursor.isNull(_cursorIndexOfUserLastName)) {
          _tmpUserLastName = null;
        } else {
          _tmpUserLastName = _cursor.getString(_cursorIndexOfUserLastName);
        }
        final String _tmpUserEmailId;
        if (_cursor.isNull(_cursorIndexOfUserEmailId)) {
          _tmpUserEmailId = null;
        } else {
          _tmpUserEmailId = _cursor.getString(_cursorIndexOfUserEmailId);
        }
        final String _tmpUserMobileNo;
        if (_cursor.isNull(_cursorIndexOfUserMobileNo)) {
          _tmpUserMobileNo = null;
        } else {
          _tmpUserMobileNo = _cursor.getString(_cursorIndexOfUserMobileNo);
        }
        final String _tmpUserCreateDate;
        if (_cursor.isNull(_cursorIndexOfUserCreateDate)) {
          _tmpUserCreateDate = null;
        } else {
          _tmpUserCreateDate = _cursor.getString(_cursorIndexOfUserCreateDate);
        }
        _result = new LoginSignupModel(_tmpUserId,_tmpUserName,_tmpUserPassword,_tmpUserFirstName,_tmpUserMiddleName,_tmpUserLastName,_tmpUserEmailId,_tmpUserMobileNo,_tmpUserCreateDate);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LoginSignupModel getUsername(final String userName) {
    final String _sql = "SELECT * FROM user_login_table WHERE userName =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userName);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
      final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "userName");
      final int _cursorIndexOfUserPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "userPassword");
      final int _cursorIndexOfUserFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "userFirstName");
      final int _cursorIndexOfUserMiddleName = CursorUtil.getColumnIndexOrThrow(_cursor, "userMiddleName");
      final int _cursorIndexOfUserLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "userLastName");
      final int _cursorIndexOfUserEmailId = CursorUtil.getColumnIndexOrThrow(_cursor, "userEmailId");
      final int _cursorIndexOfUserMobileNo = CursorUtil.getColumnIndexOrThrow(_cursor, "userMobileNo");
      final int _cursorIndexOfUserCreateDate = CursorUtil.getColumnIndexOrThrow(_cursor, "userCreateDate");
      final LoginSignupModel _result;
      if(_cursor.moveToFirst()) {
        final Long _tmpUserId;
        if (_cursor.isNull(_cursorIndexOfUserId)) {
          _tmpUserId = null;
        } else {
          _tmpUserId = _cursor.getLong(_cursorIndexOfUserId);
        }
        final String _tmpUserName;
        if (_cursor.isNull(_cursorIndexOfUserName)) {
          _tmpUserName = null;
        } else {
          _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
        }
        final String _tmpUserPassword;
        if (_cursor.isNull(_cursorIndexOfUserPassword)) {
          _tmpUserPassword = null;
        } else {
          _tmpUserPassword = _cursor.getString(_cursorIndexOfUserPassword);
        }
        final String _tmpUserFirstName;
        if (_cursor.isNull(_cursorIndexOfUserFirstName)) {
          _tmpUserFirstName = null;
        } else {
          _tmpUserFirstName = _cursor.getString(_cursorIndexOfUserFirstName);
        }
        final String _tmpUserMiddleName;
        if (_cursor.isNull(_cursorIndexOfUserMiddleName)) {
          _tmpUserMiddleName = null;
        } else {
          _tmpUserMiddleName = _cursor.getString(_cursorIndexOfUserMiddleName);
        }
        final String _tmpUserLastName;
        if (_cursor.isNull(_cursorIndexOfUserLastName)) {
          _tmpUserLastName = null;
        } else {
          _tmpUserLastName = _cursor.getString(_cursorIndexOfUserLastName);
        }
        final String _tmpUserEmailId;
        if (_cursor.isNull(_cursorIndexOfUserEmailId)) {
          _tmpUserEmailId = null;
        } else {
          _tmpUserEmailId = _cursor.getString(_cursorIndexOfUserEmailId);
        }
        final String _tmpUserMobileNo;
        if (_cursor.isNull(_cursorIndexOfUserMobileNo)) {
          _tmpUserMobileNo = null;
        } else {
          _tmpUserMobileNo = _cursor.getString(_cursorIndexOfUserMobileNo);
        }
        final String _tmpUserCreateDate;
        if (_cursor.isNull(_cursorIndexOfUserCreateDate)) {
          _tmpUserCreateDate = null;
        } else {
          _tmpUserCreateDate = _cursor.getString(_cursorIndexOfUserCreateDate);
        }
        _result = new LoginSignupModel(_tmpUserId,_tmpUserName,_tmpUserPassword,_tmpUserFirstName,_tmpUserMiddleName,_tmpUserLastName,_tmpUserEmailId,_tmpUserMobileNo,_tmpUserCreateDate);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
