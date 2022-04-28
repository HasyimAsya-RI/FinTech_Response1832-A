package com.example.fintech_response1832.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.fintech_response1832.R
import com.example.fintech_response1832.ui.history.HistoryFragment
import com.example.fintech_response1832.ui.home.HomeFragment
import com.example.fintech_response1832.ui.payment.PaymentFragment
import com.example.fintech_response1832.ui.setting.SettingFragment

class HomeActivity : AppCompatActivity() {

//    private lateinit var asyari:  ImageView
//    private lateinit var profile: ImageView
    private lateinit var home:    LinearLayout
    private lateinit var payment: LinearLayout
    private lateinit var history: LinearLayout
    private lateinit var setting: LinearLayout

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_home )

//        asyari  = findViewById( R.id.asyari )
//        profile = findViewById( R.id.profile )
        home    = findViewById( R.id.menuBar_home )
        payment = findViewById( R.id.menuBar_payment )
        history = findViewById( R.id.menuBar_history )
        setting = findViewById( R.id.menuBar_setting )

        home.setOnClickListener { loadFragment( HomeFragment() ) }
        payment.setOnClickListener { loadFragment( PaymentFragment() ) }
        history.setOnClickListener { loadFragment( HistoryFragment() ) }
        setting.setOnClickListener { loadFragment( SettingFragment() ) }
    }

    private fun loadFragment( fragment: Fragment ) {
        supportFragmentManager.beginTransaction()
            .replace( R.id.container, fragment )
            .commitNow()
    }
}