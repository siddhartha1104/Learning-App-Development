package com.clickme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_clickMe = findViewById<Button>(R.id.btn_clickme)
        val btn_reset = findViewById<Button>(R.id.btn_reset)
        val txt = findViewById<TextView>(R.id.textView)
        var count = 0



        btn_clickMe.setOnClickListener {

            count += 1
            txt.text = count.toString()

            Toast.makeText(this,"Hey Boyee",Toast.LENGTH_LONG).show()

        }

        btn_reset.setOnClickListener {

            count = 0
            txt.text = count.toString()
            Toast.makeText(this,"Mar gya Mc Laaa laa",Toast.LENGTH_LONG).show()
        }


    }
}