package com.example.myloginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myloginapplication.databinding.ActivityMainBinding
import com.example.myloginapplication.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.daftarBtn.setOnClickListener {
            val intentHome = Intent(this, Home::class.java)
            startActivity(intentHome)
        }
        binding.login.setOnClickListener {
            val intentlogin = Intent(this, MainActivity::class.java)
            startActivity(intentlogin)
        }
    }
}