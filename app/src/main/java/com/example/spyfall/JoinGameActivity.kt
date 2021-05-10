package com.example.spyfall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.net.Socket

class JoinGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_game)

        val hostEditText: EditText = findViewById(R.id.host_game_host_edit_text)
        val portEditText: EditText = findViewById(R.id.host_game_port_edit_text)

        val button: Button = findViewById(R.id.join_game_button)
        button.setOnClickListener {
            val client = Socket(hostEditText.toString(), portEditText.toString() as Int)
            client.outputStream.write("Hello from the client!".toByteArray())
            client.close()
        }

    }
}