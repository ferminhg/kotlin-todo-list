package com.muka.todo.application

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TaskCreatorTest{

    @Test
    fun `run taskCreator to add a new task`() {
        val creator = TaskCreator()
        assertTrue(creator.execute("A Task"))
    }
}
