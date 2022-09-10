package com.ozturksahinyetisir.week3v2

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.ozturksahinyetisir.week3v2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    /**
     * @param preferences set SharedPreferences as preferences
     * @param navController set NavController as navController for using navigation control with fragments.
     */

    private lateinit var binding:ActivityMainBinding
    lateinit var preferences: SharedPreferences
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        /**
         * @param navHostFragment added supportFragmentManager using fragment navigation.
         * set getSharedPreferences as "userdata.xml" and it's private for editing via another programs.
         */

        preferences = getSharedPreferences("userdata", MODE_PRIVATE)
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragment) as NavHostFragment
        navController = navHostFragment.navController
    }
}