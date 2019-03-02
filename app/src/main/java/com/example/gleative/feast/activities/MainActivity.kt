package com.example.gleative.feast.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gleative.feast.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOnClickListeners()
    }

    fun setOnClickListeners() {
        fab_create_meal.setOnClickListener {
            navCreatePage()
        }
    }

    fun navCreatePage() {
        val intent = Intent(this, CreateMeal::class.java)
        startActivity(intent)
    }

}


//TODO: START PÅ Å LAGE FRAGMENT FOR Å LEGGE TIL INGREDIENSER