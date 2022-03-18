package com.example.appdedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        val intentDados = Intent(this, Activity2::class.java)

        buttonD6.setOnClickListener {
            intentDados.putExtra("lados", 6)
            startActivity(intentDados)
        }

        buttonD12.setOnClickListener {
            intentDados.putExtra("lados", 12)
            startActivity(intentDados)
        }

        buttonD20.setOnClickListener {
            intentDados.putExtra("lados", 20)
            startActivity(intentDados)
        }

        Log.d("CicloDeVida", "onCreate()")

    }


    /*override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida","onStart()")
    }
    override fun onResume() {
        super.onResume()
        Log.d("CicloDeVida","onResume()")
    }
    override fun onPause() {
        super.onPause()
        Log.d("CicloDeVida","onPause()")
    }
    override fun onStop() {
        super.onStop()
        Log.d("CicloDeVida","onStop()")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("CicloDeVida","onRestart()")
    }
*/

        /*val imageResourse = imagemD20(valor)

        val imgDado = findViewById<ImageView>(R.id.imgDado)

        imgDado.setImageResource(imageResourse)


        private fun imagemD20(valor: Int): Int {
            return when (valor) {
                1 -> R.drawable.dado_1
                2 -> R.drawable.dado_2
                3 -> R.drawable.dado_3
                4 -> R.drawable.dado_4
                5 -> R.drawable.dado_5
                else -> R.drawable.dado_6
            }
        }*/

}