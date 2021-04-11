package com.example.practicarecycler2.data

import com.example.practicarecycler2.R
import com.example.practicarecycler2.model.Frases

class dataSource {


    fun cargaFrases(): List<Frases>{

        return listOf<Frases>(
            Frases(R.string.frase1),
            Frases(R.string.frase2),
            Frases(R.string.frase3),
            Frases(R.string.frase4),
            Frases(R.string.frase5),
            Frases(R.string.frase6),
            Frases(R.string.frase7),
            Frases(R.string.frase8)

        )


    }

}