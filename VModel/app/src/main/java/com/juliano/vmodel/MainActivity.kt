package com.juliano.vmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    lateinit var txtContador: EditText
    lateinit var btnDados: Button
    lateinit var btnMostrar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDados()
        initClick()

    }

    private fun initClick() {
        btnDados.setOnClickListener {
            mainViewModel.contador()
        }
        btnMostrar.setOnClickListener {
           Toast.makeText(applicationContext, "Valor contador: ${mainViewModel.mContador.value}", Toast.LENGTH_SHORT).show()
        }
    }

    fun initDados(){
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        txtContador = findViewById(R.id.editTextContador)
        btnDados = findViewById(R.id.buttonDados)
        btnMostrar = findViewById(R.id.buttonMostrar)

        mainViewModel.mContador.observe(this, Observer {
            valor -> txtContador.setText(valor)
        })
    }

}