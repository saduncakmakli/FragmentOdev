package com.example.fragmentodev

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentodev.databinding.FragmentPageXBinding


class PageXFragment : Fragment()
{
    private lateinit var tasarim:FragmentPageXBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        tasarim = FragmentPageXBinding.inflate(inflater,container,false)

        tasarim.button3.setOnClickListener{
            val gecis = PageXFragmentDirections.xToY()
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim.root
    }
}