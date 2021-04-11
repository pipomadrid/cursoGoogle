package com.example.practicarecyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.practicarecyclerview1.adapter.ItemAdapter
import com.example.practicarecyclerview1.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myDataSet = DataSource().cargarCantantes()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler)

        recyclerView.adapter = ItemAdapter(this, myDataSet)

        recyclerView.setHasFixedSize(true)



    }
}