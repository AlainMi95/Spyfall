package com.example.spyfall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Spyfall"
        val textView: TextView = findViewById(R.id.textViewLink)
        textView.movementMethod = LinkMovementMethod.getInstance()

        val hostButton = findViewById<Button>(R.id.hostButton)
        val joinButton = findViewById<Button>(R.id.joinButton)

        hostButton.setOnClickListener {
            startActivity(Intent(this, HostGameActivity::class.java))
        }

        joinButton.setOnClickListener{
            startActivity(Intent(this, JoinGameActivity::class.java))
        }

    }



}