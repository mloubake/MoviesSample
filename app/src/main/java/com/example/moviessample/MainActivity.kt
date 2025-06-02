package com.example.moviessample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviessample.Adapter.MoviesAdapter
import com.example.moviessample.Adapter.SectionsAdapter
import com.example.moviessample.Data.MockedMovies
import com.example.moviessample.Data.Movie
import com.example.moviessample.Data.Section

class MainActivity : ComponentActivity() {
    lateinit var sectionsRecyclerView: RecyclerView
    var popularRecyclerView: RecyclerView? = null
    var nowPlaytingRecyclerView: RecyclerView? = null
    var testeRV: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val popularSection = Section("Popular", popularRecyclerView)
        val nowPlayingSection = Section("Now Playing", nowPlaytingRecyclerView)
        val testesect = Section("Teste", testeRV)
        val sectionsList: List<Section> = listOf(popularSection, nowPlayingSection, testesect)

        sectionsRecyclerView = findViewById(R.id.sections_vertical_recyclerView)
        sectionsRecyclerView.setHasFixedSize(true)
        sectionsRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        sectionsRecyclerView.adapter = SectionsAdapter(this, sectionsList)

    }
}
