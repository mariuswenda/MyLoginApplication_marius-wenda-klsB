package com.example.myloginapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter  (private val namaList: ArrayList<item>):RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    private lateinit var mListener: onItemClickListener

    interface  onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }
    class MyViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView){
        val gambar:ImageView = itemView.findViewById(R.id.img)
        val judul:TextView = itemView.findViewById(R.id.Nama)
        val asal:TextView = itemView.findViewById(R.id.Asal)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val  itemView = LayoutInflater.from(parent.context).inflate(R.layout.item,parent, false)
        return MyViewHolder(itemView, mListener)
    }

    override fun getItemCount(): Int {
        return namaList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.gambar.setImageResource(currentItem.img)
        holder.judul.text = currentItem.nama
        holder.asal.text = currentItem.asal
    }
}