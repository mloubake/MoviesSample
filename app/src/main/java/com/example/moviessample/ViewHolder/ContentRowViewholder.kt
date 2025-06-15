package com.example.moviessample.ViewHolder

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviessample.Adapter.MoviesAdapter
import com.example.moviessample.Data.ContentRow
import com.example.moviessample.R

class ContentRowViewholder(context: Context, view: View): RecyclerView.ViewHolder(view) {
    val contentRowTitle: TextView
    val contentRowPosters: RecyclerView

    init {
        contentRowTitle = view.findViewById(R.id.contentRow_title)
        contentRowPosters = view.findViewById(R.id.contentRow_list)

        contentRowPosters.setHasFixedSize(true)
        contentRowPosters.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }


    fun bind(context: Context, contentRow: ContentRow) {
        contentRowTitle.text = contentRow.title
        contentRowPosters.adapter = MoviesAdapter(context, contentRow.contentRowsList)
    }
}