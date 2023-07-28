package com.example.recipe.data

import com.example.recipe.R
import com.example.recipe.Recipe

object DataProvider{
    val recipeList = listOf(
        Recipe(
            id = 1,
            title = "Chapati",
            type= "Snack",
            numberOfPeople = 5,
            difficultyLevel = "beginner",
            ingredients = "Whole wheat flour (atta)\n" +
                    "Water\n" +
                    "Salt (optional)\n" +
                    "Ghee or oil (for greasing)",
            preparationSteps = "Measure the ingredients: Take the desired amount of whole wheat flour in a mixing bowl. You can add a pinch of salt for taste, but it's optional.\n" +
                    "\n" +
                    "Add water: Gradually add water to the flour while kneading it with your hands. Keep mixing until you form a smooth, soft dough. The amount of water needed may vary, so add it little by little until you achieve the right consistency.\n" +
                    "\n" +
                    "Rest the dough: Cover the dough with a damp cloth or place it in a covered container. Let it rest for about 15-30 minutes. Resting the dough allows the gluten to relax, making it easier to roll out the chapatis.\n" +
                    "\n" +
                    "Heat the griddle: Place a flat non-stick griddle or tawa on medium-high heat. You can also use a cast-iron skillet.\n" +
                    "\n" +
                    "Divide the dough: After resting, divide the dough into small, equal-sized balls. The size will depend on how big you want your chapatis to be.\n" +
                    "\n" +
                    "Roll out the chapatis: Take one dough ball, flatten it with your hands, and dip it in some dry flour to prevent sticking. Using a rolling pin, roll it out into a thin, round disc. Try to keep the shape as circular as possible.\n" +
                    "\n" +
                    "Cook the chapati: Place the rolled-out chapati on the preheated griddle. Let it cook for about 30 seconds to a minute or until you see small bubbles forming on the surface.\n" +
                    "\n" +
                    "Flip and cook the other side: Once you see the bubbles, flip the chapati using a spatula or tongs. Cook the other side for another 30 seconds to a minute.\n" +
                    "\n" +
                    "Puffing (optional): You can puff up the chapati by gently pressing its surface with a clean cloth or spatula. This helps it puff up like a balloon, but it's optional and takes practice.\n" +
                    "\n" +
                    "Grease and serve: Remove the cooked chapati from the griddle and lightly grease it with ghee or oil (optional). Serve it hot with your favorite curries, vegetables, or other accompaniments.",
            recipeImageId = R.drawable.chapati
        ),
        Recipe(
            id = 1,
            title = "Ugali",
            type= "Supper",
            numberOfPeople =5,
            difficultyLevel = "beginner",
            ingredients = "Maize flour (cornmeal)\n" +
                    "Water",
            preparationSteps = "Measure the ingredients: In a saucepan or cooking pot, measure the desired amount of maize flour. The typical ratio is approximately 1 cup of maize flour to 2 cups of water, but you can adjust it based on your preference and the number of servings you want to make.\n" +
                    "\n" +
                    "Boil the water: Place the saucepan on the stovetop and pour in the water. Heat the water until it comes to a rolling boil.\n" +
                    "\n" +
                    "Add the maize flour: Once the water is boiling, reduce the heat to low. Gradually add the maize flour to the hot water while stirring continuously with a wooden spoon or spatula. This is important to avoid lumps from forming.\n" +
                    "\n" +
                    "Stir and cook: Keep stirring the mixture vigorously to incorporate the flour into the water. The ugali will begin to thicken as it cooks. Continue stirring to prevent sticking and to achieve a smooth, consistent texture.\n" +
                    "\n" +
                    "Simmer and cook thoroughly: Cover the saucepan and let the ugali simmer on low heat for about 5-10 minutes. The cooking time will depend on the quantity you are preparing. The ugali is ready when it becomes firm and solidifies into a cohesive mass.\n" +
                    "\n" +
                    "Shape and serve: Once the ugali is cooked, remove the saucepan from the heat. Wet your hands with some water to prevent sticking, then scoop a portion of the ugali and shape it into a ball or mound.\n" +
                    "\n" +
                    "Accompaniments: Ugali is commonly served as an accompaniment to various dishes, such as stews, vegetables, or meat dishes. It can be used as a utensil to scoop up and eat the other dishes.\n" +
                    "\n" +
                    "Enjoy: Ugali is best enjoyed while it's still warm. You can use it to scoop up the other dishes and savor the flavors together",
            recipeImageId = R.drawable.ugali
        ),
        Recipe(
            id = 1,
            title = "Rice",
            type= "Lunch",
            numberOfPeople =8,
            difficultyLevel = "beginner",
            ingredients = "Rice\n" +
                    "Water\n" +
                    "Salt (optional)",
            preparationSteps = "Rinse the rice under cold water.\n" +
                    "Combine rice and water in a pot (1 cup rice to 1.5-2 cups water).\n" +
                    "Bring to a boil, then reduce heat to low and cover.\n" +
                    "Simmer for about 15-20 minutes (check packaging for specifics).\n" +
                    "Turn off heat, let it steam for a few minutes.\n" +
                    "Fluff with a fork and serve.",
            recipeImageId = R.drawable.rice
        ),
        Recipe(
            id = 1,
            title = "Scrambled egg",
            type= "Breakfast",
            numberOfPeople =8,
            difficultyLevel = "beginner",
            ingredients = "Eggs\n" +
                    "Salt (optional)\n" +
                    "Butter or oil (for cooking)",
            preparationSteps = "Crack the eggs into a bowl.\n" +
                    "Add a pinch of salt if desired and beat the eggs until the yolks and whites are well combined.\n" +
                    "Heat a non-stick skillet over medium heat and add a small amount of butter or oil.\n" +
                    "Pour the beaten eggs into the skillet.\n" +
                    "Stir gently and continuously with a spatula until the eggs are cooked to your preferred level of doneness (soft or slightly firm).\n" +
                    "Remove from heat and serve immediately.",
            recipeImageId = R.drawable.scrambledegg

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
