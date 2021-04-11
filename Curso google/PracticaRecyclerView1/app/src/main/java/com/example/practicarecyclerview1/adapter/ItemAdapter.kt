package com.example.practicarecyclerview1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practicarecyclerview1.R
import com.example.practicarecyclerview1.model.Cantantes

class ItemAdapter(private val context: Context, private val dataset:List<Cantantes>)
    :RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ItemViewHolder {

        val adapterLayout = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemAdapter.ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.TextView.text = context.resources.getString(item.nameId)
        holder.ImageView.setImageResource(item.imgId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        val TextView :TextView= view.findViewById(R.id.nombre)
        val ImageView :ImageView = view.findViewById(R.id.imagen)



    }


}