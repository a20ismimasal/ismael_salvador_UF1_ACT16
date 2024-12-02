package com.example.ismael_salvador_uf1_act16

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        val colorCode = intent.getStringExtra("COLOR_CODE") ?: "#FFFFFF"
        val layout = findViewById<ConstraintLayout>(R.id.color_layout)
        layout.setBackgroundColor(Color.parseColor(colorCode))
    }
}