package com.example.recipe.data

import android.content.Context
import com.example.recipe.R
import com.example.recipe.Recipe
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

private val Unit.foreach: Unit
    get() {}

private fun Any.forEach(function: (Any?) -> Unit) {
    TODO("Not yet implemented")
}

object DataProvider {
    val recipeList = listOf(
        Recipe(
            id = 1,
            title = "Chapati",
            type = "Snack",
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
            id = 2,
            title = "Ugali",
            type = "Supper",
            numberOfPeople = 5,
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
            id = 3,
            title = "Rice",
            type = "Lunch",
            numberOfPeople = 8,
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
            id = 4,
            title = "Scrambled egg",
            type = "Breakfast",
            numberOfPeople = 8,
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
            id = 5,
            title = "meat stew",
            type = "lunch",
            numberOfPeople = 5,
            difficultyLevel = "beginner",
            ingredients = "Meat (beef, chicken, lamb, or any preferred meat)\n" +
                    "Onions (chopped)\n" +
                    "Garlic (minced)\n" +
                    "Tomatoes (chopped or canned)\n" +
                    "Carrots (sliced, optional)\n" +
                    "Potatoes (cubed, optional)\n" +
                    "Beef or chicken broth (or water)\n" +
                    "Cooking oil or butter\n" +
                    "Salt and pepper (to taste)\n" +
                    "Herbs and spices (optional, like thyme, bay leaf, etc.)",
            preparationSteps = "Heat oil or butter in a large pot over medium heat.\n" +
                    "Add chopped onions and minced garlic. Sauté until onions are translucent.\n" +
                    "Add the meat pieces and brown them on all sides.\n" +
                    "Pour in chopped tomatoes and cook until they soften.\n" +
                    "If using, add sliced carrots and cubed potatoes.\n" +
                    "Season with salt, pepper, and any desired herbs and spices.\n" +
                    "Pour in enough beef or chicken broth (or water) to cover the ingredients.\n" +
                    "Bring the mixture to a boil, then reduce the heat to low.\n" +
                    "Cover the pot with a lid and let it simmer for about 1 to 2 hours or until the meat is tender and flavors have melded.",
            recipeImageId = R.drawable.stew

        ),
        Recipe(
            id = 6,
            title = "tea",
            type = "Breakfast",
            numberOfPeople = 5,
            difficultyLevel = "beginner",
            ingredients = "Black tea leaves or tea bags\n" +
                    "Water\n" +
                    "Milk\n" +
                    "Sugar (optional, for sweetness)",
            preparationSteps = "Boil water in a kettle or saucepan.\n" +
                    "Add black tea leaves or tea bags to a teapot or directly into the boiling water.\n" +
                    "Let the tea steep for 3-5 minutes, depending on your desired strength.\n" +
                    "Meanwhile, heat milk in a separate saucepan or microwave until warm (but not boiling).\n" +
                    "Once the tea has steeped, strain the tea leaves or remove the tea bags.\n" +
                    "Pour the steeped tea into cups, filling them about two-thirds full.\n" +
                    "Add the warm milk to the tea, adjusting the ratio to your preference (more milk for a creamier taste).\n" +
                    "If desired, sweeten the milk tea with sugar or any other sweetener of your choice.\n" +
                    "Stir well to combine all the ingredients.\n" +
                    "Serve hot and enjoy your delicious milk tea!",
            recipeImageId = R.drawable.tea

        ),
        Recipe(
            id = 7,
            title = "uji",
            type = "Breakfast",
            numberOfPeople = 5,
            difficultyLevel = "beginner",
            ingredients = "Maize flour (cornmeal) or millet flour\n" +
                    "Water\n" +
                    "Milk (optional)\n" +
                    "Sugar or sweetener (optional)\n" +
                    "Spices (e.g., cinnamon, cardamom) (optional)",
            preparationSteps = "In a saucepan, mix maize flour (or millet flour) with water to create a smooth, thick paste.\n" +
                    "\n" +
                    "Add more water to the saucepan and stir the mixture, ensuring there are no lumps. The consistency should be similar to a thin porridge.\n" +
                    "\n" +
                    "Place the saucepan on medium heat and bring the mixture to a boil, stirring occasionally to prevent sticking.\n" +
                    "\n" +
                    "Lower the heat to a simmer and continue stirring to avoid burning.\n" +
                    "\n" +
                    "Cook the uji for about 5-10 minutes or until it thickens to your desired consistency. The longer you cook it, the thicker it will become.\n" +
                    "\n" +
                    "If using milk, you can add it at this point to give the uji a creamier texture. Stir it in gently.\n" +
                    "\n" +
                    "If you prefer a sweeter taste, add sugar or any sweetener of your choice. Adjust the sweetness to suit your taste.\n" +
                    "\n" +
                    "Optionally, you can add spices like cinnamon or cardamom for extra flavor.\n" +
                    "\n" +
                    "Once the uji is cooked to your liking and all the ingredients are well combined, remove the saucepan from the heat.\n" +
                    "\n" +
                    "Serve the uji hot in bowls or cups, and enjoy this delicious and comforting East African porridge!",
            recipeImageId = R.drawable.uji

        ),
        Recipe(
            id = 8,
            title = "maandazi",
            type = "Breakfast",
            numberOfPeople = 5,
            difficultyLevel = "beginner",
            ingredients = "All-purpose flour\n" +
                    "Baking powder\n" +
                    "Sugar\n" +
                    "Coconut milk or regular milk\n" +
                    "Vegetable oil (for frying)\n" +
                    "Cardamom or vanilla extract (optional, for flavor)",
            preparationSteps = "In a mixing bowl, combine all-purpose flour, baking powder, and sugar. You can also add a pinch of salt for flavor.\n" +
                    "\n" +
                    "If using, add cardamom or vanilla extract to enhance the flavor of the maandazi.\n" +
                    "\n" +
                    "Gradually pour in coconut milk or regular milk and mix the ingredients to form a soft, non-sticky dough.\n" +
                    "\n" +
                    "Knead the dough for a few minutes until it becomes smooth and elastic.\n" +
                    "\n" +
                    "Cover the dough with a damp cloth or plastic wrap and let it rest for about 15-30 minutes.\n" +
                    "\n" +
                    "Heat vegetable oil in a deep frying pan or pot over medium heat.\n" +
                    "\n" +
                    "Take a small portion of the dough and roll it into a ball or flatten it into your desired maandazi shape (often triangles or squares).\n" +
                    "\n" +
                    "Carefully drop the maandazi into the hot oil and fry until they turn golden brown on both sides.\n" +
                    "\n" +
                    "Once cooked, remove the maandazi from the oil and place them on a paper towel to drain excess oil.\n" +
                    "\n" +
                    "Serve the maandazi warm and enjoy this delightful East African snack with a cup of tea or coffee.",
            recipeImageId = R.drawable.maandazi

        ),
        Recipe(
            id = 9,
            title = "steamed beef",
            type = "lunch",
            numberOfPeople = 5,
            difficultyLevel = "beginner",
            ingredients = "Beef (cut into desired pieces, such as cubes, strips, or steaks)\n" +
                    "Cooking oil or butter\n" +
                    "Onions (chopped, optional)\n" +
                    "Garlic (minced, optional)\n" +
                    "Salt and pepper (to taste)\n" +
                    "Herbs and spices (optional, like thyme, rosemary, paprika, etc.)\n" +
                    "Beef broth or water (optional)",
            preparationSteps = "Season the beef: If desired, season the beef with salt, pepper, and any preferred herbs or spices. Let it sit for a few minutes to allow the flavors to infuse.\n" +
                    "\n" +
                    "Heat oil or butter in a skillet or a cooking pot over medium-high heat.\n" +
                    "\n" +
                    "Add chopped onions and minced garlic to the hot oil or butter. Sauté until the onions become translucent and the garlic releases its aroma (optional).\n" +
                    "\n" +
                    "Add the seasoned beef to the skillet or pot. Cook the beef pieces until they are browned on all sides, adjusting the heat as needed to prevent burning.\n" +
                    "\n" +
                    "If you prefer a more tender texture, you can add beef broth or water to the pot, just enough to cover the beef.\n" +
                    "\n" +
                    "Lower the heat to a simmer, cover the pot with a lid, and let the beef cook for about 1 to 2 hours or until it becomes tender. The cooking time will depend on the type of beef and the size of the pieces.\n" +
                    "\n" +
                    "Check the seasoning and adjust with more salt and pepper if necessary.\n" +
                    "\n" +
                    "Once the beef is tender and cooked to your liking, remove it from the heat.\n" +
                    "\n" +
                    "Serve the beef hot, and it can be enjoyed as is, or used in various dishes like stews, stir-fries, sandwiches, and more.",
            recipeImageId = R.drawable.beef

        ),
        Recipe(
            id =10,
            title = "smoky",
            type = "Breakfast",
            numberOfPeople = 5,
            difficultyLevel = "beginner",
            ingredients = "Smokies (smoked sausages or hot dogs)\n" +
                    "Cooking oil or butter\n" +
                    "Onions (optional, for topping)\n" +
                    "Ketchup, mustard, or other condiments (optional, for serving)\n" +
                    "Buns or bread rolls (optional, for serving)",
            preparationSteps = "Heat a frying pan or grill pan over medium heat or preheat a grill.\n" +
                    "\n" +
                    "If using a frying pan, add a small amount of cooking oil or butter to prevent sticking. If grilling, you can brush some oil on the smokies to keep them moist.\n" +
                    "\n" +
                    "Place the smokies on the heated pan or grill, and cook them for a few minutes on each side until they are heated through and lightly browned. Make sure to turn them occasionally for even cooking.\n" +
                    "\n" +
                    "While the smokies are cooking, you can also toast the buns or bread rolls on the grill or in a toaster.\n" +
                    "\n" +
                    "Once the smokies are cooked, remove them from the heat.\n" +
                    "\n" +
                    "Serve the smokies in the toasted buns or bread rolls. You can also add optional toppings like chopped onions and condiments such as ketchup or mustard.\n" +
                    "\n" +
                    "Enjoy your delicious smokie as a quick and tasty snack or meal!",
            recipeImageId = R.drawable.smokie

        ),


        )
    suspend fun saveMealsToDatabase(context: Context) {
        val database = Provider.getDatabase(context)
        val recipeDao = database.recipeDao()


        withContext(Dispatchers.IO) {

            recipeDao.clearAllRecipes()
            recipeList.forEach { Recipe->
                val recipeEntity= RecipeEntity(
                    id = Recipe.id,
                    title = Recipe.title,
                    type =  Recipe.type,
                    numberOfPeople = Recipe.numberOfPeople,
                    difficultyLevel = Recipe.difficultyLevel,
                    ingredients = Recipe.ingredients,
                    preparationSteps = Recipe.preparationSteps,
                    recipeImageId = Recipe.recipeImageId
                )
                recipeDao.insertRecipes(recipeEntity)

            }
    }
    }
}

