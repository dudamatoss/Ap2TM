package com.example.ap2tm

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.ap2tm.data.TodoRepository
import com.example.ap2tm.data.model.Todo
import com.example.ap2tm.ui.adapter.TodoAdapter
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private val repository = TodoRepository()
    private val movies = mutableListOf<Todo>()

    private lateinit var root: View
    private lateinit var adapter: TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        root = findViewById(R.id.main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val toolbar: Toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)
        setupInsets()

        adapter = TodoAdapter(
            onDelete = ::removeMovie,
            onDetails = ::openDetails
        )
        recyclerView.adapter = adapter

        loadMovies()
    }

    private fun setupInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(root) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun loadMovies() {
        movies.clear()
        movies.addAll(repository.getTodos())
        adapter.submitList(movies.toList())
    }

    private fun removeMovie(movie: Todo) {
        val index = movies.indexOfFirst { it.id == movie.id }
        if (index != -1) {
            movies.removeAt(index)
            adapter.submitList(movies.toList())
            showRemovalSnackbar(movie)
        }
    }

    private fun openDetails(movie: Todo) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("todo", movie)
        startActivity(intent)
    }

    private fun showRemovalSnackbar(movie: Todo) {
        Snackbar.make(root, getString(R.string.movie_removed_message, movie.title), Snackbar.LENGTH_LONG)
            .show()
    }
}
