package com.MVPPattern.todolist.Presenter

interface Contract {
    interface View{
        fun showList(list : String)
    }

    interface Presenter{
        fun editTodo(todoList : String)
    }

}