package com.lucas.tipscalculator


import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.lucas.tipscalculator.databinding.ActivityPrincialScreenBinding


class PrincialScreen : AppCompatActivity() {
    private lateinit var binding: ActivityPrincialScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincialScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}