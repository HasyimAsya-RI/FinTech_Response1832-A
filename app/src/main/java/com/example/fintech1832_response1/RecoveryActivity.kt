package com.example.fintech1832_response1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class RecoveryActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        getSupportActionBar()?.hide()
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_recovery )

        val backtoLogin: ImageView = findViewById( R.id.img_back )
//        val btnChange:  Button    = findViewById( R.id.btn_recovery )

        backtoLogin.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java )
            startActivity( intent )
        }
    }
}