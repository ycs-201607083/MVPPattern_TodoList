package com.MVPPattern.todolist.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.MVPPattern.todolist.Fragment.TodoListFragment
import com.MVPPattern.todolist.R
import com.MVPPattern.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var todoListFragment : TodoListFragment
    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        init()
    }

    private fun init(){
        initFragment()
    }

    private fun initFragment(){
        todoListFragment = TodoListFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentLayout, todoListFragment)
            .commit()
    }

}