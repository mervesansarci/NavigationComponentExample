package com.denemeler.fragmentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.denemeler.fragmentodev.databinding.FragmentBBinding

class BFragment : Fragment() {

    private lateinit var tasarim:FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentBBinding.inflate(inflater,container, false)

        tasarim.buttonY.setOnClickListener{

            Navigation.findNavController(it).navigate(R.id.bToY)

        }



        return tasarim.root
    }

}