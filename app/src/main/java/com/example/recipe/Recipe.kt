package com.example.recipe

import java.io.Serializable

data class Recipe(
    val id: Int,
    val title: String,
    val type: String,
    val numberOfPeople: Int,
    val difficultyLevel: String,
    val ingredients:String,
    val preparationSteps: String,
    val recipeImageId: Int = 0
)
    : Serializable