package com.evontech.twowaydatabindingloginsignup.fragment

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.evontech.twowaydatabindingloginsignup.R
import com.evontech.twowaydatabindingloginsignup.databinding.FragmentRegistrationBinding
import com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel

class RegistrationFragment : Fragment() {
    private var _binding : FragmentRegistrationBinding? = null
    private val binding get() = _binding!!
    lateinit var loginSignupViewModel: LoginSignupViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        loginSignupViewModel = ViewModelProvider(this).get(LoginSignupViewModel::class.java)

        _binding = FragmentRegistrationBinding.inflate(inflater,container,false)
        val root: View = binding.root
        binding.signupModel = loginSignupViewModel
        binding.lifecycleOwner = this

        binding.tvLogin.setOnClickListener {
            val action = RegistrationFragmentDirections.actionRegistrationFragmentToLoginFragment()
            NavHostFragment.findNavController(this).navigate(action)
        }

        loginSignupViewModel.navigatetoLogin.observe(viewLifecycleOwner, Observer {
            if (it){
                val action = RegistrationFragmentDirections.actionRegistrationFragmentToLoginFragment()
                NavHostFragment.findNavController(this).navigate(action)
                loginSignupViewModel.doneNavigatingToLogin()
            }else{
                Toast.makeText(requireContext(), "Please try again", Toast.LENGTH_LONG).show()

            }

        })


        return root
    }


}