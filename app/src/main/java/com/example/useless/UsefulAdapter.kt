package com.example.useless

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UsefulAdapter internal constructor(context: Context)
    : RecyclerView.Adapter<UsefulAdapter.UsefulViewHolder>(){

    //A reference to display ViewHolder
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    //A reference to useful record(s)
    private val usefulRecords = emptyList<Usefull>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsefulViewHolder {
        val itemView = inflater.inflate(R.layout.recyclerview_item, parent, false)

        return UsefulViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return usefulRecords.size
    }

    override fun onBindViewHolder(holder: UsefulViewHolder, position: Int) {
        val usefulRec = usefulRecords.get(position)

        holder.textViewName.text = usefulRec.name

        holder.textViewAge.text = usefulRec.age.toString()
    }

    inner class UsefulViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView){
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)
        val textViewAge: TextView = itemView.findViewById(R.id.textViewAge)
    }

}