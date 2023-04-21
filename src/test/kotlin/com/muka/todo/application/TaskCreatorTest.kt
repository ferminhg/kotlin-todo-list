package com.muka.todo.application

import com.muka.todo.domain.Task
import com.muka.todo.infrastructure.persitence.InMemoryTaskRepository
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

private const val TITLE_TASK = "A Task"

class TaskCreatorTest {

    @Test
    fun `run taskCreator to add a new task`() {
        val repository = InMemoryTaskRepository()
        val creator = TaskCreator(repository)
        val task = Task.from(TITLE_TASK)
        creator.execute(TITLE_TASK)
        assertEquals(task, repository.find(TITLE_TASK))
    }
}
