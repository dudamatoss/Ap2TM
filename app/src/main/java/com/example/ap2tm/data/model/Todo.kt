package com.example.ap2tm.data.model

import java.io.Serializable

data class Todo(
    val id: Int,
    val title: String,
    val synopsis: String,
    val watched: Boolean,
    val releaseDate: String,
    val director: String
) : Serializable
