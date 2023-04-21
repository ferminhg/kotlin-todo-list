package com.muka.todo.application

import com.muka.todo.domain.Task
import com.muka.todo.domain.TaskRepository

class TaskCreator(private val repository: TaskRepository) {
    fun execute(title: String) {
        Task.from(title).let { repository.save(it) }
    }
}
