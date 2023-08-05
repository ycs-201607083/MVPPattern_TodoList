package com.MVPPattern.todolist.Presenter

import com.MVPPattern.todolist.DataClass.TodoDataClass
import com.MVPPattern.todolist.Model.Model
import kotlin.contracts.contract

class MainPresenter(private val view : Contract.view): Contract.Presenter{
    override fun loadTodoList() {
        val todoList = TodoDataClass.TodoObject.getTodoList()
        view.showList(todoList)
    }


}