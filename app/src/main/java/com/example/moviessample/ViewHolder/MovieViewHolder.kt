package com.example.moviessample.ViewHolder

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moviessample.Data.Movie
import com.example.moviessample.R

class MovieViewHolder(val context: Context, val view: View): RecyclerView.ViewHolder(view) {
    lateinit var movieTitle: TextView
    lateinit var movieImageUrl: ImageView
    lateinit var movieYear: TextView
    lateinit var movieRating: TextView

    fun bind(movie: Movie) {
        movieTitle = view.findViewById(R.id.movie_title)
        movieImageUrl = view.findViewById(R.id.movie_image)
        movieRating = view.findViewById(R.id.movie_rating)
        movieYear = view.findViewById(R.id.movie_year)

        movieTitle.text = movie.title
        movieYear.text = movie.year
        movieRating.text = movie.rating.toString()

    }
}