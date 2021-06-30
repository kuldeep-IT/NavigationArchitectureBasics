package com.kuldeepjetpackkotlin.navigationarchitecturebasics

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.kuldeepjetpackkotlin.navigationarchitecturebasics.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)

        binding.homebtnSubmit.setOnClickListener {

            if (!TextUtils.isEmpty(binding.homeedt.text.toString())) {

                var bundle = bundleOf("USER_INPUT" to binding.homeedt.text.toString())


                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment,bundle)


            }
        }

        return binding.root
    }


}