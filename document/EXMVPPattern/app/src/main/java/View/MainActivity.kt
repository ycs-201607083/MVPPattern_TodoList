package View

import Presenter.MainContract
import Presenter.MainPresenter
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mvppattern.ex_mvppattern.R
import com.mvppattern.ex_mvppattern.databinding.ActivityMainBinding


//View
class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)

        val num1EditText = findViewById<EditText>(R.id.firstNumberEditText)
        val num2EditText = findViewById<EditText>(R.id.secondNumberEditText)
        val addButton = findViewById<Button>(R.id.addButton)

        addButton.setOnClickListener {
            val num1Value = num1EditText.text.toString().toIntOrNull() ?: 0
            val num2Value = num2EditText.text.toString().toIntOrNull() ?: 0
            presenter.addNumbers(num1Value, num2Value)
        }
    }

    override fun showResult(result: Int) {
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        resultTextView.text = "Result: $result"
    }
}