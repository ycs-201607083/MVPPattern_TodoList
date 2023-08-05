package com.MVPPattern.todolist.DataClass

data class TodoDataClass(var title: String, var content: String) {

    object TodoObject {
        private val todoList = mutableListOf<TodoDataClass>()

        //리스트 추가
        fun addTodoItem(todoData: TodoDataClass) {
            todoList.add(todoData)
        }


        fun getTodoList(): List<TodoDataClass> {
            return todoList.toList()
        }
    }
}

