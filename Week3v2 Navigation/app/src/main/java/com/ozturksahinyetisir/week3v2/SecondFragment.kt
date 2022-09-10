package com.ozturksahinyetisir.week3v2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ozturksahinyetisir.week3v2.databinding.FragmentSecondBinding
import kotlin.system.exitProcess

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater)

        /**
        * Navigate secondFragment to mainFragment with setOnClickListener "mainPageButton"
        */

        binding.mainPageButton.setOnClickListener{
            findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
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

