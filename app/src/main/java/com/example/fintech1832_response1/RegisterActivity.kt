package com.example.fintech1832_response1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.fintech1832_response1.ui.HomeActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        getSupportActionBar()?.hide()
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_register )

        val backtoLogin:     ImageView = findViewById( R.id.img_back )
        val btnRegister:     Button    = findViewById( R.id.btn_register )
        val registerGoogle:  ImageView = findViewById( R.id.img_registerGoogle )
        val registerTwitter: ImageView = findViewById( R.id.img_registerTwitter )

        backtoLogin.setOnClickListener {
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