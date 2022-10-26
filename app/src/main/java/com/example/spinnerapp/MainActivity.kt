package com.example.spinnerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spGender = findViewById<Spinner>(R.id.spGender)
        val btOk= findViewById<Button>(R.id.btOk)
        btOk.setOnClickListener {
            Toast
                .makeText(this,"${spGender.selectedItem.toString()}",Toast.LENGTH_LONG)
                .show()


        }
    }
}