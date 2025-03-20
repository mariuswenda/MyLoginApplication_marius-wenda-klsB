package com.example.myloginapplication

import android.content.Intent
import android.media.RouteListingPreference.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home : AppCompatActivity() {

    private lateinit var dataRecyclerView: RecyclerView
    private lateinit var Nama: Array<String>
    private lateinit var Asal: Array<String>

    private lateinit var Gambar: Array<Int>

    private lateinit var Biiografi: Array<String>
    private lateinit var listPreasiden: ArrayList<item>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Gambar = arrayOf(
            R.drawable.amerika,
            R.drawable.china,
            R.drawable.koreaselatan,
            R.drawable.singapura,
            R.drawable.thailand,
            R.drawable.timorleste,
            R.drawable.viatnam,
            R.drawable.malaisya
        )

        Nama = arrayOf(
            "Jho Biden",
            "Xi Jimping",
            "Moon Jae-In",
            "Halimah Yacob",
            "Raja Maha Vajhiralongkorn",
            "Fransisco Gooterrest",
            "Nguyen Xuan Phuc",
            "Ismail Sabri Jaacob"

        )
        Asal = arrayOf(
            "Amerika Serikat",
            "China ",
            "Korean Selatan",
            "Singapura",
            "Thailand",
            "Timor Leste",
            "Vietnam ",
            "Malaisya"
        )

        Biiografi = arrayOf(
            getString(R.string.amerika),
            getString(R.string.amerika),
            getString(R.string.amerika),
            getString(R.string.amerika),
            getString(R.string.amerika),
            getString(R.string.amerika),
            getString(R.string.amerika),
            getString(R.string.amerika)
        )
        dataRecyclerView = findViewById(R.id.daftarPresiden)
        dataRecyclerView.layoutManager = LinearLayoutManager(this)

        listPreasiden = arrayListOf<item>()
        getData()

    }

    private fun getData() {
        for (i in Gambar.indices) {
            val dataPresiden = item(Gambar[i], Nama[i], Asal[i])
            listPreasiden.add(dataPresiden)
        }


        var adapter = MyAdapter(listPreasiden)
        dataRecyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@Home, Biografi::class.java)
                intent.putExtra("img", listPreasiden[position].img)
                intent.putExtra("nma", listPreasiden[position].nama)
                intent.putExtra("asl", listPreasiden[position].asal)
                intent.putExtra("bio", Biiografi[position])
                startActivity(intent)


            }

        })
    }
}