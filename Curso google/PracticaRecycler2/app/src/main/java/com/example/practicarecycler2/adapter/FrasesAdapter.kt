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


    // se encargará de contener y gestionar las vistas o controles asociados a cada elemento individual de la lista.
    class FrasesViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val texto:TextView = view.findViewById(R.id.tvFrase)

    }

    //Lo que hará será devolvernos un objeto ViewHolder al cual le pasamos la celda que hemos creado.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FrasesViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.frases_layout,parent,false)
        return FrasesViewHolder(adapterLayout)
    }

    //Se encarga de coger cada una de las posiciones de la lista de superhéroes y pasarlas a la clase ViewHolder
    override fun onBindViewHolder(holder: FrasesViewHolder, position: Int) {
        val item = dataset[position]
        holder.texto.text = context.resources.getString(item.fraseId)


    }

    //Nos devuelve el tamaño de la lista
    override fun getItemCount(): Int {
        return dataset.size
    }


}