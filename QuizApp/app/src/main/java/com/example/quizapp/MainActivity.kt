package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.*
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //helps to remove notification Bar form the Top of the Screen
        // and make app to FULL SCREEN
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_Start.setOnClickListener {

            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter your name first",Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this,QuizQuestionsActivity:: class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}