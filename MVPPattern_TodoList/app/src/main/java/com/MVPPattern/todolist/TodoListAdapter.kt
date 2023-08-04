package com.MVPPattern.todolist

import android.content.Context
import android.provider.ContactsContract.Profile
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.MVPPattern.todolist.DataClass.TodoDataClass

class TodoListAdapter(private val mContext:Context): RecyclerView.Adapter<TodoListAdapter.ViewHolder>() {

    /*lateinit var todoList: ArrayList<TodoDataClass>*/
    private var todoList: List<TodoDataClass> = emptyList() // 초기화

    override fun getItemCount(): Int {
        return todoList.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.recyclerview_item, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView.setOnClickListener {
            Log.d("loglog", "position:$position")
            /*holder.bind(todoList[position])*/
        }
    }

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val todoTitle : TextView = view.findViewById(R.id.todoTitie)
        private val todoContent : TextView = view.findViewById(R.id.todoContent)

        fun bind(item : TodoDataClass) {
            todoTitle.text = item.title
            todoContent.text = item.content
        }
    }
}