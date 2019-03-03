package com.example.gleative.feast.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.gleative.feast.R

class AddIngredientActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_ingredient)
    }

    // TODO: Finn ut hvordan du skal håndtere onclick, skal du ha toggle buttons, vanlig buttons? Toggle button virker stress, siden må å checkedlistener
    fun addIngredientToList(view: View){
        val buttonClicked = view.id

        Toast.makeText(this, "$buttonClicked added!", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "$buttonClicked removed!!", Toast.LENGTH_SHORT).show()
    }
}
