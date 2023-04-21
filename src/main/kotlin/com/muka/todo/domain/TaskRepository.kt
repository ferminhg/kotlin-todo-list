package com.muka.todo.domain

interface TaskRepository {
    fun save(task: Task)
}
