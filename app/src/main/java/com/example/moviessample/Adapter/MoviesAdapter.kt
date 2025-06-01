package com.example.moviessample.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviessample.Data.Movie
import com.example.moviessample.R
import com.example.moviessample.ViewHolder.MovieViewHolder

class MoviesAdapter(val context: Context, val moviesList: List<Movie>): RecyclerView.Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.movie_poster, null, false)
        return MovieViewHolder(context, view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(moviesList[position])
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }
}