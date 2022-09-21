package com.evontech.twowaydatabindingloginsignup.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.evontech.twowaydatabindingloginsignup.model.LoginSignupModel

@Database(entities = [LoginSignupModel::class], version = 1)
abstract class MyRoomDatabase:RoomDatabase() {

    abstract fun loginSignupDao():UserDetailsDao

    companion object{
        private var INSTANCE : MyRoomDatabase?=null

        fun getDbInstance(context: Context):MyRoomDatabase{
            val tempInstance = INSTANCE
            if(tempInstance !=null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,MyRoomDatabase::class.java,"login_signup_database").build()
                INSTANCE = instance
                return instance
            }
        }
    }
}