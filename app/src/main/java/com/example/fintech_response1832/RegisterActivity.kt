package com.example.fintech_response1832

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.fintech_response1832.ui.HomeActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_register )

        val backtoMain:         ImageView = findViewById( R.id.backTo_main )
        val btnRegister:        Button    = findViewById( R.id.btn_register )
        val registerGoogle:     ImageView = findViewById( R.id.register_google )
        val registerTwitter:    ImageView = findViewById( R.id.register_twitter )

        backtoMain.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java )
            startActivity( intent )
        }
        btnRegister.setOnClickListener {
            val intent = Intent( this, HomeActivity::class.java )
            startActivity( intent )
        }
        registerGoogle.setOnClickListener {
            val intent = Intent( this, HomeActivity::class.java )
            startActivity( intent )
        }
        registerTwitter.setOnClickListener {
            val intent = Intent( this, HomeActivity::class.java )
            startActivity( intent ) }
    }
}

//fun asyari( view: View ) { }
//fun terms( view: View ) { }
//fun privacy( view: View ) { }