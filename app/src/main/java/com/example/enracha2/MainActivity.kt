package com.example.enracha2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val finanzasButton: Button = findViewById(R.id.button2)
        finanzasButton.setOnClickListener {
            val intent = Intent(this, FinanzasActivity::class.java)
            startActivity(intent)
        }

        val habitosButton: Button = findViewById(R.id.button3)
        habitosButton.setOnClickListener {
            val intent = Intent(this, HabitosActivity::class.java)
            startActivity(intent)
        }
    }
}