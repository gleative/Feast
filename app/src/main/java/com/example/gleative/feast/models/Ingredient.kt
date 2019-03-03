package com.example.gleative.feast.models

/**
 * Represents
 */
class Ingredient(name: String, ingredientType: IngredientType){

    fun createIngredients() {
        val butter = Ingredient("Butter", IngredientType.DAIRYLIQUID)
        val chicken = Ingredient("Chicken", IngredientType.MEAT)
        val duck = Ingredient("Duck", IngredientType.MEAT)
        val egg = Ingredient("Egg", IngredientType.DAIRY)
        val lamb = Ingredient("Lamb", IngredientType.MEAT)
        val milk = Ingredient("Milk", IngredientType.DAIRYLIQUID)
        val pork = Ingredient("Pork", IngredientType.MEAT)
    }
}