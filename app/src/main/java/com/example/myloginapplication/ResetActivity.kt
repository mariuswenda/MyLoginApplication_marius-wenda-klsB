package com.example.myloginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myloginapplication.databinding.ActivityRegisterBinding
import com.example.myloginapplication.databinding.ActivityResetBinding

class ResetActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset)

        binding = ActivityResetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.aturUlangSandiBtn.setOnClickListener {
            val intentHome = Intent(this, Home::class.java)
            startActivity(intentHome)
        }
        binding.login.setOnClickListener {
            val intentlogin = Intent(this, MainActivity::class.java)
            startActivity(intentlogin)
        }
    }
}