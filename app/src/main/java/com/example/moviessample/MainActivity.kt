package com.example.moviessample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviessample.Adapter.ContentRowAdapter
import com.example.moviessample.Data.MockedMovies
import com.example.moviessample.Data.Movie
import com.example.moviessample.Data.ContentRow

class MainActivity : ComponentActivity() {
    lateinit var contentRowRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val mockedMoviesList: List<Movie> = MockedMovies().movies

        val popularContentRow = ContentRow("Popular", mockedMoviesList)
        val nowPlayingContentRow = ContentRow("Now Playing", mockedMoviesList)
        val testeContentRow = ContentRow("Teste", mockedMoviesList)
        val contentRowsList: List<ContentRow> = listOf(popularContentRow, nowPlayingContentRow, testeContentRow)

        contentRowRecyclerView = findViewById(R.id.contentRow_recyclerView)
        contentRowRecyclerView.setHasFixedSize(true)
        contentRowRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        contentRowRecyclerView.adapter = ContentRowAdapter(this, contentRowsList)

        //ContentDetails
    }
}
