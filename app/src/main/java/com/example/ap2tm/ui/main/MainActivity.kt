package com.example.ap2tm.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.ap2tm.R
import com.example.ap2tm.data.MovieRepository
import com.example.ap2tm.data.model.Movie
import com.example.ap2tm.ui.adapter.MovieAdapter
import com.example.ap2tm.ui.details.DetailsActivity

class MainActivity : AppCompatActivity() {

    private val repository = MovieRepository()
    private val movies = mutableListOf<Movie>()
    private lateinit var movieAdapter: MovieAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var emptyStateView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupToolbar()
        setupViews()
        setupRecyclerView()
        loadMovies()
    }

    private fun setupToolbar() {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(true)
        supportActionBar?.title = getString(R.string.toolbar_title)
    }

    private fun setupViews() {
        recyclerView = findViewById(R.id.recyclerView)
        emptyStateView = findViewById(R.id.emptyState)
    }

    private fun setupRecyclerView() {
        movieAdapter = MovieAdapter(
            onMovieSelected = { movie -> navigateToDetails(movie) },
            onMovieRemoved = { movie -> removeMovie(movie) }
        )
        recyclerView.adapter = movieAdapter
    }

    private fun loadMovies() {
        movies.clear()
        movies.addAll(repository.getMovies())
        movieAdapter.submitList(movies.toList())
        toggleEmptyState()
    }

    private fun navigateToDetails(movie: Movie) {
        val intent = Intent(this, DetailsActivity::class.java).apply {
            putExtra(DetailsActivity.EXTRA_MOVIE, movie)
        }
        startActivity(intent)
    }

    private fun removeMovie(movie: Movie) {
        val index = movies.indexOfFirst { it.id == movie.id }
        if (index != -1) {
            movies.removeAt(index)
            movieAdapter.submitList(movies.toList())
            toggleEmptyState()
            Toast.makeText(
                this,
                getString(R.string.movie_removed_message, movie.title),
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun toggleEmptyState() {
        val hasItems = movies.isNotEmpty()
        recyclerView.isVisible = hasItems
        emptyStateView.isVisible = !hasItems
    }
}
