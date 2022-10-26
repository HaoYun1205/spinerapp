package com.example.spinnerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spGender = findViewById<Spinner>(R.id.spGender)
        val btOk= findViewById<Button>(R.id.btOk)
        val etAge=findViewById<EditText>(R.id.etAge)
        btOk.setOnClickListener {
            val age=etAge.text.toString().toInt()
            if(spGender.selectedItemPosition==0){
                when{
                    age<28->Toast.makeText(this,
                        getString(R.string.no_hurry),Toast.LENGTH_LONG).show()
                    age in 28..32 ->Toast.makeText(this,
                        getString(R.string.find_couple),Toast.LENGTH_LONG).show()
                    else->Toast.makeText(this,
                        getString(R.string.get_married),Toast.LENGTH_LONG).show()
                }
            }else{
                when{
                    age<28->Toast.makeText(this,
                        getString(R.string.no_hurry),Toast.LENGTH_LONG).show()
                    age in 25..30 ->Toast.makeText(this,
                        getString(R.string.find_couple),Toast.LENGTH_LONG).show()
                    else->Toast.makeText(this,
                        getString(R.string.get_married),Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}