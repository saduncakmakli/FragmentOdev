package com.example.fragmentodev

import android.R
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.FragmentNavigator
import com.example.fragmentodev.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity()
{
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)

        setContentView(tasarim.root)
    }

    // Çok kötü bir yöntem oldu ama y fragmentinde anasayfaya gitmesi için yeni bir action tanımlamayıp,
    // bellekten silme yöntemi ile yapmaya çalıştım ancak böyle yapabildim hocam
    override fun onBackPressed() {
        if (Navigation.findNavController(tasarim.fragmentContainerView).currentDestination!!.label.toString() == "fragment_page_y")
            while (Navigation.findNavController(tasarim.fragmentContainerView).backQueue.size > 2)
                Navigation.findNavController(tasarim.fragmentContainerView).popBackStack()
        else super.onBackPressed()
    }
}