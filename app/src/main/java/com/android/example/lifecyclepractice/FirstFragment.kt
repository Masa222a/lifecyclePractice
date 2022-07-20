package com.android.example.lifecyclepractice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.android.example.lifecyclepractice.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        binding.button.setOnClickListener {
            if (viewPager != null) {
                viewPager.setCurrentItem(1)
            }
        }
        Log.d("onCreateView", "FirstFragment")
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate", "FirstFragment")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("onViewCreated", "FirstFragment")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("onViewStateRestored", "FirstFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart", "FirstFragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume", "FirstFragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause", "FirstFragment")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop", "FirstFragment")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("onSaveInstanceState", "FirstFragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("onDestroyView", "FirstFragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy", "FirstFragment")
    }

}