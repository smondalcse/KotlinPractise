package com.sanat.kotlinpractise.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sanat.kotlinpractise.R
import com.sanat.kotlinpractise.adapter.TodoAdapter
import com.sanat.kotlinpractise.model.TodoModel

class RecycleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)

        val actionbar = supportActionBar
        actionbar!!.title = "RecycleView"
        actionbar.setDisplayHomeAsUpEnabled(true)

        var todoList = mutableListOf(
            TodoModel("Bangladesh", false),
            TodoModel("India", false),
            TodoModel("Pakistan", false),
            TodoModel("Nepal", false),
            TodoModel("Bhutan", false),
            TodoModel("Iran", false),
            TodoModel("USA", false),
            TodoModel("England", false),
            TodoModel("Finland", false),
            TodoModel("Australia", false),
            TodoModel("Uganda", false),
            TodoModel("Canada", false),
        )

        val adapter = TodoAdapter(todoList)
        val rvTodo = findViewById<RecyclerView>(R.id.rvTodo)
        rvTodo.adapter = adapter
        rvTodo.layoutManager = LinearLayoutManager(this)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val etItem = findViewById<EditText>(R.id.etItem)

        btnAdd.setOnClickListener {
            val title = etItem.text.toString()
            todoList.add(TodoModel(title, false))
            adapter.notifyItemInserted(todoList.size - 1)
            etItem.text.clear()
            Toast.makeText(this, "Added successfully.", Toast.LENGTH_LONG).show()
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}