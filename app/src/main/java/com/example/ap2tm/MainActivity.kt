package com.example.ap2tm

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.ap2tm.data.TodoRepository
import com.example.ap2tm.data.model.Todo
import com.example.ap2tm.ui.adapter.TodoAdapter
import com.google.android.material.color.MaterialColors
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private val repository = TodoRepository()
    private lateinit var recyclerView: RecyclerView
    private lateinit var emptyStateCard: View
    private lateinit var root: View
    private lateinit var adapter: TodoAdapter

    private val movies = mutableListOf<Todo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        root = findViewById(R.id.main)
        recyclerView = findViewById(R.id.recyclerView)
        emptyStateCard = findViewById(R.id.emptyStateCard)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        setupInsets()
        setupRecycler()
        loadMovies()
    }

    private fun setupInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(root) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun setupRecycler() {
        adapter = TodoAdapter(
            onDelete = { movie -> removeMovie(movie) },
            onDetails = { movie -> openDetails(movie) }
        )
        recyclerView.adapter = adapter
    }

    private fun loadMovies() {
        movies.clear()
        movies.addAll(repository.getTodos())
        adapter.submitList(movies.toList())
        toggleEmptyState()
    }

    private fun removeMovie(movie: Todo) {
        val index = movies.indexOfFirst { it.id == movie.id }
        if (index != -1) {
            movies.removeAt(index)
            adapter.submitList(movies.toList())
            toggleEmptyState()
            showRemovalSnackbar(movie)
        }
    }

    private fun openDetails(movie: Todo) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("todo", movie)
        startActivity(intent)
    }

    private fun toggleEmptyState() {
        emptyStateCard.isVisible = movies.isEmpty()
        recyclerView.isVisible = movies.isNotEmpty()
    }

    private fun showRemovalSnackbar(movie: Todo) {
        Snackbar.make(root, getString(R.string.movie_removed_message, movie.title), Snackbar.LENGTH_LONG).apply {
            val background = MaterialColors.getColor(
                root,
                com.google.android.material.R.attr.colorSurfaceVariant,
                ContextCompat.getColor(this@MainActivity, R.color.badge_background)
            )
            val textColor = MaterialColors.getColor(
                root,
                com.google.android.material.R.attr.colorOnSurfaceVariant,
                ContextCompat.getColor(this@MainActivity, R.color.text_primary)
            )
            setBackgroundTint(background)
            setTextColor(textColor)
            setTextMaxLines(3)
            anchorView = emptyStateCard.takeIf { it.isVisible }
        }.show()
    }
}
