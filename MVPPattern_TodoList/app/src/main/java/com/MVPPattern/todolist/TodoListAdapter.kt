package com.MVPPattern.todolist

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.MVPPattern.todolist.Model.DataModel
import com.MVPPattern.todolist.Presenter.Contract
import com.MVPPattern.todolist.Presenter.MainPresenter

class TodoListAdapter(private val mContext:Context): RecyclerView.Adapter<TodoListAdapter.ViewHolder>() {

    private var todoList: List<DataModel> = emptyList()

    override fun getItemCount(): Int {
        return todoList.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.recyclerview_item, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(todoList[position])

        holder.itemView.setOnClickListener {
            Log.d("loglog", "position:$position")
            /*holder.bind(todoList[position])*/
        }
    }

    //프레젠터에서 데이터 가져오기
    fun setData(todoList : List<DataModel>){
        this.todoList = todoList

        notifyDataSetChanged()
    }

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val todoTitle : TextView = view.findViewById(R.id.todoTitle)
        private val todoContent : TextView = view.findViewById(R.id.todoContent)
        private val todoDate = view.findViewById<TextView>(R.id.todoDate)

        fun bind(item : DataModel) {
            todoTitle.text = item.title
            todoContent.text = item.content
            todoDate.text = item.date
        }
    }
}