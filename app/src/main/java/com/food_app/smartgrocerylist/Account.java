package com.food_app.smartgrocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Account extends AppCompatActivity {
    private Button button_groceries,button_recipes, button_home, button_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
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
}