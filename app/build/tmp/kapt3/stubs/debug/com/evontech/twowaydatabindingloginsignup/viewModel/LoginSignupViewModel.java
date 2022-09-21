package com.evontech.twowaydatabindingloginsignup.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u000e\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020 2\u0006\u0010#\u001a\u00020$R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/evontech/twowaydatabindingloginsignup/viewModel/LoginSignupViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_navigatetoHome", "Landroidx/lifecycle/MutableLiveData;", "", "_navigatetoLogin", "inputCnfPassword", "", "getInputCnfPassword", "()Landroidx/lifecycle/MutableLiveData;", "inputEmail", "getInputEmail", "inputMobile", "getInputMobile", "inputName", "getInputName", "inputPassword", "getInputPassword", "inputUserName", "getInputUserName", "navigatetoHome", "Landroidx/lifecycle/LiveData;", "getNavigatetoHome", "()Landroidx/lifecycle/LiveData;", "navigatetoLogin", "getNavigatetoLogin", "repository", "Lcom/evontech/twowaydatabindingloginsignup/repository/LoginSignupRepository;", "doneNavigatingToHome", "", "doneNavigatingToLogin", "login", "view", "Landroid/view/View;", "signup", "app_debug"})
public final class LoginSignupViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> inputName = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> inputEmail = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> inputMobile = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> inputUserName = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> inputPassword = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> inputCnfPassword = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigatetoLogin = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigatetoHome = null;
    private final com.evontech.twowaydatabindingloginsignup.repository.LoginSignupRepository repository = null;
    
    public LoginSignupViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getInputName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getInputEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getInputMobile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getInputUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getInputPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getInputCnfPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigatetoLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigatetoHome() {
        return null;
    }
    
    public final void signup(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void doneNavigatingToLogin() {
    }
    
    public final void doneNavigatingToHome() {
    }
}