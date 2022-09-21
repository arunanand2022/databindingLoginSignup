package com.evontech.twowaydatabindingloginsignup.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\'\u00a8\u0006\n"}, d2 = {"Lcom/evontech/twowaydatabindingloginsignup/database/UserDetailsDao;", "", "getUsername", "Lcom/evontech/twowaydatabindingloginsignup/model/LoginSignupModel;", "userName", "", "loginUser", "signupUser", "", "loginSignupModel", "app_debug"})
public abstract interface UserDetailsDao {
    
    @androidx.room.Insert()
    public abstract void signupUser(@org.jetbrains.annotations.NotNull()
    com.evontech.twowaydatabindingloginsignup.model.LoginSignupModel loginSignupModel);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from user_login_table Where userName =:userName")
    public abstract com.evontech.twowaydatabindingloginsignup.model.LoginSignupModel loginUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userName);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user_login_table WHERE userName =:userName")
    public abstract com.evontech.twowaydatabindingloginsignup.model.LoginSignupModel getUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String userName);
}