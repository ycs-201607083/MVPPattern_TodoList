package Dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
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
        setCanceledOnTouchOutside(true)
        setCancelable(true)
        init()
    }

    fun init() {
        blackDialog()

        bindingDialog.dialogCloseBtn.setOnClickListener {
            dismiss()
        }

    }

    fun blackDialog() {
        bindingDialog.dialogContent.setOnClickListener {
            if (bindingDialog.dialogContent.text.isNullOrBlank()) {
                Toast.makeText(mContext, "내용을 입력해주세요.", Toast.LENGTH_SHORT).show()
            }
        }

        bindingDialog.dialogTitle.setOnClickListener {
            if (bindingDialog.dialogTitle.text.isNullOrEmpty()) {
                Toast.makeText(mContext, "제목을 입력해주세요.", Toast.LENGTH_SHORT).show()
            }
        }

    }
}