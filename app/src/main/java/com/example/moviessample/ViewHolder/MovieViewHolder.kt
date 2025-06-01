package com.example.moviessample.ViewHolder

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviessample.Data.Movie
import com.example.moviessample.R

class MovieViewHolder(val context: Context, view: View): RecyclerView.ViewHolder(view) {
    var movieTitle: TextView
    var movieImageUrl: ImageView
    var movieYear: TextView
    var movieRating: TextView

    init {
        movieTitle = view.findViewById(R.id.movie_title)
        movieImageUrl = view.findViewById(R.id.movie_image)
        movieYear = view.findViewById(R.id.movie_year)
        movieRating = view.findViewById(R.id.movie_rating)
    }

    fun bind(movie: Movie) {
        movieTitle.text = movie.title
        movieYear.text = movie.year.toString().dropLast(6)
        movieRating.text = movie.rating.toString()
        val posterPath = "https://image.tmdb.org/t/p/original${movie.imageUrl}"

        Glide.with(context)
            .load(posterPath)
            .into(movieImageUrl)

    }
}