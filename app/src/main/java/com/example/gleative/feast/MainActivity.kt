package com.example.gleative.feast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initIngredients()
        setOnClickListeners()
    }

    fun setOnClickListeners() {
        fab_create_meal.setOnClickListener {

        }
    }

    fun initIngredients() {

    }
}
