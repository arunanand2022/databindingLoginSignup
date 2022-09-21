package com.evontech.twowaydatabindingloginsignup.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "user_login_table")
data class LoginSignupModel(
    @PrimaryKey(autoGenerate = true)
    val userId : Long? = null,
    val userName : String,
    val userPassword : String,
    val userFirstName : String?=null,
    val userMiddleName : String?=null,
    val userLastName : String?=null,
    val userEmailId : String?=null,
    val userMobileNo : String?=null,
    val userCreateDate : String?=null
)