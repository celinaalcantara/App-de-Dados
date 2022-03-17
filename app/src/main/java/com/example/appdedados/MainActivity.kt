package com.example.appdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        buttonD6.setOnClickListener {
            rolarDados(6)
        }

        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        buttonD12.setOnClickListener {
            rolarDados(12)
        }

        val buttonD20 = findViewById<Button>(R.id.buttonD20)
        buttonD20.setOnClickListener {
            rolarDados(20)
        }

    }

    fun rolarDados(lados: Int) {

        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textResultado)

        textResultado.text = valor.toString()

    }

    /*val imageResourse = imagemD6(valor)

        val imageDado = findViewById<ImageView>(R.id.imageDado)

        imageDado.setImageResource(imageResourse)*/


  /*  private fun imagemD6(valor: Int): Int {
        return when(valor){
            1 -> R.drawable.dado_1
            2 -> R.drawable.dado_2
            3 -> R.drawable.dado_3
            4 -> R.drawable.dado_4
            5 -> R.drawable.dado_5
            else -> R.drawable.dado_6
        }
    }*/

}