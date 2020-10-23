package com.example.qrat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import javax.security.auth.login.LoginException

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.loginbt)
        button.setOnClickListener {
            val intent = Intent(this, QRcode::class.java).apply {
                startActivity(this)
            }

        }
    }
}