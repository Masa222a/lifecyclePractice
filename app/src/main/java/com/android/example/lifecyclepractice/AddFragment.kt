package com.android.example.lifecyclepractice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.example.lifecyclepractice.databinding.FragmentAddBinding

class AddFragment : Fragment() {
    lateinit var binding: FragmentAddBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBinding.inflate(inflater, container, false)
        binding.button2.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate", "AddFragment")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("onViewCreated", "AddFragment")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("onViewStateRestored", "AddFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart", "AddFragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume", "AddFragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause", "AddFragment")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop", "AddFragment")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("onSaveInstanceState", "AddFragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("onDestroyView", "AddFragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy", "AddFragment")
    }

}