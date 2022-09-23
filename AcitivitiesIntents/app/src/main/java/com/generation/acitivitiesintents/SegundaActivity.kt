package com.generation.acitivitiesintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonVoltar.setOnClickListener {
           finish()//Finaliza essa activity e volta para a activity interior
        }

    }
}