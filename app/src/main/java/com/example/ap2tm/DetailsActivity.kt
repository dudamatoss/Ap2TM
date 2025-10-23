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
        findViewById<TextView>(R.id.idTodo).text = movie.id.toString()
        findViewById<TextView>(R.id.todoTitle).text = movie.title
        findViewById<TextView>(R.id.movieDescription).text = movie.movieDescription
        findViewById<TextView>(R.id.createdAt).text = getString(R.string.movie_release_at, movie.createdAt)
        findViewById<TextView>(R.id.openedBy).text = getString(R.string.movie_directed_by, movie.openedBy)
        findViewById<TextView>(R.id.movieStatus).text = if (movie.check) {
            getString(R.string.movie_watched_message)
        } else {
            getString(R.string.movie_not_watched_message)
        }
    }
}
