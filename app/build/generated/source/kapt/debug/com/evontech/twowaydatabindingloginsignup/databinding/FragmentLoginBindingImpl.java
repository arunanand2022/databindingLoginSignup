package com.evontech.twowaydatabindingloginsignup.databinding;
import com.evontech.twowaydatabindingloginsignup.R;
import com.evontech.twowaydatabindingloginsignup.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements com.evontech.twowaydatabindingloginsignup.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView4, 4);
        sViewsWithIds.put(R.id.tv_signup, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginModel.inputPassword.getValue()
            //         is loginModel.inputPassword.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPassword);
            // localize variables for thread safety
            // loginModel.inputPassword != null
            boolean loginModelInputPasswordJavaLangObjectNull = false;
            // loginModel.inputPassword.getValue()
            java.lang.String loginModelInputPasswordGetValue = null;
            // loginModel != null
            boolean loginModelJavaLangObjectNull = false;
            // loginModel.inputPassword
            androidx.lifecycle.MutableLiveData<java.lang.String> loginModelInputPassword = null;
            // loginModel
            com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel loginModel = mLoginModel;



            loginModelJavaLangObjectNull = (loginModel) != (null);
            if (loginModelJavaLangObjectNull) {


                loginModelInputPassword = loginModel.getInputPassword();

                loginModelInputPasswordJavaLangObjectNull = (loginModelInputPassword) != (null);
                if (loginModelInputPasswordJavaLangObjectNull) {




                    loginModelInputPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginModel.inputUserName.getValue()
            //         is loginModel.inputUserName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etUsername);
            // localize variables for thread safety
            // loginModel != null
            boolean loginModelJavaLangObjectNull = false;
            // loginModel.inputUserName
            androidx.lifecycle.MutableLiveData<java.lang.String> loginModelInputUserName = null;
            // loginModel.inputUserName != null
            boolean loginModelInputUserNameJavaLangObjectNull = false;
            // loginModel
            com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel loginModel = mLoginModel;
            // loginModel.inputUserName.getValue()
            java.lang.String loginModelInputUserNameGetValue = null;



            loginModelJavaLangObjectNull = (loginModel) != (null);
            if (loginModelJavaLangObjectNull) {


                loginModelInputUserName = loginModel.getInputUserName();

                loginModelInputUserNameJavaLangObjectNull = (loginModelInputUserName) != (null);
                if (loginModelInputUserNameJavaLangObjectNull) {




                    loginModelInputUserName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.btnSignIn.setTag(null);
        this.etPassword.setTag(null);
        this.etUsername.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.evontech.twowaydatabindingloginsignup.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.loginModel == variableId) {
            setLoginModel((com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginModel(@Nullable com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel LoginModel) {
        this.mLoginModel = LoginModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.loginModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginModelInputPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLoginModelInputUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginModelInputPassword(androidx.lifecycle.MutableLiveData<java.lang.String> LoginModelInputPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginModelInputUserName(androidx.lifecycle.MutableLiveData<java.lang.String> LoginModelInputUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String loginModelInputPasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginModelInputPassword = null;
        java.lang.String loginModelInputUserNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginModelInputUserName = null;
        com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel loginModel = mLoginModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (loginModel != null) {
                        // read loginModel.inputPassword
                        loginModelInputPassword = loginModel.getInputPassword();
                    }
                    updateLiveDataRegistration(0, loginModelInputPassword);


                    if (loginModelInputPassword != null) {
                        // read loginModel.inputPassword.getValue()
                        loginModelInputPasswordGetValue = loginModelInputPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (loginModel != null) {
                        // read loginModel.inputUserName
                        loginModelInputUserName = loginModel.getInputUserName();
                    }
                    updateLiveDataRegistration(1, loginModelInputUserName);


                    if (loginModelInputUserName != null) {
                        // read loginModel.inputUserName.getValue()
                        loginModelInputUserNameGetValue = loginModelInputUserName.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnSignIn.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etUsernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPassword, loginModelInputPasswordGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etUsername, loginModelInputUserNameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // loginModel != null
        boolean loginModelJavaLangObjectNull = false;
        // loginModel
        com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel loginModel = mLoginModel;



        loginModelJavaLangObjectNull = (loginModel) != (null);
        if (loginModelJavaLangObjectNull) {



            loginModel.login(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginModel.inputPassword
        flag 1 (0x2L): loginModel.inputUserName
        flag 2 (0x3L): loginModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}