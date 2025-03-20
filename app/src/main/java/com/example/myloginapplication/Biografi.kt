package com.example.myloginapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Biografi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_biografi)


        val gambar : ImageView = findViewById(R.id.imageView)
        val Nama : TextView = findViewById(R.id.NamaPresiden)
        val Asal : TextView = findViewById(R.id.AsalV)
        val Biografi : TextView = findViewById(R.id.BioGrafi)


        val bundle: Bundle?= intent.extras
        val bNama = bundle!!.getString("nma")
        val bGambar = bundle.getInt("img")
        val  bAsal = bundle.getString("asl")
        val bBiografi = bundle.getString("bio")

        gambar.setImageResource(bGambar)
        Nama.text = bNama
        Asal.text = bAsal
        Biografi.text = bBiografi

    }
}