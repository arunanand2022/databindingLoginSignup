package com.evontech.twowaydatabindingloginsignup.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MyRoomDatabase_Impl extends MyRoomDatabase {
  private volatile UserDetailsDao _userDetailsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user_login_table` (`userId` INTEGER PRIMARY KEY AUTOINCREMENT, `userName` TEXT NOT NULL, `userPassword` TEXT NOT NULL, `userFirstName` TEXT, `userMiddleName` TEXT, `userLastName` TEXT, `userEmailId` TEXT, `userMobileNo` TEXT, `userCreateDate` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5ce02ccf8463dd79cb75ffe89f658597')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `user_login_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUserLoginTable = new HashMap<String, TableInfo.Column>(9);
        _columnsUserLoginTable.put("userId", new TableInfo.Column("userId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserLoginTable.put("userName", new TableInfo.Column("userName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserLoginTable.put("userPassword", new TableInfo.Column("userPassword", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserLoginTable.put("userFirstName", new TableInfo.Column("userFirstName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserLoginTable.put("userMiddleName", new TableInfo.Column("userMiddleName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserLoginTable.put("userLastName", new TableInfo.Column("userLastName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserLoginTable.put("userEmailId", new TableInfo.Column("userEmailId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserLoginTable.put("userMobileNo", new TableInfo.Column("userMobileNo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserLoginTable.put("userCreateDate", new TableInfo.Column("userCreateDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserLoginTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserLoginTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserLoginTable = new TableInfo("user_login_table", _columnsUserLoginTable, _foreignKeysUserLoginTable, _indicesUserLoginTable);
        final TableInfo _existingUserLoginTable = TableInfo.read(_db, "user_login_table");
        if (! _infoUserLoginTable.equals(_existingUserLoginTable)) {
          return new RoomOpenHelper.ValidationResult(false, "user_login_table(com.evontech.twowaydatabindingloginsignup.model.LoginSignupModel).\n"
                  + " Expected:\n" + _infoUserLoginTable + "\n"
                  + " Found:\n" + _existingUserLoginTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "5ce02ccf8463dd79cb75ffe89f658597", "ff839543f5a084a516575dd6dc38d2d1");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "user_login_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `user_login_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UserDetailsDao.class, UserDetailsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public UserDetailsDao loginSignupDao() {
    if (_userDetailsDao != null) {
      return _userDetailsDao;
    } else {
      synchronized(this) {
        if(_userDetailsDao == null) {
          _userDetailsDao = new UserDetailsDao_Impl(this);
        }
        return _userDetailsDao;
      }
    }
  }
}
