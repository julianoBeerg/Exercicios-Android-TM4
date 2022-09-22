package com.example.diceapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD6.setOnClickListener {
            //Toast.makeText(this, "Botão Clicado", Toast.LENGTH_LONG).show()
            rolarDados(6)
        }

        buttonD12.setOnClickListener {
            //Toast.makeText(this, "Botão Clicado", Toast.LENGTH_LONG).show()
            rolarDados(12)
        }

        buttonD20.setOnClickListener {
            //Toast.makeText(this, "Botão Clicado", Toast.LENGTH_LONG).show()
            rolarDados(20)
        }

}

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radioButtonD6 ->
                    if (checked) {
                        val buttonDados = findViewById<Button>(R.id.buttonDados)
                        buttonDados.setOnClickListener {
                        rolarDados(6)
                        }
                    }
                R.id.radioButtonD12 ->
                    if (checked) {
                        val buttonDados = findViewById<Button>(R.id.buttonDados)
                        buttonDados.setOnClickListener {
                            rolarDados(12)
                        }
                    }
                R.id.radioButtonD20 ->
                    if (checked) {
                        val buttonDados = findViewById<Button>(R.id.buttonDados)
                        buttonDados.setOnClickListener {
                            rolarDados(20)
                        }
                    }
            }
        }
    }

    private fun rolarDados(lados: Int) {
        val rolagem = (1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem.toString()
    }

}