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
            var a = editTxtValorA.text.toString().toDouble()
            if (a != 0.0) {
                var b = editTxtValorB.text.toString().toDouble()
                var c = editTxtValorC.text.toString().toDouble()
                var delta = calcularDelta(a, b, c)

                if (delta < 0) {
                    Toast.makeText(applicationContext, "O valor de delta é $delta. A equação não possui raízes reais.", Toast.LENGTH_LONG).show()
                } else {
                    var x1 = (-b + Math.sqrt(delta)) / 2 * a
                    var x2 = (-b - Math.sqrt(delta)) / 2 * a
                    Toast.makeText(applicationContext, "O valor de delta é $delta. Portanto, x1 = $x1 e x2 = $x2", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(applicationContext, "O coeficiente A não pode ser zero!", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun calcularDelta(a: Double, b: Double, c: Double) : Double {
        return Math.pow(b, 2.0) - 4 * a * c
    }
}