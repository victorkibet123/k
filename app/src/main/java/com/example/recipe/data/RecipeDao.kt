package com.example.recipe.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RecipeDao{
    @Query("SELECT * FROM recipe_table")
    fun getAllRecipes(): List<RecipeDao>

    @Insert
    fun insertRecipes(Recipe: RecipeDao)

    @Query("DELETE FROM recipe_table")
    fun clearAllRecipes()
}