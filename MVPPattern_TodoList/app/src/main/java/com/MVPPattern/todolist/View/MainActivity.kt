package com.MVPPattern.todolist.View

import Dialog.MyDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.MVPPattern.todolist.Fragment.TodoListFragment
import com.MVPPattern.todolist.Presenter.Contract
import com.MVPPattern.todolist.R
import com.MVPPattern.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private lateinit var todoListFragment : TodoListFragment
    private lateinit var bindingMain : ActivityMainBinding
    private lateinit var myDialog : MyDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)




        init()
    }

    private fun init(){
        initFragment()
        dialog()
    }

    private fun dialog(){
        myDialog = MyDialog(this)
        bindingMain.fabWrite.setOnClickListener {
            myDialog.show()
        }
    }

    private fun initFragment(){
        todoListFragment = TodoListFragment(this)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentLayout, todoListFragment)
            .commit()
    }



}