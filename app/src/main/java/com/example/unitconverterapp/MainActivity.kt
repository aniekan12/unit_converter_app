package com.example.unitconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var pounds  = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val convertedText = findViewById<TextView>(R.id.convertedText)
        val convertButton = findViewById<Button>(R.id.convertButton)
        val editTextKilo = findViewById<EditText>(R.id.txtKilo)

        convertButton.setOnClickListener{
            convertedText.text = convertKiloToPounds(kilo=editTextKilo.text.toString()).toString()
        }
    }

    private fun convertKiloToPounds(kilo:String) : Double {
        pounds =  kilo.toDouble() * 2.20462
        return pounds;
    }
}