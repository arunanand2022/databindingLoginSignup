package com.evontech.twowaydatabindingloginsignup.fragment

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.evontech.twowaydatabindingloginsignup.R
import com.evontech.twowaydatabindingloginsignup.activity.HomeActivity
import com.evontech.twowaydatabindingloginsignup.databinding.FragmentLoginBinding
import com.evontech.twowaydatabindingloginsignup.viewModel.LoginSignupViewModel

class LoginFragment : Fragment() {
    private var _binding :FragmentLoginBinding?=null
    private val binding get() = _binding!!

    lateinit var loginSignupViewModel: LoginSignupViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        loginSignupViewModel = ViewModelProvider(this).get(LoginSignupViewModel::class.java)

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        var root: View = binding.root

        binding.loginModel = loginSignupViewModel
        binding.lifecycleOwner = this

        binding.tvSignup.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToRegistrationFragment()
            NavHostFragment.findNavController(this).navigate(action)

        }

        loginSignupViewModel.navigatetoHome.observe(viewLifecycleOwner,Observer{
            if (it){
                activity?.apply {
                    val intent = Intent(requireActivity(),HomeActivity::class.java)
                    startActivity(intent)
                }
                loginSignupViewModel.doneNavigatingToHome()
            }else{
                Toast.makeText(requireContext(), "Please try again", Toast.LENGTH_LONG).show()

            }

        })

        return root
    }


}