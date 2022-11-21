package com.example.jobsheet20

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import java.util.ArrayList

class MainActivity: AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "Muhammad Huda Gunawan",
        "Mutmainah Septiarini",
        "Nasywa Sukria Hanifa",
        "Nor Hidayah Fitriyani",
        "Novita Sari",
        "Nur Izza",
        "Riska Anggun Angriani",
        "Sahrul Lukman Hakim",
        "Setya Neng Rahayu",
        "Siti Agnia Amalia",
        "Tiara Bintang Liswanda",
    )

    val listNis = arrayOf(
        "3014",
        "3016",
        "3018",
        "3020",
        "3022",
        "3024",
        "3026",
        "3027",
        "3030",
        "3032",
        "3024",
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i],listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }

}