package com.example.kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {






    private lateinit var nameEditText: EditText
    private lateinit var greetingButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var openCalculatorButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        nameEditText = findViewById(R.id.nameEditText)
        greetingButton = findViewById(R.id.greetingButton)
        resultTextView = findViewById(R.id.resultView)
        openCalculatorButton = findViewById(R.id.openCalculatorButton)

        greetingButton.setOnClickListener() {
            val  name = nameEditText.text

            //Ellenőrizzük a mező kitölttségét
            if (!name.isEmpty()) {
                val greetingText = when {
                    name.length <= 3 -> "Szia $name! De rövid a neved"
                    name.length >= 10 -> "Szia $name! De hosszú a neved"
                    else -> "Hello $name!"
                }



                //eredmény kiírása
                resultTextView.text = greetingText

                nameEditText.text.clear()

            } else {
                //hibaüzenet megjelenítés
                Toast.makeText(this, "Adj meg nevet!", Toast.LENGTH_SHORT).show()
            }


        }

        openCalculatorButton.setOnClickListener() {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }

    }
}