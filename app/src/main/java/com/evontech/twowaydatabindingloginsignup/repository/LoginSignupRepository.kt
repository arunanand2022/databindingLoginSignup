package com.evontech.twowaydatabindingloginsignup.repository

import androidx.lifecycle.LiveData
import com.evontech.twowaydatabindingloginsignup.database.UserDetailsDao
import com.evontech.twowaydatabindingloginsignup.model.LoginSignupModel

class LoginSignupRepository(val userDetailsDao: UserDetailsDao) {

    suspend fun signupUserDetails(loginSignupModel: LoginSignupModel){
        return userDetailsDao.signupUser(loginSignupModel)
    }

    suspend fun loginuser(loginSignupModel: LoginSignupModel):LoginSignupModel{
        return userDetailsDao.loginUser(loginSignupModel.userName)
    }
    suspend fun getUsername(loginSignupModel: LoginSignupModel):LoginSignupModel{
        return userDetailsDao.getUsername(loginSignupModel.userName)
    }
}