package com.example.superherolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    val superHeroList = listOf(
        SuperHero("Spiderman", "Peter Parker","Marvel","https://cursoKotlin.com/wp-content/uploads/2017/07/spiderman.jpg"),
        SuperHero("Batman", "Bruce Wayne","DC","https://cursoKotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        SuperHero("DareDevil", "Matthew Michael Murdock","Marvel","https://cursoKotlin.com/wp-content/uploads/2017/07/daredevil.jpg"),
        SuperHero("Flash", "Jay Garrick","DC","https://cursoKotlin.com/wp-content/uploads/2017/07/flash.png"),
        SuperHero("Thor", "Thor Odison","Marvel","https://cursoKotlin.com/wp-content/uploads/2017/07/thor.jpg"),
        SuperHero("Wolverine", "James Howlett","DC","https://cursoKotlin.com/wp-content/uploads/2017/07/logan.jpeg")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
    }

    fun initRecycler(){
        val rv  = findViewById<RecyclerView>(R.id.rvSuperHero)
        rv.layoutManager = LinearLayoutManager(this)
        val adapter = HeroAdapter(this,superHeroList)
        rv.adapter= adapter
    }
}