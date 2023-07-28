package com.example.recipe.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface Dao {
    @Query("SELECT * FROM meal_table")
    fun getAllMeals(): List<ENTITY>

    @Insert
    fun insertMeal(meal: ENTITY)

    @Query("DELETE FROM meal_table")
    fun clearAllMeals()
}
