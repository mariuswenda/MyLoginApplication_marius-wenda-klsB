package com.example.myloginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myloginapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            val intenthome = Intent(this, Home::class.java)
            startActivity(intenthome)
        }

        binding.lupa.setOnClickListener {
            val intentReset = Intent(this, ResetActivity::class.java)
            startActivity(intentReset)
        }

        binding.daftar.setOnClickListener {
            val intentDaftar = Intent(this, RegisterActivity::class.java)
            startActivity(intentDaftar)
        }

    }
}