package com.ozturksahinyetisir.week3v2

import android.content.Context.MODE_PRIVATE
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ozturksahinyetisir.week3v2.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)
        /**
         * @param SharedPreferences set requireActivity for using at Fragments and "userdata.xml" as private
         * @param editor able to edit values.
         */
        var SharedPreferences = requireActivity().applicationContext.getSharedPreferences("userdata",MODE_PRIVATE)
        var editor = SharedPreferences.edit()

        /**
         * @param getName editTextName value added at "userdata.xml" as Name
         * @param username editTextUsername value added at "userdata.xml" as Username
         * then apply it these strings.
         */
        binding.loginbutton.setOnClickListener{
            var getName = binding.editTextName.text.toString()
            var username = binding.editTextUsername.text.toString()
            editor.putString("name","$getName").apply()
            editor.putString("username","$username").apply()

            /**
             * Navigate loginFragment to mainFragment with setOnClickListener "loginbutton"
             */
            findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
        }
        return binding.root
    }
}
