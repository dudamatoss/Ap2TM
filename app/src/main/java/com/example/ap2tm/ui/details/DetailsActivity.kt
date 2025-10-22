package com.example.ap2tm.ui.details

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.ap2tm.R
import com.example.ap2tm.data.model.Movie

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        setupToolbar()
        bindMovie()
    }

    private fun setupToolbar() {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun bindMovie() {
        val movie = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.extras?.getSerializable(EXTRA_MOVIE, Movie::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.extras?.getSerializable(EXTRA_MOVIE) as? Movie
        }

        val titleTextView: TextView = findViewById(R.id.movieTitle)
        val directorTextView: TextView = findViewById(R.id.movieDirector)
        val yearTextView: TextView = findViewById(R.id.movieYear)
        val synopsisTextView: TextView = findViewById(R.id.movieSynopsis)

        movie?.let {
            supportActionBar?.title = it.title
            titleTextView.text = it.title
            directorTextView.text = getString(R.string.movie_director_format, it.director)
            yearTextView.text = getString(R.string.movie_year_format, it.releaseYear)
            synopsisTextView.text = it.synopsis
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }
}
