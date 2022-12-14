// Generated by data binding compiler. Do not edit!
package com.evontech.twowaydatabindingloginsignup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.evontech.twowaydatabindingloginsignup.R;
import com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentRegistrationBinding extends ViewDataBinding {
  @NonNull
  public final Button btnSignUp;

  @NonNull
  public final EditText etCnfPassword;

  @NonNull
  public final EditText etEmailid;

  @NonNull
  public final EditText etFullName;

  @NonNull
  public final EditText etMobile;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etUsername;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView tvLogin;

  @Bindable
  protected LoginSignupViewModel mSignupModel;

  protected FragmentRegistrationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnSignUp, EditText etCnfPassword, EditText etEmailid, EditText etFullName,
      EditText etMobile, EditText etPassword, EditText etUsername, TextView textView4,
      TextView tvLogin) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSignUp = btnSignUp;
    this.etCnfPassword = etCnfPassword;
    this.etEmailid = etEmailid;
    this.etFullName = etFullName;
    this.etMobile = etMobile;
    this.etPassword = etPassword;
    this.etUsername = etUsername;
    this.textView4 = textView4;
    this.tvLogin = tvLogin;
  }

  public abstract void setSignupModel(@Nullable LoginSignupViewModel signupModel);

  @Nullable
  public LoginSignupViewModel getSignupModel() {
    return mSignupModel;
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_registration, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRegistrationBinding>inflateInternal(inflater, R.layout.fragment_registration, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_registration, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRegistrationBinding>inflateInternal(inflater, R.layout.fragment_registration, null, false, component);
  }

  public static FragmentRegistrationBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentRegistrationBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentRegistrationBinding)bind(component, view, R.layout.fragment_registration);
  }
}
