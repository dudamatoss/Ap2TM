package com.example.ap2tm.ui.adapter

import android.graphics.Paint
import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.ap2tm.R
import com.example.ap2tm.data.model.Todo
import com.google.android.material.button.MaterialButton
import com.google.android.material.checkbox.MaterialCheckBox

class TodoViewHolder(
    itemView: View,
    private val onDelete: (Todo) -> Unit,
    private val onDetails: (Todo) -> Unit
) : RecyclerView.ViewHolder(itemView) {
    private val title: TextView = itemView.findViewById(R.id.titleTodo)
    private val movieDescription: TextView = itemView.findViewById(R.id.todoMovieDescription)
    private val releaseDate: TextView = itemView.findViewById(R.id.todoReleaseDate)
    private val director: TextView = itemView.findViewById(R.id.todoDirector)
    private val todoCheck: MaterialCheckBox = itemView.findViewById(R.id.todoCheck)
    private val detailsButton: MaterialButton = itemView.findViewById(R.id.actionDetails)

    fun bind(todo: Todo) {
        title.text = todo.title
        movieDescription.text = todo.movieDescription
        releaseDate.text = todo.createdAt
        director.text = itemView.context.getString(R.string.movie_director_format, todo.openedBy)

        todoCheck.isChecked = todo.check
        applyWatchedStyle(todo.check)

        itemView.setOnClickListener {
            onDetails(todo)
        }
        detailsButton.setOnClickListener {
            onDetails(todo)
        }

        itemView.setOnLongClickListener {
            onDelete(todo)
            true
        }
    }

    private fun applyWatchedStyle(isWatched: Boolean) {
        val strikeFlag = if (isWatched) Paint.STRIKE_THRU_TEXT_FLAG else 0
        title.paintFlags = strikeFlag
        movieDescription.paintFlags = strikeFlag
        detailsButton.isVisible = !isWatched
    }
}
