package com.example.practicarecyclerview1.data

import android.provider.Settings.Global.getString
import android.provider.Settings.Secure.getString
import com.example.practicarecyclerview1.R
import com.example.practicarecyclerview1.model.Cantantes

class DataSource {



    fun cargarCantantes():List<Cantantes>{

        return listOf<Cantantes>(
            Cantantes(R.string.bon_jovi,R.drawable.bonjovi),
            Cantantes(R.string.steven_tyler,R.drawable.steventyler),
            Cantantes(R.string.axl_rose,R.drawable.axlrose),
            Cantantes(R.string.david_coverdale,R.drawable.coverdale),
            Cantantes(R.string.robert_plant,R.drawable.robertplant),
            Cantantes(R.string.freddy_mercury,R.drawable.freddymercury),
            Cantantes(R.string.sebastian_bach,R.drawable.sebastianbach)

        )

    }
}