package Presenter


interface MainContract {
    interface View {
        fun showResult(result: Int)
    }

    interface Presenter {
        fun addNumbers(num1: Int, num2: Int)
    }
}
