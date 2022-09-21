package com.evontech.twowaydatabindingloginsignup.viewModel

import android.app.Application
import android.text.TextUtils.isEmpty
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.evontech.twowaydatabindingloginsignup.R
import com.evontech.twowaydatabindingloginsignup.database.MyRoomDatabase
import com.evontech.twowaydatabindingloginsignup.model.LoginSignupModel
import com.evontech.twowaydatabindingloginsignup.repository.LoginSignupRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*

class LoginSignupViewModel(application: Application):AndroidViewModel(application) {

    //Login -signup
    val inputName = MutableLiveData<String>()
    val inputEmail = MutableLiveData<String>()
    val inputMobile = MutableLiveData<String>()
    val inputUserName = MutableLiveData<String>()
    val inputPassword = MutableLiveData<String>()
    val inputCnfPassword = MutableLiveData<String>()

    private val _navigatetoLogin = MutableLiveData<Boolean>()
    val navigatetoLogin: LiveData<Boolean> get() = _navigatetoLogin

    private val _navigatetoHome = MutableLiveData<Boolean>()
    val navigatetoHome: LiveData<Boolean> get() = _navigatetoHome

    private val repository: LoginSignupRepository

    init {
        val userLogin = MyRoomDatabase.getDbInstance(getApplication()).loginSignupDao()
        repository = LoginSignupRepository(userLogin)
    }
    fun signup(view: View){
        val name = inputName.value
        val userName = inputUserName.value
        val email = inputEmail.value
        val mobile = inputMobile.value
        val password = inputPassword.value
        val cnf_password = inputCnfPassword.value

        if (isEmpty(name)){
            Toast.makeText(getApplication(),"Please enter name",Toast.LENGTH_LONG).show()
        }else if (isEmpty(userName)){
            Toast.makeText(getApplication(),"Please enter user name",Toast.LENGTH_LONG).show()
        }else if (isEmpty(email)){
            Toast.makeText(getApplication(),"Please enter email",Toast.LENGTH_LONG).show()
        }else if (isEmpty(mobile)){
            Toast.makeText(getApplication(),"Please enter mobile number",Toast.LENGTH_LONG).show()
        }else if (isEmpty(password)){
            Toast.makeText(getApplication(),"Please enter password",Toast.LENGTH_LONG).show()
        }else if (isEmpty(cnf_password)){
            Toast.makeText(getApplication(),"Please enter confirm password",Toast.LENGTH_LONG).show()
        }else if (!password.equals(cnf_password)){
            Toast.makeText(getApplication(),"Password or confirm password are not match!",Toast.LENGTH_LONG).show()
        }else{
            viewModelScope.launch(Dispatchers.IO) {
                val response = repository.getUsername(LoginSignupModel(null,userName.toString(),password.toString(),"","","","","", ""))
                if (response != null){
                    //Toast.makeText(getApplication(),"user name already exist!!",Toast.LENGTH_LONG).show()
                    _navigatetoLogin.postValue(false)
                }else{
                    repository.signupUserDetails(LoginSignupModel(null,userName.toString(),password.toString(),name,"","",email,mobile, Date().toString()))
                    inputName.postValue("")
                    inputUserName.postValue("")
                    inputEmail.postValue("")
                    inputMobile.postValue("")
                    inputPassword.postValue("")
                    inputCnfPassword.postValue("")
                    _navigatetoLogin.postValue(true)
                }
            }
        }

    }

    fun login(view: View){
        val userName = inputUserName.value
        val password = inputPassword.value
        if (isEmpty(userName)) {
            Toast.makeText(getApplication(), "Please enter user name", Toast.LENGTH_LONG).show()
        }else if (isEmpty(password)){
            Toast.makeText(getApplication(), "Please enter password", Toast.LENGTH_LONG).show()
        }else{
            viewModelScope.launch(Dispatchers.IO) {
                val result = repository.loginuser(LoginSignupModel(null,userName.toString(),password.toString(),"","","",
                    "","", ""))
                if (result != null){
                    if (result.userPassword == password){
                        _navigatetoHome.postValue(true)
                        inputUserName.postValue("")
                        inputPassword.postValue("")
                    }else{
                        _navigatetoHome.postValue(false)
                        Log.d("result=>", result.toString())
                        //Toast.makeText(getApplication(), "Please check password", Toast.LENGTH_LONG).show()
                    }
                }else{
                    _navigatetoHome.postValue(false)
                    //Toast.makeText(getApplication(), "Please check user name", Toast.LENGTH_LONG).show()
                }

            }
        }
    }

    fun doneNavigatingToLogin() {
        _navigatetoLogin.postValue(false)
    }
    fun doneNavigatingToHome() {
        _navigatetoHome.postValue(false)
    }
}