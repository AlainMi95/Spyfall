package com.example.spyfall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Spyfall"
        val textView: TextView = findViewById(R.id.textViewLink)
        textView.movementMethod = LinkMovementMethod.getInstance()
    }
}