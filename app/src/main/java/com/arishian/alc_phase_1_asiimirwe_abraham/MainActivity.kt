package com.arishian.alc_phase_1_asiimirwe_abraham

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(tb_alc)

        btn_about.setOnClickListener {
            val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(aboutIntent)
        }

        btn_profile.setOnClickListener {
            val profileIntent = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(profileIntent)
        }
    }
}
