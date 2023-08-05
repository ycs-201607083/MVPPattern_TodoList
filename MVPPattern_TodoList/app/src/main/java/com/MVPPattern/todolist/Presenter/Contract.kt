package com.MVPPattern.todolist.Presenter

import com.MVPPattern.todolist.DataClass.TodoDataClass

interface Contract {
    interface view{
        fun showList(todoList : List<TodoDataClass>)
    }

    interface Presenter{
        fun loadTodoList()
    }

}