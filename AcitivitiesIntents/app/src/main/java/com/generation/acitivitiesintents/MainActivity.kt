package com.generation.acitivitiesintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo", "onCreate")//Cria uma activity do zero

    val buttonNext = findViewById<Button>(R.id.buttonNext)
    val intentSegunda = Intent(this, SegundaActivity::class.java)//Referenciando segunda activity

        buttonNext.setOnClickListener {
            startActivity(intentSegunda)//Start inicia uma nova activity apartir de uma ação
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo", "OnStart")//Inicia uma activity ja criada mas que foi parada, com botão home por exemplo
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo", "OnResume")//Carrega uma activity dentro do aplicativo
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo", "OnPause")//Pausa uma activity, saindo do app ou indo para outra activity
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo", "OnStop")//Para uma activity, saindo do app
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo", "OnDestroy")
    }
}