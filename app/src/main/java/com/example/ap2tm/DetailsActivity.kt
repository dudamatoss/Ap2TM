package com.example.ap2tm

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.ap2tm.data.model.Todo

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }

        val movie = retrieveMovie() ?: return finish()
        bindMovie(movie)
    }

    private fun retrieveMovie(): Todo? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getSerializableExtra("todo", Todo::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getSerializableExtra("todo") as? Todo
        }
    }

    private fun bindMovie(movie: Todo) {
        val title = findViewById<TextView>(R.id.movieTitle)
        val director = findViewById<TextView>(R.id.movieDirector)
        val release = findViewById<TextView>(R.id.movieReleaseDate)
        val synopsis = findViewById<TextView>(R.id.movieSynopsis)
        val watchedLabel = findViewById<TextView>(R.id.movieWatchedLabel)

        title.text = movie.title
        director.text = getString(R.string.movie_director_format, movie.openedBy)
        release.text = movie.createdAt
        synopsis.text = movie.movieDescription
        watchedLabel.text = if (movie.check) {
            getString(R.string.movie_watched_message)
        } else {
            getString(R.string.movie_not_watched_message)
        }
    }
}
