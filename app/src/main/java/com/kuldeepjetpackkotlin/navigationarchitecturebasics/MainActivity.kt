package com.kuldeepjetpackkotlin.navigationarchitecturebasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kuldeepjetpackkotlin.navigationarchitecturebasics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    //project depencies : https://developer.android.com/jetpack/androidx/releases/navigation


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
    }
}