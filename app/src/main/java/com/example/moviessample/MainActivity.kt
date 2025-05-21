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
    lateinit var freeToWatchRecyclerView: RecyclerView
    lateinit var nowPlaytingRecyclerView: RecyclerView
    var mockedMoviesList: List<Movie> = MockedMovies().movies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        freeToWatchRecyclerView = findViewById(R.id.freeToWatch_list)
        freeToWatchRecyclerView.setHasFixedSize(true)
        freeToWatchRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        freeToWatchRecyclerView.adapter = MoviesAdapter(this, mockedMoviesList)

        nowPlaytingRecyclerView = findViewById(R.id.nowPlaying_list)
        nowPlaytingRecyclerView.setHasFixedSize(true)
        nowPlaytingRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        nowPlaytingRecyclerView.adapter = MoviesAdapter(this, mockedMoviesList)

    }
}
