package com.example.gmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lấy dữ liệu từ FakeDataSource.kt
        val mailList = FakeDataSource().getListMail()

        // Tạo Adapter cung cấp dữ liệu cho listView
        val listViewAdapter = ListMailAdapter(mailList)
        val listView: ListView = findViewById(R.id.listView)
        listView.adapter = listViewAdapter
    }
}