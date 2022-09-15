package com.example.fintech1832_response1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.fintech1832_response1.R
import com.example.fintech1832_response1.ui.history.HistoryFragment
import com.example.fintech1832_response1.ui.home.HomeFragment
import com.example.fintech1832_response1.ui.payment.PaymentFragment
import com.example.fintech1832_response1.ui.setting.SettingFragment

class HomeActivity : AppCompatActivity() {

//    private lateinit var asyari:  ImageView
//    private lateinit var profile: ImageView
    private lateinit var home:    LinearLayout
    private lateinit var payment: LinearLayout
    private lateinit var history: LinearLayout
    private lateinit var setting: LinearLayout

    override fun onCreate( savedInstanceState: Bundle? ) {
        getSupportActionBar()?.hide()
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_home )

//        asyari  = findViewById( R.id.asyari )
//        profile = findViewById( R.id.profile )
        home    = findViewById( R.id.lin_menuHome )
        payment = findViewById( R.id.lin_menuPayment )
        history = findViewById( R.id.lin_menuHistory )
        setting = findViewById( R.id.lin_menuSetting )

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