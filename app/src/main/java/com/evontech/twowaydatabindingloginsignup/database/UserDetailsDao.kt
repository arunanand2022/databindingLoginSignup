package com.evontech.twowaydatabindingloginsignup.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.evontech.twowaydatabindingloginsignup.model.LoginSignupModel

@Dao
interface UserDetailsDao {

    @Insert
    fun signupUser(loginSignupModel: LoginSignupModel)

    @Query("Select * from user_login_table Where userName =:userName")
    fun loginUser(userName: String):LoginSignupModel

    @Query("SELECT * FROM user_login_table WHERE userName =:userName")
    fun getUsername(userName: String): LoginSignupModel
}