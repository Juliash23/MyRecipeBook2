package com.example.myrecipebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(private val datalist: ArrayList<DataClass>): RecyclerView.Adapter<AdapterClass.ViewHolderClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterClass.ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return  ViewHolderClass(itemView)

    }

    override fun onBindViewHolder(holder: AdapterClass.ViewHolderClass, position: Int) {
        val currentItem = datalist[position]
        holder.rvImage.setImageResource(currentItem.dataImage)
        holder.rvTitle.text = currentItem.dataTitle
    }

    override fun getItemCount(): Int {
        return datalist.size
    }
    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val rvImage:ImageView = itemView.findViewById(R.id.image)
        val rvTitle: TextView = itemView.findViewById(R.id.title)

    }

}