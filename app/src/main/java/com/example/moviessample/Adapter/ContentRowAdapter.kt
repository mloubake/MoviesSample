package com.example.moviessample.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviessample.Data.ContentRow
import com.example.moviessample.R
import com.example.moviessample.ViewHolder.ContentRowViewholder

class ContentRowAdapter(val context: Context, val contentRowsList: List<ContentRow>): RecyclerView.Adapter<ContentRowViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentRowViewholder {
        val view = LayoutInflater.from(context).inflate(R.layout.contentrow_recyclerview, null, false)
        return ContentRowViewholder(context, view)
    }

    override fun onBindViewHolder(holder: ContentRowViewholder, position: Int) {
        holder.bind(context, contentRowsList[position])
    }

    override fun getItemCount(): Int {
        return contentRowsList.size
    }
}