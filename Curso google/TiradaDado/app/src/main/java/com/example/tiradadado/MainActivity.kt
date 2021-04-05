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

        val boton = binding.BotonTirar // selecciona el boton del layout
        boton.setOnClickListener { rollDice() }
        rollDice()
    }

    /**
     * Tira el dado y refresca la pantalla con el resultado
     */
    private fun rollDice() {
        //crea un dado de dos caras y tira el dado
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val imagen = binding.imageView
        //determina que recurso de iamgen usar segun lo que salga en la tirada
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
           else-> R.drawable.dice_6
        }
        // acutaliza la imagen con el recurso correspondiente a la tirada
        imagen.setImageResource(drawableResource)
        //actualiza la descripcion de la imagen para ayuda de audio
        imagen.contentDescription = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {
    //clase dado
    fun roll(): Int {
        return (1..numSides).random()


    }


}