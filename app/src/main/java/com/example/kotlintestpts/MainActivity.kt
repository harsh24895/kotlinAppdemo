package com.example.kotlintestpts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.buttonOnclickme
import kotlinx.android.synthetic.main.activity_main.editTextName


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btn:Button = findViewById(R.id.buttonOnclickme)
//        btn.setOnClickListener {  }

        buttonOnclickme.setOnClickListener {
            val name = editTextName.textStrong knowledge in Manual testing

            val message = "Hello $name";
// mention toast for message
           Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }




        }



    }
