package com.lucas.tipscalculator

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

import com.lucas.tipscalculator.databinding.ActivityMainBinding
import com.lucas.tipscalculator.databinding.ActivityPrincialScreenBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var porcente = 0
        binding.btOne.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                porcente = 10
            }
        }
        binding.btTwo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                porcente = 15
            }
        }
        binding.btThree.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                porcente = 20
            }
        }




        binding.btCalculo.setOnClickListener {


            val conta: Float = binding.tieConta.text.toString().toFloat()
            val pessoa: Int = binding.tiePeople.text.toString().toInt()

            val res = conta / pessoa
            val tips = res * porcente / 100
            val total = res + tips


            binding.tvResult.text = "Total with tips" + total


        }
        binding.btClean.setOnClickListener {
            clean()
        }

    }

    private fun clean() {
        binding.tieConta.setText("")
        binding.tiePeople.setText("")
        binding.tvResult.setText("")

    }
}