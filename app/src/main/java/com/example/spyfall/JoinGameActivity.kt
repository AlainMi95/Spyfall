package com.example.spyfall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import java.io.OutputStream
import java.net.Socket
import java.util.*
import kotlin.concurrent.thread

class JoinGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_game)

        val address = "127.0.0.1"
        val port = 9999
        thread {
            val client = Client(address, port)
            Log.d("client","connected")
        }
    }

    class Client(address: String, port: Int) {
        private val connection: Socket = Socket(address, port)
        private val connected: Boolean = true
        private val reader: Scanner = Scanner(connection.getInputStream())
        private val writer: OutputStream = connection.getOutputStream()

        init {
            Log.d("client", "Connecterd to Server at $address on port $port")
        }
    }
}