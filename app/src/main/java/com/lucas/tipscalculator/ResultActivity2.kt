package com.lucas.tipscalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResult
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lucas.tipscalculator.databinding.ActivityResult2Binding

class ResultActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityResult2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResult2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val total = intent.getFloatExtra("total", 0.0f)
        val account = intent.getFloatExtra("account", 0.0f)
        val people = intent.getIntExtra("people", 0)

        binding.tvResult.text = "Total with tips " + total.toString()
        binding.tvAccountResult.text = account.toString()
        binding.tvPeopleResul.text = people.toString()

        binding.btRefresh.setOnClickListener {
            finish()
        }

    }
}