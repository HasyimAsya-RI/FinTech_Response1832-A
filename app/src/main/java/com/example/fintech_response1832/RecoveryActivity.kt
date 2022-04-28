package com.example.fintech_response1832

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RecoveryActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_recovery )

        val backtoMain: ImageView = findViewById( R.id.backTo_main )
//        val btnChange:  Button    = findViewById( R.id.btn_change )

        backtoMain.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java )
            startActivity( intent )
        }
    }
}