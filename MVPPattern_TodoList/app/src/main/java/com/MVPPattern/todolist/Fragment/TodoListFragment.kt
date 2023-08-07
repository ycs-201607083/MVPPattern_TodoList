package com.MVPPattern.todolist.Fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.MVPPattern.todolist.Model.DataModel
import com.MVPPattern.todolist.Presenter.Contract
import com.MVPPattern.todolist.Presenter.MainPresenter
import com.MVPPattern.todolist.TodoListAdapter
import com.MVPPattern.todolist.databinding.FragmentTodoListBinding

class TodoListFragment(var mContext : Context) : Fragment(), Contract.View{
    private var binding_todoList : FragmentTodoListBinding? = null
    private lateinit var adapter: TodoListAdapter
    private lateinit var todoListData : List<DataModel>
    private lateinit var presenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.mContext = context

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding_todoList = FragmentTodoListBinding.inflate(inflater, container, false)
        //객체생성
        presenter = MainPresenter(this)


        init()

        return binding_todoList?.root
    }
    private fun init(){
        recyclerView()
    }

    private fun recyclerView(){

        //리니어 레이아웃 매니저 사용
        val layoutManager = LinearLayoutManager(mContext)
        binding_todoList!!.todoListRecyclerView.layoutManager = layoutManager
        //어댑터 생성 및 연결
        adapter = TodoListAdapter(mContext)
        binding_todoList!!.todoListRecyclerView.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding_todoList = null
    }

    override fun showTodoList(todoList: List<DataModel>) {
        this.todoListData = todoList
        adapter.setData(todoListData)
    }


}