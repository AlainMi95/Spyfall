package com.example.spyfall

import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import java.net.ServerSocket
import java.util.*
import kotlin.concurrent.thread

class HostGameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host_game)

        thread {
            val server = ServerSocket(9999)
            Log.d("server","Server is running on port ${server.localPort}")

            while (true) {
                Log.d("server","in while")
                val client = server.accept()
                Log.d("server","Client connected: ${client.inetAddress.hostAddress}")
            }
        }

    }

}