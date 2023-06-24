package com.example.recipe.data

import com.example.recipe.R
import com.example.recipe.Recipe

object DataProvider{
    val recipeList = listOf(
        Recipe(
            id = 1,
            title = "Chapati",
            type= "Snack",
            numberOfPeople = 8,
            difficultyLevel = "beginner",
            ingredients = "",
            preparationSteps = "In a m",
            recipeImageId = R.drawable.chapati
        ),
        Recipe(
            id = 1,
            title = "Ugali",
            type= "Supper",
            numberOfPeople =8,
            difficultyLevel = "beginner",
            ingredients = "",
            preparationSteps = "Boil th",
            recipeImageId = R.drawable.ugali
        ),
        Recipe(
            id = 1,
            title = "Rice",
            type= "Lunch",
            numberOfPeople =8,
            difficultyLevel = "beginner",
            ingredients = "",
            preparationSteps = "beginner",
            recipeImageId = R.drawable.rice
        ),
        Recipe(
            id = 1,
            title = "Scrambled egg",
            type= "Breakfast",
            numberOfPeople =8,
            difficultyLevel = "beginner",
            ingredients = "",
            preparationSteps = "beginner",
            recipeImageId = R.drawable.scrambledegg

        ),

    )
}
