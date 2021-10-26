package com.example.appcapacitacaokotlin2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var editTxtValorA: EditText
    lateinit var editTxtValorB: EditText
    lateinit var editTxtValorC: EditText
    lateinit var btnCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTxtValorA = findViewById(R.id.editTxtValorA)
        editTxtValorB = findViewById(R.id.editTxtValorB)
        editTxtValorC = findViewById(R.id.editTxtValorC)
        btnCalcular = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener() {
            var delta = calcularDelta(editTxtValorA.text.toString().toDouble(), editTxtValorB.text.toString().toDouble(), editTxtValorC.text.toString().toDouble())
            if (delta < 0) {
                Toast.makeText(applicationContext, "O valor de delta é " + delta + ". A equação não possui raízes reais.", Toast.LENGTH_LONG).show()
            } else {
                //Cálculo das raízes
            }
        }
    }

    private fun calcularDelta(a: Double, b: Double, c: Double) : Double {
        return Math.pow(b, 2.0) - 4 * a * c
    }
}