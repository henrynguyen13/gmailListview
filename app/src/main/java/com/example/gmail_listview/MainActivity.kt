package com.example.gmail_listview

import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val items: ArrayList<GmailModel> = arrayListOf()
    private val mAdapter: Adapter = Adapter(items)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setLogo(R.drawable.menu)
        supportActionBar?.setDisplayUseLogoEnabled(true)

        repeat(10) {
            items.add(
                GmailModel(
                    sender = "ctt.sis.edu.vn",
                    title = "Vv đóng học phí kỳ 2023.1",
                    content = "Chi tiết kế hoạch nộp học phí kỳ 2023.1",
                    time = "12:30 AM",
                    logoPath = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfGr1do83pQvvYqz4mCXOr2xRbP5QP2Z5k2A&usqp=CAU",
                    isMark = false
                )
            )
        }

        findViewById<ListView>(R.id.list_view).adapter = mAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true
    }
}