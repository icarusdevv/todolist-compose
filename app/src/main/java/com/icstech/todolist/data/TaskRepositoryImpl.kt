package com.icstech.todolist.data

import kotlinx.coroutines.flow.Flow

class TaskRepositoryImpl(private val taskDAO: TaskDAO): TaskRepository {
    override fun getAllTasks(): Flow<List<Task>> = taskDAO.getAllTasks()

    override fun getTask(id: Int): Flow<Task> = taskDAO.getTask(id)

    override suspend fun insertTask(task: Task) = taskDAO.insert(task)

    override suspend fun deleteTask(task: Task) = taskDAO.delete(task)

    override suspend fun updateTask(task: Task) = taskDAO.update(task)
}