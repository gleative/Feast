package com.example.gleative.feast.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.gleative.feast.R
import com.example.gleative.feast.fragments.AddIngredientFragment
import kotlinx.android.synthetic.main.activity_create_meal.*

class CreateMeal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_meal)

        setOnClickListeners()
    }

    fun setOnClickListeners() {
        button_add_ingredients.setOnClickListener { displayAddIngredientActivity() }
        button_add_step.setOnClickListener {  }
    }

    fun displayAddIngredientActivity() {
        startActivity(Intent(this, AddIngredientActivity::class.java))
    }



//    fun displayAddIngredientFragment() {
//        supportFragmentManager.beginTransaction().replace(R.id.container_add_ingredient, AddIngredientFragment()).show(AddIngredientFragment()).commit()
//    }
}
