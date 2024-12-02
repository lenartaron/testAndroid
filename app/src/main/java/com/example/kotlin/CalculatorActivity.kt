package com.example.kotlin

import android.os.Bundle
import android.text.method.NumberKeyListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CalculatorActivity : AppCompatActivity() {

    private lateinit var Number1: EditText
    private lateinit var Number2: EditText
    private lateinit var Add: Button
    private lateinit var Delete: Button
    private lateinit var Eredmeny: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator)

        Number1 = findViewById(R.id.firstNumberEdit);
        Number2 = findViewById(R.id.secondNumberEdit);
        Add = findViewById(R.id.addButton);
        Delete = findViewById(R.id.clearButton);
        Eredmeny = findViewById(R.id.resultText);
    }
}