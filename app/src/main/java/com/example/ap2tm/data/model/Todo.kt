package com.example.ap2tm.data.model

import java.io.Serializable

data class Todo(
    val id: Int,
    val title: String,
    val movieDescription: String,
    val check: Boolean,
    val createdAt: String,
    val openedBy: String
) : Serializable