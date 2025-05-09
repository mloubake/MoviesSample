package com.example.moviessample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviessample.Adapter.MoviesAdapter
import com.example.moviessample.Data.MockedMovies
import com.example.moviessample.Data.Movie

class MainActivity : ComponentActivity() {
    lateinit var moviesRecyclerView: RecyclerView
    var mockedMoviesList: List<Movie> = MockedMovies().movies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        moviesRecyclerView = findViewById(R.id.movies_list)

        println("mockedMoviesList $mockedMoviesList")


        moviesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        moviesRecyclerView.adapter = MoviesAdapter(this, mockedMoviesList)
    }
}
