package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import com.example.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat


/**
 * Aplicacion que calcula la propina a partir de una cantidad,
 * da error si no se introduce ninguna cantidad y se da al botón
 */
class MainActivity : AppCompatActivity() {


    // lateinit es una promesa de iniciar la variable
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding vincula la main acitvity con el layout para acceder a alos recursos como botones, textviws etc..
        //creamos un listener para qu cuando se pulse llame a la función calulateTip
        binding.calculateButton.setOnClickListener { calculateTip() }


    }

    // esta función realizará los cálculos necesarios para obtener la propina
    fun calculateTip() {

        // obtenemos el total de la cuenta y lo pasamos a string
        val stringInTextField = binding.costOfService.text.toString()

        // lo pasamos a una varible convirtiéndola a double pra poder operar con ella, si no puede parsear devuelve un null
        val cost = stringInTextField.toDoubleOrNull()
        // comprobamos si la variable es nula
        if (cost == null) {
            // borramos el textview del resultado
            binding.tipResult.text = ""
            // salimos de la función y devolvemos control a la mainactivity
            return
        }
        // en selectedId guardamos la opcion que está ckeckeada en el radiogroup con id tipOptions
        // dentro de la variable hacemos un when para ver a que cantidad le corresponde la opcion marcada y poder operar con ella
        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15// ponemos el else porque es obligatorio
        }
        // en esta varaible calculamos la propina multiplicando el coste por el porcentaje
        var tip = tipPercentage * cost
        // para usar la opción de redondeo comprobamos si está marcada
        if (binding.roundUpSwitch.isChecked) {
            // si lo está mediante la función ceil de la libreria math hacemos que redondee la cantidad
            tip = kotlin.math.ceil(tip)
        }
        // con esta variable lo que hacemos es dar formato de moneda a la varible tip, el sitema elegirá la moneda a partir del lenguaje y otras opciones
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        // para finalizar ponemos el resultado en el textview tipAmount obteniendo la cadena usando los parámetros de cadena para dar a la cantidad el formato de moneda
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)


    }


}