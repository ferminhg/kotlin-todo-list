package com.muka.todo.domain

data class Task(val title: String, val completed: Boolean) {
    companion object {
        fun from(title: String) = Task(title, completed = false)
    }
}
