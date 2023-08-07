package com.MVPPattern.todolist.Presenter

import android.content.Context
import com.MVPPattern.todolist.Model.DataModel

class MainPresenter(private val view: Contract.View) : Contract.Presenter{

    private val tasks = listOf(
        DataModel("1", "Task 1", "Description 1"),
        DataModel("2", "Task 2", "Description 2"),
        DataModel("3", "Task 3", "Description 3"),
    )

    override fun loadTodoList() {
        view.showTodoList(tasks)
    }
}