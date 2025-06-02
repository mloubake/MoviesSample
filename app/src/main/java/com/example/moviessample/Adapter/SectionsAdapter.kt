package com.example.moviessample.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviessample.Data.Section
import com.example.moviessample.R
import com.example.moviessample.ViewHolder.SectionsViewholder

class SectionsAdapter(val context: Context, val sectionsList: List<Section>): RecyclerView.Adapter<SectionsViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionsViewholder {
        val view = LayoutInflater.from(context).inflate(R.layout.section_recyclerview, null, false)
        return SectionsViewholder(context, view)
    }

    override fun onBindViewHolder(holder: SectionsViewholder, position: Int) {
        holder.bind(sectionsList[position])
    }

    override fun getItemCount(): Int {
        return sectionsList.size
    }
}