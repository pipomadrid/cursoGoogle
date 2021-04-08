package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemAdapter(
    private val context:
    Context, private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    //este método es llamado para crear nuevos viewHolder(que representa un vista de un elemento)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder { // viwetype solo se usa caundo hay varios tipos de vista en el mismo recycler
        // debemos obtener una instancia de LayoutInflater desde el  contexto del parent
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        //Ahora adapterLayout contiene una referencia a la vista de elementos de la lista (desde la cual podemos encontrar más tarde vistas secundarias como textview)
        return ItemViewHolder(adapterLayout)
    }

    // este método es llamado para reemplazar el contenido de la vista de la lista
    //contiene dos parámetros, el itemViewHolder creado en la función anterior y la posición actual del item
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        // con holder accedemos a los métodos y campos de la clase ItemHolder , la cual
        //representa una vista de un elemento, accedemos al textview del mismo y lo rellenamos con el valor del item correspondiente
        holder.textView.text =
            context.resources.getString(item.stringResourceId) // estamos accediendo a los strings donde están las frases de afirmación
        holder.imageView.setImageResource(item.imageResourceId)

    }

    override fun getItemCount() = dataset.size

    // creamos el viewHolder haciendolo subclase de recyclerView, solo será utilizado por la clase adapter
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

}