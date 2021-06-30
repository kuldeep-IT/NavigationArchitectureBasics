package com.kuldeepjetpackkotlin.navigationarchitecturebasics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kuldeepjetpackkotlin.navigationarchitecturebasics.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        //not a error
        var homeInputText = arguments!!.getString("USER_INPUT")
        binding.secondTV.text = homeInputText.toString()

        return binding.root
    }


}