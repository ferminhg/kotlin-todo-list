package com.muka.todo.infrastructure.persitence

import com.muka.todo.domain.Task
import com.muka.todo.domain.TaskRepository

class InMemoryTaskRepository : TaskRepository {
    var savedTask: Task? = null
    override fun save(task: Task) {
        savedTask = task
    }

    fun find(titleToFind: String) = when (titleToFind) {
            savedTask?.title -> savedTask
            else -> null
        }
}
