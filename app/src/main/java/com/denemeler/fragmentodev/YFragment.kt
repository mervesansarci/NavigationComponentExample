package com.denemeler.fragmentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denemeler.fragmentodev.databinding.FragmentYBinding


class YFragment : Fragment() {
    private lateinit var tasarim:FragmentYBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentYBinding.inflate(inflater,container, false)






        return tasarim.root
    }

}