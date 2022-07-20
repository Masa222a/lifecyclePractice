package com.android.example.lifecyclepractice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.android.example.lifecyclepractice.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        binding.button.setOnClickListener {
            if (viewPager != null) {
                viewPager.setCurrentItem(0)
            }
        }
        Log.d("onCreateView", "SecondFragment")
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate", "SecondFragment")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("onViewCreated", "SecondFragment")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("onViewStateRestored", "SecondFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart", "SecondFragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume", "SecondFragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause", "SecondFragment")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop", "SecondFragment")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("onSaveInstanceState", "SecondFragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("onDestroyView", "SecondFragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy", "SecondFragment")
    }
}