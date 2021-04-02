package com.example.brunomarina

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.brunomarina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val boton = binding.BotonTirar
        val boton2 = binding.BotonTirar2
        var pulsacion=0

        boton.setOnClickListener{
            val texto = binding.tvBruno

            pulsacion ++
            if(pulsacion%2 ==0){
                texto.setTextColor(Color.BLACK)
            }else
                texto.setTextColor(Color.RED)

        }

        boton2.setOnClickListener{
            val texto = binding.tvMarina

            pulsacion ++
            if(pulsacion%2 ==0){
                texto.setTextColor(Color.BLACK)
            }else
                texto.setTextColor(Color.MAGENTA)

        }

    }
}