package com.example.recipe.data

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase

@Database(entities = [Entity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    inner class Dao {
        fun clearaAllRecipe() {
            TODO("Not yet implemented")
        }

    }

    abstract fun mealDao(): Dao
}