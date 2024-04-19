package com.food_app.smartgrocerylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button button_groceries,button_recipes, button_home, button_account;

    private RecyclerView recyclerView;
    private RecipeAdapter recipeAdapter;
    private ArrayList<Recipe>recipeList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the buttons
        button_groceries = (Button) findViewById(R.id.groceries_btn);
        button_groceries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openGroceries();
            }
        });

        button_home = (Button) findViewById(R.id.home_btn);
        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openHome();
            }
        });

        button_recipes = (Button) findViewById(R.id.recipes_btn);
        button_recipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openRecipes();
            }
        });
        button_account = (Button) findViewById(R.id.account_btn);
        button_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openAccount();
            }
        });





// Initialize recipe list
        recipeList = new ArrayList<>();
        recipeList.add(new Recipe("Spaghetti Carbonara", "Ingredients:\n" +
                "Pasta\n" +
                "Parmesan cheese\n" +
                "Soft Cheese\n" +
                "Any kind of cheese\n" +
                "1 Egg\n" +
                "Milk\n" +
                "Bacon\n" +
                "Salt\n" +
                "Pepper\n" +
                "\n" +
                "Preparation:\n" +
                "Boil the pasta with a liitle bir of salt for as long as it is written on the package, usually 10 min max.\n" +
                "While the pasta is boiling mix the egg, milk, pepper, parmesan cheese and any kind of cheese you chooseto make the sauce.\n" +
                "Chop the bacon and fry it\n" +
                "Once the pasta is boiled we separate it from the water\n" +
                "At the end, add the pasta over the bacon and give it a good mix, and then add the sauce.", R.drawable.spaghetti_carbonara));
        recipeList.add(new Recipe("Chicken Fajitas", "Ingredients:\n" +
                "Canola oil\n" +
                "Lemon juice\n" +
                "Salt\n" +
                "Dried oregano\n" +
                "Ground cumin\n" +
                "Garlic powder\n" +
                "Chili powder\n" +
                "Paprika\n" +
                "Crushed red pepper flakes, optional\n" +
                "Boneless skinless chicken breasts, cut into thin strips\n" +
                "Medium sweet red pepper\n" +
                "Medium green pepper\n" +
                "Green onions\n" +
                "Flour tortillas, warmed\n" +
                "Optional: Shredded cheddar cheese, taco sauce, salsa, guacamole, sliced red onions and sour cream\n" +
                "\n" +
                "Preparation:\n" +
                "In a large bowl, combine 2 tablespoons oil, lemon juice and seasonings; add the chicken. Turn to coat; cover. Refrigerate for 1-4 hours.\n" +
                "In a large cast-iron or other heavy skillet, saute peppers and onions in remaining oil until crisp-tender. Remove and keep warm.\n" +
                "Drain chicken, discarding marinade. In the same skillet, cook chicken over medium-high heat until no longer pink, 5-6 minutes. Return pepper mixture to pan; heat through.\n" +
                "Spoon filling down the center of tortillas; fold in half. Add toppings as desired, fold in half.", R.drawable.chicken_fajitas));
        recipeList.add(new Recipe("Beef Stroganoff", "Ingredients:\n" +
                "1  package egg noodles\n" +
                "1 pound ground beef\n" +
                "1 can fat-free condensed cream of mushroom soup\n" +
                "1 tablespoon garlic powder\n" +
                "½ cup sour cream\n" +
                "Salt and ground black pepper to taste\n" +
                "\n" +
                "Preparation:\n" +
                "Sauté ground beef in a large skillet over medium heat until browned and crumbly; 5 to 10 minutes.\n" +
                "At the same time, fill a large pot with lightly salted water and bring to a rapid boil. Cook egg noodles at a boil until tender yet firm to the bite, 7 to 9 minutes. Drain and set aside.\n" +
                "Drain and discard any fat from the cooked beef. Stir condensed soup and garlic powder into the beef. Simmer for 10 minutes, stirring occasionally.\n" +
                "Remove beef from the heat. Add egg noodles and stir to combine. Stir in sour cream and season with salt and pepper.", R.drawable.beef_stroganoff));
        recipeList.add(new Recipe("Chicken Pizza", "Ingredients: \n" +
                "Topping: \n" +
                "chicken \n" +
                "corn \n" +
                "mushrooms \n" +
                "olives\n" +
                "tomato sauce\n" +
                "cheese \n" +
                "mozzarella \n" +
                "\n" +
                "Dough: \n" +
                "flour \n" +
                "yeast \n" +
                "water\n", R.drawable.chicken_pizza));
        recipeList.add(new Recipe("Green Salad", "Ingredients:\n" +
                "Tomatoes\n" +
                "Cucumbers\n" +
                "Rucola\n" +
                "Baby spinach\n" +
                "Cottage cheese\n" +
                "Bread\n" +
                "Oregano\n" +
                "Salt\n" +
                "\n" +
                "Preparation:\n" +
                "Chop the tomatoes, cucumbers, rucola, spinach and cheese.\n" +
                "Tomatoes and cucumbers are added alternately\n" +
                "On top, add arugula and baby spinach and cheese on top of them\n" +
                "And at the end it is seasoned with a little oregano\n" +
                "A few slices of toast\n" +
                "And that's it", R.drawable.green_salad));
        recipeList.add(new Recipe("Chicken Lemon", "Ingredients:\n" +
                "chicken breast\n" +
                "Sweet potatoes\n" +
                "Lemon\n" +
                "Salt\n" +
                "Pepper\n" +
                "Oregano\n" +
                "Rosemary\n" +
                "\n" +
                "Preparation:\n" +
                "Put the potatoes in the oven seasoned with salt and oregano\n" +
                "Season the chicken with salt and pepper\n" +
                "The chicken is precooked in a pan in lemon sauce for 10 minutes\n" +
                "Place in the tray with lemon and orange slices and a sprig of rosemary for 10 minutes at 180 degrees\n", R.drawable.chicken_lemon));

        // Initialize RecyclerView and set adapter
        recyclerView = findViewById(R.id.recycler_random);
        recipeAdapter = new RecipeAdapter(this, recipeList);
        recyclerView.setAdapter(recipeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    public void openHome()
    {
        Intent intent =  new Intent(this,MainActivity.class);
        startActivity(intent);

    }
    public void openGroceries()
    {
        Intent intent =  new Intent(this,Groceries.class);
        startActivity(intent);

    }
    public void openRecipes()
    {
        Intent intent =  new Intent(this,Recipes.class);
        startActivity(intent);

    }
    public void openAccount()
    {
        Intent intent =  new Intent(this,Account.class);
        startActivity(intent);

    }
    public void openLogin()
    {
        Intent intent =  new Intent(this,Login.class);
        startActivity(intent);

    }
    public void openSignup()
    {
        Intent intent =  new Intent(this,Signup.class);
        startActivity(intent);

    }
}