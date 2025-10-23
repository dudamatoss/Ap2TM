package com.example.ap2tm.ui.adapter

import android.graphics.Paint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ap2tm.R
import com.example.ap2tm.data.model.Todo
import com.google.android.material.checkbox.MaterialCheckBox

class TodoViewHolder(
    itemView: View,
    private val onDelete: (Todo) -> Unit,
    private val onDetails: (Todo) -> Unit
) : RecyclerView.ViewHolder(itemView) {
    private val title: TextView = itemView.findViewById(R.id.titleTodo)
    private val movieDescription: TextView = itemView.findViewById(R.id.todoMovieDescription)
    private val todoCheck: MaterialCheckBox = itemView.findViewById(R.id.todoCheck)
    private val actionDelete: TextView = itemView.findViewById(R.id.actionDelete)
    private val actionDetails: TextView = itemView.findViewById(R.id.actionDetails)

    fun bind(todo: Todo) {
        title.text = todo.title
        movieDescription.text = todo.movieDescription

        todoCheck.setOnCheckedChangeListener(null)
        todoCheck.isChecked = todo.check
        updateWatchedState(todo.check)

        todoCheck.setOnCheckedChangeListener { _, isChecked ->
            updateWatchedState(isChecked)
        }

        itemView.setOnClickListener {
            onDetails(todo)
        }
        actionDetails.setOnClickListener {
            onDetails(todo)
        }

        val longClickListener = View.OnLongClickListener {
            onDelete(todo)
            true
        }
        itemView.setOnLongClickListener(longClickListener)
        actionDelete.setOnLongClickListener(longClickListener)
    }

    private fun updateWatchedState(isWatched: Boolean) {
        val strikeFlag = if (isWatched) Paint.STRIKE_THRU_TEXT_FLAG else 0
        title.paintFlags = strikeFlag
        movieDescription.paintFlags = strikeFlag
        actionDetails.visibility = if (isWatched) View.GONE else View.VISIBLE
        actionDelete.visibility = if (isWatched) View.GONE else View.VISIBLE
    }
}
