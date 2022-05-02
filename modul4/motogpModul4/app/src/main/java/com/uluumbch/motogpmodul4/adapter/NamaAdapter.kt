package com.uluumbch.motogpmodul4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uluumbch.motogpmodul4.R

class NamaAdapter(val nama: List<String>) : RecyclerView.Adapter<NamaAdapter.ViewHolder>() {
    private lateinit var mListener: OnItemClickListener


    interface OnItemClickListener{
        fun onItemClick(position: Int){

        }
    }


    fun setOnItemClickListener(listener: OnItemClickListener){
        mListener = listener
    }

    class ViewHolder(itemView: View, listener: OnItemClickListener)
        : RecyclerView.ViewHolder(itemView) {
        val nama: TextView = itemView.findViewById(R.id.nama_teks)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.nama_item, parent, false)

        return ViewHolder(itemView, mListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nama.text = nama.get(position)
    }

    override fun getItemCount(): Int {
        return nama.size
    }

}