package com.android.example.recyclerview_learning

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ListSelectionViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {

    val listPosition = itemView.findViewById(R.id.itemNumber) as TextView
    val listTittle = itemView.findViewById<TextView>(R.id.itemString)




}