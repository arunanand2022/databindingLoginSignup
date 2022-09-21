package com.evontech.twowaydatabindingloginsignup.databinding;
import com.evontech.twowaydatabindingloginsignup.R;
import com.evontech.twowaydatabindingloginsignup.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegistrationBindingImpl extends FragmentRegistrationBinding implements com.evontech.twowaydatabindingloginsignup.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView4, 8);
        sViewsWithIds.put(R.id.tv_login, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etCnfPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signupModel.inputCnfPassword.getValue()
            //         is signupModel.inputCnfPassword.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etCnfPassword);
            // localize variables for thread safety
            // signupModel.inputCnfPassword
            androidx.lifecycle.MutableLiveData<java.lang.String> signupModelInputCnfPassword = null;
            // signupModel != null
            boolean signupModelJavaLangObjectNull = false;
            // signupModel
            com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel signupModel = mSignupModel;
            // signupModel.inputCnfPassword != null
            boolean signupModelInputCnfPasswordJavaLangObjectNull = false;
            // signupModel.inputCnfPassword.getValue()
            java.lang.String signupModelInputCnfPasswordGetValue = null;



            signupModelJavaLangObjectNull = (signupModel) != (null);
            if (signupModelJavaLangObjectNull) {


                signupModelInputCnfPassword = signupModel.getInputCnfPassword();

                signupModelInputCnfPasswordJavaLangObjectNull = (signupModelInputCnfPassword) != (null);
                if (signupModelInputCnfPasswordJavaLangObjectNull) {




                    signupModelInputCnfPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etEmailidandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signupModel.inputEmail.getValue()
            //         is signupModel.inputEmail.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etEmailid);
            // localize variables for thread safety
            // signupModel.inputEmail
            androidx.lifecycle.MutableLiveData<java.lang.String> signupModelInputEmail = null;
            // signupModel != null
            boolean signupModelJavaLangObjectNull = false;
            // signupModel
            com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel signupModel = mSignupModel;
            // signupModel.inputEmail.getValue()
            java.lang.String signupModelInputEmailGetValue = null;
            // signupModel.inputEmail != null
            boolean signupModelInputEmailJavaLangObjectNull = false;



            signupModelJavaLangObjectNull = (signupModel) != (null);
            if (signupModelJavaLangObjectNull) {


                signupModelInputEmail = signupModel.getInputEmail();

                signupModelInputEmailJavaLangObjectNull = (signupModelInputEmail) != (null);
                if (signupModelInputEmailJavaLangObjectNull) {




                    signupModelInputEmail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etFullNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signupModel.inputName.getValue()
            //         is signupModel.inputName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etFullName);
            // localize variables for thread safety
            // signupModel.inputName.getValue()
            java.lang.String signupModelInputNameGetValue = null;
            // signupModel.inputName
            androidx.lifecycle.MutableLiveData<java.lang.String> signupModelInputName = null;
            // signupModel != null
            boolean signupModelJavaLangObjectNull = false;
            // signupModel
            com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel signupModel = mSignupModel;
            // signupModel.inputName != null
            boolean signupModelInputNameJavaLangObjectNull = false;



            signupModelJavaLangObjectNull = (signupModel) != (null);
            if (signupModelJavaLangObjectNull) {


                signupModelInputName = signupModel.getInputName();

                signupModelInputNameJavaLangObjectNull = (signupModelInputName) != (null);
                if (signupModelInputNameJavaLangObjectNull) {




                    signupModelInputName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etMobileandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signupModel.inputMobile.getValue()
            //         is signupModel.inputMobile.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etMobile);
            // localize variables for thread safety
            // signupModel.inputMobile != null
            boolean signupModelInputMobileJavaLangObjectNull = false;
            // signupModel.inputMobile
            androidx.lifecycle.MutableLiveData<java.lang.String> signupModelInputMobile = null;
            // signupModel != null
            boolean signupModelJavaLangObjectNull = false;
            // signupModel
            com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel signupModel = mSignupModel;
            // signupModel.inputMobile.getValue()
            java.lang.String signupModelInputMobileGetValue = null;



            signupModelJavaLangObjectNull = (signupModel) != (null);
            if (signupModelJavaLangObjectNull) {


                signupModelInputMobile = signupModel.getInputMobile();

                signupModelInputMobileJavaLangObjectNull = (signupModelInputMobile) != (null);
                if (signupModelInputMobileJavaLangObjectNull) {




                    signupModelInputMobile.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signupModel.inputPassword.getValue()
            //         is signupModel.inputPassword.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPassword);
            // localize variables for thread safety
            // signupModel.inputPassword
            androidx.lifecycle.MutableLiveData<java.lang.String> signupModelInputPassword = null;
            // signupModel.inputPassword != null
            boolean signupModelInputPasswordJavaLangObjectNull = false;
            // signupModel != null
            boolean signupModelJavaLangObjectNull = false;
            // signupModel
            com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel signupModel = mSignupModel;
            // signupModel.inputPassword.getValue()
            java.lang.String signupModelInputPasswordGetValue = null;



            signupModelJavaLangObjectNull = (signupModel) != (null);
            if (signupModelJavaLangObjectNull) {


                signupModelInputPassword = signupModel.getInputPassword();

                signupModelInputPasswordJavaLangObjectNull = (signupModelInputPassword) != (null);
                if (signupModelInputPasswordJavaLangObjectNull) {




                    signupModelInputPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signupModel.inputUserName.getValue()
            //         is signupModel.inputUserName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etUsername);
            // localize variables for thread safety
            // signupModel.inputUserName.getValue()
            java.lang.String signupModelInputUserNameGetValue = null;
            // signupModel.inputUserName
            androidx.lifecycle.MutableLiveData<java.lang.String> signupModelInputUserName = null;
            // signupModel != null
            boolean signupModelJavaLangObjectNull = false;
            // signupModel
            com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel signupModel = mSignupModel;
            // signupModel.inputUserName != null
            boolean signupModelInputUserNameJavaLangObjectNull = false;



            signupModelJavaLangObjectNull = (signupModel) != (null);
            if (signupModelJavaLangObjectNull) {


                signupModelInputUserName = signupModel.getInputUserName();

                signupModelInputUserNameJavaLangObjectNull = (signupModelInputUserName) != (null);
                if (signupModelInputUserNameJavaLangObjectNull) {




                    signupModelInputUserName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegistrationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentRegistrationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.Button) bindings[7]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            );
        this.btnSignUp.setTag(null);
        this.etCnfPassword.setTag(null);
        this.etEmailid.setTag(null);
        this.etFullName.setTag(null);
        this.etMobile.setTag(null);
        this.etPassword.setTag(null);
        this.etUsername.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.evontech.twowaydatabindingloginsignup.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.signupModel == variableId) {
            setSignupModel((com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSignupModel(@Nullable com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel SignupModel) {
        this.mSignupModel = SignupModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.signupModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSignupModelInputCnfPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeSignupModelInputMobile((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeSignupModelInputEmail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeSignupModelInputPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeSignupModelInputName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeSignupModelInputUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSignupModelInputCnfPassword(androidx.lifecycle.MutableLiveData<java.lang.String> SignupModelInputCnfPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSignupModelInputMobile(androidx.lifecycle.MutableLiveData<java.lang.String> SignupModelInputMobile, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSignupModelInputEmail(androidx.lifecycle.MutableLiveData<java.lang.String> SignupModelInputEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSignupModelInputPassword(androidx.lifecycle.MutableLiveData<java.lang.String> SignupModelInputPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSignupModelInputName(androidx.lifecycle.MutableLiveData<java.lang.String> SignupModelInputName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSignupModelInputUserName(androidx.lifecycle.MutableLiveData<java.lang.String> SignupModelInputUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> signupModelInputCnfPassword = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> signupModelInputMobile = null;
        java.lang.String signupModelInputEmailGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> signupModelInputEmail = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> signupModelInputPassword = null;
        java.lang.String signupModelInputNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> signupModelInputName = null;
        java.lang.String signupModelInputMobileGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> signupModelInputUserName = null;
        java.lang.String signupModelInputCnfPasswordGetValue = null;
        java.lang.String signupModelInputUserNameGetValue = null;
        com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel signupModel = mSignupModel;
        java.lang.String signupModelInputPasswordGetValue = null;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (signupModel != null) {
                        // read signupModel.inputCnfPassword
                        signupModelInputCnfPassword = signupModel.getInputCnfPassword();
                    }
                    updateLiveDataRegistration(0, signupModelInputCnfPassword);


                    if (signupModelInputCnfPassword != null) {
                        // read signupModel.inputCnfPassword.getValue()
                        signupModelInputCnfPasswordGetValue = signupModelInputCnfPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (signupModel != null) {
                        // read signupModel.inputMobile
                        signupModelInputMobile = signupModel.getInputMobile();
                    }
                    updateLiveDataRegistration(1, signupModelInputMobile);


                    if (signupModelInputMobile != null) {
                        // read signupModel.inputMobile.getValue()
                        signupModelInputMobileGetValue = signupModelInputMobile.getValue();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (signupModel != null) {
                        // read signupModel.inputEmail
                        signupModelInputEmail = signupModel.getInputEmail();
                    }
                    updateLiveDataRegistration(2, signupModelInputEmail);


                    if (signupModelInputEmail != null) {
                        // read signupModel.inputEmail.getValue()
                        signupModelInputEmailGetValue = signupModelInputEmail.getValue();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (signupModel != null) {
                        // read signupModel.inputPassword
                        signupModelInputPassword = signupModel.getInputPassword();
                    }
                    updateLiveDataRegistration(3, signupModelInputPassword);


                    if (signupModelInputPassword != null) {
                        // read signupModel.inputPassword.getValue()
                        signupModelInputPasswordGetValue = signupModelInputPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (signupModel != null) {
                        // read signupModel.inputName
                        signupModelInputName = signupModel.getInputName();
                    }
                    updateLiveDataRegistration(4, signupModelInputName);


                    if (signupModelInputName != null) {
                        // read signupModel.inputName.getValue()
                        signupModelInputNameGetValue = signupModelInputName.getValue();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (signupModel != null) {
                        // read signupModel.inputUserName
                        signupModelInputUserName = signupModel.getInputUserName();
                    }
                    updateLiveDataRegistration(5, signupModelInputUserName);


                    if (signupModelInputUserName != null) {
                        // read signupModel.inputUserName.getValue()
                        signupModelInputUserNameGetValue = signupModelInputUserName.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.btnSignUp.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etCnfPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etCnfPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etEmailid, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etEmailidandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etFullName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etFullNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etMobile, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etMobileandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etUsernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etCnfPassword, signupModelInputCnfPasswordGetValue);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etEmailid, signupModelInputEmailGetValue);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etFullName, signupModelInputNameGetValue);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etMobile, signupModelInputMobileGetValue);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPassword, signupModelInputPasswordGetValue);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etUsername, signupModelInputUserNameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // signupModel != null
        boolean signupModelJavaLangObjectNull = false;
        // signupModel
        com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel signupModel = mSignupModel;



        signupModelJavaLangObjectNull = (signupModel) != (null);
        if (signupModelJavaLangObjectNull) {



            signupModel.signup(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): signupModel.inputCnfPassword
        flag 1 (0x2L): signupModel.inputMobile
        flag 2 (0x3L): signupModel.inputEmail
        flag 3 (0x4L): signupModel.inputPassword
        flag 4 (0x5L): signupModel.inputName
        flag 5 (0x6L): signupModel.inputUserName
        flag 6 (0x7L): signupModel
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}