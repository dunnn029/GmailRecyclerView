package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lấy dữ liệu từ FakeDataSource.kt
        val mailList = FakeDataSource().getListMail()

        // Tạo Adapter cung cấp dữ liệu cho listView
        val recyclerViewAdapter = MailAdapter(mailList)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val linearLayoutManager: LinearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = recyclerViewAdapter
    }
}