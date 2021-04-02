package com.example.tiradadado

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tiradadado.databinding.ActivityMainBinding

/*
esta acividad permite al usuario simular el lanzamiento de un dado y ver el resultado en pantalla
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //val rollButton: Button = findViewById(R.id.BotonTirar) esta forma está deprecada

        val boton = binding.BotonTirar
        boton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        //crea un dado de dos caras y tira el dado
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val texto = binding.tvDado
        texto.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {
    //clase dado
    fun roll(): Int {
        return (1..numSides).random()


    }


}