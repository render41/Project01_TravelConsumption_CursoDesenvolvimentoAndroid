package com.arcastudio.project01_travelconsumption

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        modifyColorStatusBar()
        setContentView(R.layout.activity_main)
    }

    private fun modifyColorStatusBar() {
        window.statusBarColor = ContextCompat.getColor(this, R.color.green_base)
    }
}
