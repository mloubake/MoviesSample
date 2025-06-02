package com.example.moviessample.ViewHolder

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviessample.Adapter.MoviesAdapter
import com.example.moviessample.Data.MockedMovies
import com.example.moviessample.Data.Movie
import com.example.moviessample.Data.Section
import com.example.moviessample.R

class SectionsViewholder(context: Context, view: View): RecyclerView.ViewHolder(view) {
    val sectionTitle: TextView
    val sectionPosters: RecyclerView
    var mockedMoviesList: List<Movie> = MockedMovies().movies

    init {
        sectionTitle = view.findViewById(R.id.section_title)
        sectionPosters = view.findViewById(R.id.poster_list)

        sectionPosters.setHasFixedSize(true)
        sectionPosters.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        sectionPosters.adapter = MoviesAdapter(context, mockedMoviesList)
    }


    fun bind(section: Section) {
        sectionTitle.text = section.title
        section.postersList = sectionPosters
    }
}