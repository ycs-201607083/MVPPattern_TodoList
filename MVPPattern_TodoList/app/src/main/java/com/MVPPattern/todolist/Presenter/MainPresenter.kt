package com.MVPPattern.todolist.Presenter

import com.MVPPattern.todolist.Model.Model
import kotlin.contracts.contract

class MainPresenter(contract: Contract.View) : Contract.Presenter {
    var view: Contract.View? = null
    var model: Model? = null

    init {
        this.view = view
        model = Model(this)
    }
    override fun editTodo(todoList: String) {

    }


}