package com.example.fragmentodev

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentodev.databinding.FragmentPageABinding


class PageAFragment : Fragment() {
    private lateinit var tasarim:FragmentPageABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        tasarim = FragmentPageABinding.inflate(inflater,container,false)

        tasarim.button.setOnClickListener{
            val gecis = PageAFragmentDirections.aToB()
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim.root
    }
}