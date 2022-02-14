package com.example.fragmentodev

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentodev.databinding.FragmentHomepageBinding

class HomepageFragment : Fragment() {
    private lateinit var tasarim:FragmentHomepageBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        tasarim = FragmentHomepageBinding.inflate(inflater,container,false)

        tasarim.buttonPageA.setOnClickListener{
            val gecisA = HomepageFragmentDirections.homepageToA()
            Navigation.findNavController(it).navigate(gecisA)
            //Navigation.findNavController(it).navigate(R.id.homepageToA)
        }

        tasarim.buttonPageX.setOnClickListener{
            val gecisX = HomepageFragmentDirections.homepageToX()
            Navigation.findNavController(it).navigate(gecisX)
        }

        return tasarim.root
    }
}