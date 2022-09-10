package com.ozturksahinyetisir.week3v1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.PackageManagerCompat.LOG_TAG
import com.ozturksahinyetisir.week3v1.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding

var count = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clickButton.setOnClickListener() {
            count++
            binding.textView1.text = count.toString()
        }
    }

    /**
     * @param onSaveInstanceState keeps count integer when onPause onResume but cant keep at onRestart & onDestroy
     * editText & checkBox already keep without SaveInstanceState
     * editText & checkBox are viewState, responsible for managing their own state.
     */
    override fun onSaveInstanceState(outState: Bundle) {
       super.onSaveInstanceState(outState)
      outState.putInt("savedInt", count)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val userInt = savedInstanceState.getInt("savedInt",0)
        count = userInt
        binding.textView1.text = count.toString()
    }

}




