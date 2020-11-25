package com.example.examen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    companion object{
        const val CLAVE ="hola que tal"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val positivo = findViewById<EditText>(R.id.num)
        val textView = findViewById<TextView>(R.id.textView)
        val boton1 = findViewById<Button>(R.id.button2)
        val boton2 = findViewById<Button>(R.id.button3)
        val boton3 = findViewById<Button>(R.id.button4)
        val texto = arrayOf("Hola","que","tal")

        textView.text = texto.toString()

        positivo.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (positivo.length() > 0){
                    positivo.setText("")
            }
            }
        })

        boton1.setOnClickListener{
            textView.text.length
        }
        boton2.setOnClickListener {
            texto.sort()
        }
        boton3.setOnClickListener {
            if (positivo.length()>=3){
                textView
            }
        }

    }
}