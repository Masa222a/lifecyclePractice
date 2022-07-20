package com.android.example.lifecyclepractice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.example.lifecyclepractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("onCreate", "MainActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart", "MainActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume", "MainActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause", "MainActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop", "MainActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy", "MainActivity")
    }
}