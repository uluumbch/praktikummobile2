package com.uluumbch.motogpmodul4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uluumbch.motogpmodul4.R

class TeamAdapter(val teamList: List<String>) : RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {
    private lateinit var mListener: OnItemClickListener


    interface OnItemClickListener{
        fun onItemClick(position: Int){

        }
    }

    fun setOnItemClickListener(listener: OnItemClickListener){
        mListener = listener
    }

    class TeamViewHolder(itemView: View, listener: OnItemClickListener)
        : RecyclerView.ViewHolder(itemView) {
        val team: TextView = itemView.findViewById(R.id.nama_team)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val itemView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.team_item, parent, false)

        return TeamViewHolder(itemView, mListener)
    }

    override fun getItemCount(): Int {
        return teamList.size
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
     holder.team.text = teamList[position]
    }

}