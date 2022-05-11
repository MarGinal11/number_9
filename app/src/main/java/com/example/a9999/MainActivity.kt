package com.example.viewapp

import android.R
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.select_dialog_item)


        val textView = findViewById<TextView>(R.id.cut)

        textView.text = "Hello from Java!"
    }
}