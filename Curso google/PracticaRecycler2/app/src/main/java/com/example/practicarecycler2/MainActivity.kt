package com.example.practicarecycler2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.practicarecycler2.adapter.FrasesAdapter
import com.example.practicarecycler2.data.dataSource
import com.example.practicarecycler2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val myDataSet = dataSource().cargaFrases()

        val recycler = binding.recycler

        recycler.adapter = FrasesAdapter(this,myDataSet)

        recycler.setHasFixedSize(true)





    }
}