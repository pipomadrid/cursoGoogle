package com.example.practicarecycler2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practicarecycler2.R
import com.example.practicarecycler2.databinding.FrasesLayoutBinding
import com.example.practicarecycler2.model.Frases

class FrasesAdapter(val context:Context, val dataset: List<Frases> ) :RecyclerView.Adapter<FrasesAdapter.FrasesViewHolder>(){




    class FrasesViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val texto:TextView = view.findViewById(R.id.tvFrase)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FrasesViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.frases_layout,parent,false)
        return FrasesViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: FrasesViewHolder, position: Int) {
        val item = dataset[position]
        holder.texto.text = context.resources.getString(item.fraseId)


    }

    override fun getItemCount(): Int {
        return dataset.size
    }


}