package com.lucas.tipscalculator

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

import com.lucas.tipscalculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var percentage = 0
        binding.btOne.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 10
            }
        }
        binding.btTwo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 15
            }
        }
        binding.btThree.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 20
            }
        }

        binding.btCalulo.setOnClickListener {

            val accounttemp = binding.tieAccount.text
            val peopletemp = binding.tiePeople.text

            if (accounttemp?.isEmpty() == true || peopletemp?.isEmpty() == true) {

                Snackbar.make(binding.tieAccount, "Preencha os campos", Snackbar.LENGTH_LONG).show()

            } else {
                val account: Float = binding.tieAccount.text.toString().toFloat()
                val people: Int = binding.tiePeople.text.toString().toInt()

                val result = account / people
                val tips = result * percentage / 100
                val total = result + tips


                intent = Intent(this, ResultActivity2::class.java)
                intent.apply {
                    putExtra("total", total)
                    putExtra("account", account)
                    putExtra("people", people)
                }
                clean()
                startActivity(intent)

            }
        }
        binding.btClean.setOnClickListener {
            clean()
        }

    }

    private fun clean() {
        binding.tieAccount.setText("")
        binding.tiePeople.setText("")
        binding.btOne.isChecked = false
        binding.btTwo.isChecked = false
        binding.btThree.isChecked = false


    }
}