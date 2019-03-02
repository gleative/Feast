package com.example.gleative.feast.models

class Ingredient(name: String, ingredientType: IngredientType){

    fun createIngredients() {
        val egg = Ingredient("Egg", IngredientType.DIARY)
        val milk = Ingredient("Milk", IngredientType.DIARY)
        val chicken = Ingredient("Chicken", IngredientType.MEAT)
        val pork = Ingredient("Pork", IngredientType.MEAT)
    }
}