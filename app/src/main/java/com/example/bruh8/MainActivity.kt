package com.example.bruh8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zubrowka = findViewById<CheckBox>(R.id.checkBox)
        val wyborowa = findViewById<CheckBox>(R.id.checkBox2)
        val zoladkowa = findViewById<CheckBox>(R.id.checkBox3)
        val soplica = findViewById<CheckBox>(R.id.checkBox4)
        val cola = findViewById<CheckBox>(R.id.checkBox5)
        val marlboroGold = findViewById<CheckBox>(R.id.checkBox6)
        val skoncz = findViewById<Button>(R.id.button)
        skoncz.setOnClickListener {
            var suma = 0
            val result = StringBuilder()
            result.append("wybrane produkty")
            if (zubrowka.isChecked){
                result.append("\nŻubrówka 30zl")
                suma += 30;
            }
            if (wyborowa.isChecked) {
                result.append("\nWyborowa 25zl")
                suma += 25
            }
            if (zoladkowa.isChecked) {
                result.append("\nŻołądkowa 32zl")
                suma += 32
            }
            if (soplica.isChecked) {
                result.append("\nSoplica 19zl")
                suma += 19
            }
            if (cola.isChecked) {
                result.append("\nCocaCola 9zl")
                suma += 9
            }
            if (marlboroGold.isChecked) {
                result.append("\nMarlboroGold23zl")
                suma += 23
            }
            result.append("\nwszystko: " + suma + "zl")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}