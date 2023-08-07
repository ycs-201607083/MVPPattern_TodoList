package Presenter

import Model.CalculatorModel

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    private val calculatorModel = CalculatorModel()

    override fun addNumbers(num1: Int, num2: Int) {
        val result = calculatorModel.addNumbers(num1, num2)
        view.showResult(result)
    }
}