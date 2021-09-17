package com.example.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var sharedPreferences = getSharedPreferences("preferens", Context.MODE_PRIVATE)
        var button: Button = findViewById(R.id.button2)

        button.setOnClickListener {
            var edit = sharedPreferences.edit()
            edit.putBoolean("estado", false)
            edit.apply()
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}