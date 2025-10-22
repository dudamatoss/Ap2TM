package com.example.ap2tm

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.ap2tm.data.model.Todo


class DetailsActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val id = findViewById<TextView>(R.id.idTodo)
        val title = findViewById<TextView>(R.id.todoTitle)
        val description = findViewById<TextView>(R.id.movieDescription)
        val date = findViewById<TextView>(R.id.createdAt)
        val user = findViewById<TextView>(R.id.openedBy)

        intent.extras?.getSerializable("todo", Todo::class.java).also {
            it?.let {
                id.text = it.id.toString()
                title.text = it.title
                description.text = it.movieDescription
                date.text = it.createdAt
                user.text = it.openedBy
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}