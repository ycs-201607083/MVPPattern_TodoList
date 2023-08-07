package Dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.MVPPattern.todolist.databinding.DialogBinding

class MyDialog(private var mContext: Context) : Dialog(mContext) {
    private lateinit var bindingDialog: DialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingDialog = DialogBinding.inflate(layoutInflater)

        setContentView(bindingDialog.root)
        window!!.setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT)
        setCanceledOnTouchOutside(false)
        init()
    }

    fun init() {
        blackDialog()

        bindingDialog.dialogCloseBtn.setOnClickListener {
            dismiss()
        }

    }

    fun blackDialog() {
        var Content = bindingDialog.dialogContent
        var Title = bindingDialog.dialogTitle

        bindingDialog.dialogOKBtn.setOnClickListener {
            if (Content.text.isNullOrEmpty() || Title.text.isNullOrEmpty()) {
                Toast.makeText(mContext, "빈칸을 채워주세요.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}