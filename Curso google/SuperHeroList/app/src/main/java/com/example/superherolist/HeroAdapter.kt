package com.example.superherolist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class HeroAdapter(private val context: Context, val superHero: List<SuperHero>): RecyclerView.Adapter<HeroAdapter.HeroHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent,false))
    }

    override fun getItemCount(): Int = superHero.size

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        val heroe = superHero[position]
        holder.realName.text = heroe.realName
        holder.heroName.text= heroe.superHeroName
        holder.publisher.text = heroe.publisher
        Picasso.get().load(heroe.image).into(holder.heroImage)
        holder.render(heroe.superHeroName)

    }




    class HeroHolder(val view:View):RecyclerView.ViewHolder(view){

        val realName: TextView = view.findViewById(R.id.tvRealName)
        val heroName: TextView = view.findViewById(R.id.tvSuperHeroName)
        val publisher: TextView = view.findViewById(R.id.tvPublisher)
        val heroImage : ImageView = view.findViewById(R.id.ivHero)
        fun render(nombre:String){
            view.setOnClickListener{
                Toast.makeText(view.context, "has seleccionado a ${nombre}", Toast.LENGTH_SHORT).show()
            }
        }


    }
}