package com.example.jobsheet20

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.ArrayList

class KelasAdapter(private val list: ArrayList<Kelas>): RecyclerView.Adapter<KelasAdapter.KelasViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KelasViewHolder {
       return KelasViewHolder(
           LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))
    }
    override fun onBindViewHolder(holder: KelasViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class KelasViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.namaView)
        private val nis = itemView.findViewById<TextView>(R.id.nisView)
        fun bind(get: Kelas) {
            nama.text = get.nama
            nis.text = get.nis
        }
    }
}