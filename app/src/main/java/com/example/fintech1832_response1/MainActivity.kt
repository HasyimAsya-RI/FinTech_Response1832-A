package com.example.fintech1832_response1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.fintech1832_response1.ui.HomeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        getSupportActionBar()?.hide()
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        val btnLogin:     Button    = findViewById( R.id.btn_login )
        val loginGoogle:  ImageView = findViewById( R.id.img_loginGoogle )
        val loginTwitter: ImageView = findViewById( R.id.img_loginTwitter )

        btnLogin.setOnClickListener {
            val intent = Intent( this, HomeActivity::class.java )
            startActivity( intent )
        }

        loginGoogle.setOnClickListener {
            val intent = Intent( this, HomeActivity::class.java )
            startActivity( intent )
        }

        loginTwitter.setOnClickListener {
            val intent = Intent( this, HomeActivity::class.java )
            startActivity( intent )
        }
    }

    //Register and Forgot Password
    fun register( view: View ) {
        val intent = android.content.Intent( this, RegisterActivity::class.java )
        startActivity( intent )
    }
    fun recovery( view: View ) {
        val intent = android.content.Intent( this, RecoveryActivity::class.java )
        startActivity( intent )
    }
}