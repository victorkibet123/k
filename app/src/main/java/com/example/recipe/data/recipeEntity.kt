package com.example.recipe.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.recipe.Recipe

@Entity(tableName = "recipe_table")
data class RecipeEntity(
    @PrimaryKey
    val id: Int,
    val title : String,
    val type: String,
    val numberOfPeople: Int,
    val difficultyLevel: String,
    val ingredients: String,
    val preparationSteps: String,
    val recipeImageId: Int = 0
)

