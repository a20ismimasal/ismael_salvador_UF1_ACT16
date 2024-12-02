package com.example.ismael_salvador_uf1_act16

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ConstraintLayout>(R.id.button_green).setOnClickListener {
            navigateToColorActivity("#00FF00")
        }

        findViewById<ConstraintLayout>(R.id.button_red).setOnClickListener {
            navigateToColorActivity("#FF0000")
        }

        findViewById<ConstraintLayout>(R.id.button_blue).setOnClickListener {
            navigateToColorActivity("#0000FF")
        }
    }

    private fun navigateToColorActivity(colorCode: String) {
        val intent = Intent(this, ColorActivity::class.java)
        intent.putExtra("COLOR_CODE", colorCode)
        startActivity(intent)
    }
}