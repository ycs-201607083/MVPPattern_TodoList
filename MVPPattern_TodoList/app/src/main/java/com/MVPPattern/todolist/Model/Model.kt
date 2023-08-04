package com.MVPPattern.todolist.Model

import com.MVPPattern.todolist.Presenter.Contract

class Model(presenter: Contract.Presenter) {
    private var presenter : Contract.Presenter? = null

   init{
        this.presenter = presenter
    }

}