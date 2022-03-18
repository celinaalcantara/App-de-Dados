package com.example.appdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val lados = intent.getIntExtra("lados", 0)

        val textDado = findViewById<TextView>(R.id.textDado)

        val buttonRoll = findViewById<Button>(R.id.buttonRoll)
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        textDado.text = "D$lados"

        buttonRoll.setOnClickListener {
            rolarDados(lados)
        }

        buttonVoltar.setOnClickListener {
            finish()
        }

    }

    fun rolarDados(lados: Int) {

        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textResultado)

        textResultado.text = valor.toString()

    }

}