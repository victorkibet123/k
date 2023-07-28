package com.example.recipe.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RecipeDao{
    @Query("SELECT * FROM recipe_table")
    fun getAllRecipes(): List<RecipeEntity>

    @Insert
    fun insertRecipes(recipe:RecipeEntity)

    @Query("DELETE FROM recipe_table")
    fun clearAllRecipes()
}