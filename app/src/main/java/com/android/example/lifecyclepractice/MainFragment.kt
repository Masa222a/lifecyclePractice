package com.android.example.lifecyclepractice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.example.lifecyclepractice.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.viewPager.adapter = LifecyclePagerAdapter(this)
        Log.d("onCreateView", "MainFragment")
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate", "MainFragment")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("onViewCreated", "MainFragment")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("onViewStateRestored", "MainFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart", "MainFragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume", "MainFragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause", "MainFragment")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop", "MainFragment")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("onSaveInstanceState", "MainFragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("onDestroyView", "MainFragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy", "MainFragment")
    }
}