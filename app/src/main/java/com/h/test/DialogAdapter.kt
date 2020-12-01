package com.h.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DialogAdapter(private val dialogList: List<DialogItem>) : RecyclerView.Adapter<DialogAdapter.DialogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DialogViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_dialog,parent,false)
        return DialogViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DialogViewHolder, position: Int) {
        val currentItem = dialogList[position]
        holder.textLoc.text=currentItem.textLoc
//        holder.itemView.
    }

    override fun getItemCount() = dialogList.size

    class DialogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textLoc : TextView=itemView.findViewById(R.id.textLoc)

    }
}