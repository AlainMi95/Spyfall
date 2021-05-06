package com.example.spyfall

import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import java.net.ServerSocket
import java.util.*

class HostGameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host_game)

        val createGameButton: Button = findViewById(R.id.host_game_create_button)
        createGameButton.setOnClickListener {
            val server =  ServerSocket(1000)
            val client = server.accept()
            println("Client connected : ${client.inetAddress.hostAddress}")
            val scanner = Scanner(client.inputStream)
            while (scanner.hasNextLine()) {
                println(scanner.nextLine())
                break
            }
            server.close()
        }

    }

}