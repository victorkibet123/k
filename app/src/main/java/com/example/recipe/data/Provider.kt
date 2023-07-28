package com.example.recipe.data

import android.content.Context
import androidx.room.Room

object Provider {
    private var database: Database? = null

    fun getDatabase(context: Context): Database {
        if (database == null) {
            database = Room.databaseBuilder(
                context.applicationContext,
                Database::class.java,
                "recipes.db"
            ).build()
        }
        return database as Database
    }
}