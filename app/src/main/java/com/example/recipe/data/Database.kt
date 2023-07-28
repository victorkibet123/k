package com.example.recipe.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [RecipeEntity::class], version = 1)
public abstract class Database : RoomDatabase() {

        abstract fun recipeDao():RecipeDao


}