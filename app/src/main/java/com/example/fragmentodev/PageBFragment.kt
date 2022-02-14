package com.example.fragmentodev

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.fragmentodev.databinding.FragmentPageBBinding
import java.util.*


class PageBFragment : Fragment() {
    private lateinit var tasarim:FragmentPageBBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        tasarim = FragmentPageBBinding.inflate(inflater, container, false)

        tasarim.button2.setOnClickListener{
            val gecis = PageBFragmentDirections.bToY()
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim.root
    }
}