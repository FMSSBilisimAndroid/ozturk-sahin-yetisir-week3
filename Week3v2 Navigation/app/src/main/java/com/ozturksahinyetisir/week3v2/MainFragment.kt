package com.ozturksahinyetisir.week3v2


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ozturksahinyetisir.week3v2.databinding.FragmentMainBinding
import kotlin.system.exitProcess


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater)
        var preferences = requireActivity().applicationContext.getSharedPreferences("userdata",Context.MODE_PRIVATE)
        var getName = preferences.getString("name","")
        binding.welcometext.text = getName.toString()
        binding.secondPageButton.setOnClickListener{
            /**
             * Navigate mainFragment to secondFragment with setOnClickListener "secondPageButton"
             */
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
        }
        return binding.root
    }
    /**
     * exit function uses exitProcess at kotlin.system
     */
    fun exit(view: View){
        exitProcess(0)
    }
}
