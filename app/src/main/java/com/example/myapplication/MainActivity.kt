package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.clickBtn)
        val res = findViewById<TextView>(R.id.resultText)

        btn.setOnClickListener {

            res.text = "Button clicked! screenWidth: ${resources.displayMetrics.widthPixels} px"

        }
    }
}