package com.example.recipe.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "meal_table")
data class MealEntity(
    @PrimaryKey val id: Long,
    val name: String,
    val description: String,
    val duration: String,
    val Ingredients: String,
    val Steps: String,
    val mealImageId: Int = 0
)