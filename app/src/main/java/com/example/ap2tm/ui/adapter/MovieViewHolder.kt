package com.example.ap2tm.ui.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ap2tm.R
import com.example.ap2tm.data.model.Movie

class MovieViewHolder(
    itemView: View,
    private val onMovieSelected: (Movie) -> Unit,
    private val onMovieRemoved: (Movie) -> Unit
) : RecyclerView.ViewHolder(itemView) {

    private val titleTextView: TextView = itemView.findViewById(R.id.textMovieTitle)
    private val directorTextView: TextView = itemView.findViewById(R.id.textMovieDirector)
    private val yearTextView: TextView = itemView.findViewById(R.id.textMovieYear)
    private val synopsisTextView: TextView = itemView.findViewById(R.id.textMovieSynopsis)

    fun bind(movie: Movie) {
        titleTextView.text = movie.title
        directorTextView.text = itemView.context.getString(R.string.movie_director_format, movie.director)
        yearTextView.text = itemView.context.getString(R.string.movie_year_format, movie.releaseYear)
        synopsisTextView.text = movie.synopsis

        itemView.setOnClickListener { onMovieSelected(movie) }
        itemView.setOnLongClickListener {
            onMovieRemoved(movie)
            true
        }
    }
}
