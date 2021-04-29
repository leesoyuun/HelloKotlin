package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txtActivityStartTime)
        val txtCountBtnClicks = findViewById<TextView>(R.id.txtCountBtnClicks)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        var clickCount = 0
        var startTime = System.currentTimeMillis()
        var sTimestamp = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)
        txtActivityStartTime.text = "Activity start time = ${sTimestamp}"



        btnClickMe.setOnClickListener {
            clickCount++
            txtCountBtnClicks.text = "Button clicks =  + ${clickCount}"

        }
    }
}