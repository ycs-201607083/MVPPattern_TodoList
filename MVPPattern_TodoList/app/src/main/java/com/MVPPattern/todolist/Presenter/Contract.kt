package com.MVPPattern.todolist.Presenter

import com.MVPPattern.todolist.Model.DataModel

interface Contract {
    interface View{
        fun showTodoList(todoList : List<DataModel>)
    }

    interface Presenter{
        fun loadTodoList()
    }

}