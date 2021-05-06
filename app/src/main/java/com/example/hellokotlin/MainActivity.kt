package com.example.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
// val btnHello = findViewById<Button>(R.id.btnJava)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJava = findViewById<Button>(R.id.btnJava)
        val btnKotlin = findViewById<Button>(R.id.btnKotlin)
        val btnVarJava = findViewById<Button>(R.id.btnVarJava)
        val btnVarKotlin = findViewById<Button>(R.id.btnVarKotlin)
        val btnFlowControlJava = findViewById<Button>(R.id.btnFlowControlJava)
        val btnFlowControlKotlin = findViewById<Button>(R.id.btnFlowControlKotlin)

        btnJava.setOnClickListener {
            // Toast.makeText(this@MainActivity, "Hello Kotlin", Toast.LENGTH_LONG).show()
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }
        btnKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }
        btnVarJava.setOnClickListener {
            startActivity(Intent(this@MainActivity, VariableJavaActivity::class.java))
        }
        btnVarKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity, VariableKotlinActivity2::class.java))
        }
        btnFlowControlJava.setOnClickListener {
            startActivity(Intent(this@MainActivity, FlowControlJavaActivity::class.java))
        }
        btnFlowControlKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity, FlowControlKotlinActivity::class.java))
        }
    }
}