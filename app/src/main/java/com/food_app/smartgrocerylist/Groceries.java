package com.food_app.smartgrocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;



public class Groceries extends AppCompatActivity {

    private Button button_search,button_chickenlemon,button_greensalad, button_fruits, button_vegetables, button_dairy, button_bread,button_mfs,button_prc,button_frozen;
    private Button button_groceries,button_recipes, button_home, button_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groceries);

        // Initialize the buttons
        button_groceries = (Button) findViewById(R.id.groceries_btn);
        button_groceries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openGroceries();}
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


        button_search = (Button) findViewById(R.id.search_btn);
        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Groceries.this,Pasta_Rice_Cereal.class);
                intent.putExtra("checkFusilli",Pasta_Rice_Cereal.isFusilliChecked);
                startActivity(intent);
                openSpaghettiCarbonara();
            }
        });
        button_chickenlemon = (Button) findViewById(R.id.chickenlemon_btn);
        button_chickenlemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Groceries.this,Meat_Fish_Seafood.class);
                intent.putExtra("checkChicken",Meat_Fish_Seafood.isChickenChecked);
                startActivity(intent);
                openChickenLemon();
            }
        });
       button_greensalad = (Button) findViewById(R.id.greensalad_btn);
        button_greensalad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent1 = new Intent(Groceries.this,Vegetables.class);
                intent1.putExtra("checkTomato",Vegetables.isTomatoChecked);
                startActivity(intent1);
                Intent intent2 = new Intent(Groceries.this,Vegetables.class);
                intent2.putExtra("checkCucumber",Vegetables.isCucumberChecked);
                startActivity(intent2);
                openGreenSalad();
            }
        });

        button_fruits = (Button) findViewById(R.id.fruits_btn);
        button_fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openFruits();
            }
        });

        button_vegetables = (Button) findViewById(R.id.vegetables_btn);
        button_vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openVegetables();
            }
        });

        button_dairy = (Button) findViewById(R.id.dairy_btn);
        button_dairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openDairy();
            }
        });

        button_bread = (Button) findViewById(R.id.bread_btn);
        button_bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openBread();
            }
        });

        button_mfs = (Button) findViewById(R.id.mfs_btn);
        button_mfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openMFS();
            }
        });
        button_prc = (Button) findViewById(R.id.prc_btn);
        button_prc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openPRC();
            }
        });
        button_frozen = (Button) findViewById(R.id.frozen_btn);
        button_frozen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openFrozen();
            }
        });




        boolean checkFusilli = getIntent().getBooleanExtra("checkFusilli", false);
        boolean checkEggs = getIntent().getBooleanExtra("checkEggs", false);
        boolean checkMilk = getIntent().getBooleanExtra("checkMilk", false);
        boolean checkCheese = getIntent().getBooleanExtra("checkCheese",false);
        if((checkFusilli==true && checkEggs==true && checkCheese==true && checkMilk==true)||checkFusilli==true)
            button_search.setVisibility(View.VISIBLE);
        else
            button_search.setVisibility(View.GONE);

        boolean checkLemon = getIntent().getBooleanExtra("checkLemon",false);
        boolean checkChicken = getIntent().getBooleanExtra("checkChicken",false);
        boolean checkSweetPotato = getIntent().getBooleanExtra("checkSweetPotato", false);
        if((checkChicken==true && checkLemon==true && checkSweetPotato==true)||checkChicken==true)
        button_chickenlemon.setVisibility(View.VISIBLE);
        else
        button_chickenlemon.setVisibility(View.GONE);

        boolean checkTomato = getIntent().getBooleanExtra("checkTomato", false);
        boolean checkCucumber = getIntent().getBooleanExtra("checkCucumber", false);

       if((checkTomato==true &&  checkCucumber==true) || checkCucumber==true ||checkTomato==true)
           button_greensalad.setVisibility(View.VISIBLE);
       else
           button_greensalad.setVisibility(View.GONE);


    }
    public void openChickenLemon()
    {
        Intent intent = new Intent(this, Chicken_Lemon.class);
        startActivity(intent);
    }

    public void openSpaghettiCarbonara()
    {
            Intent intent = new Intent(this, SpaghettiCarbonara.class);
            startActivity(intent);
    }
    public void  openGreenSalad()
    {
        Intent intent = new Intent(this, Green_Salad.class);
        startActivity(intent);
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
    public void openFruits()
    {
        Intent intent =  new Intent(this,Fruits.class);
        startActivity(intent);

    }
    public void openVegetables()
    {
        Intent intent =  new Intent(this,Vegetables.class);
        startActivity(intent);

    }
    public void openDairy()
    {
        Intent intent =  new Intent(this,Dairy.class);
        startActivity(intent);

    }
    public void openBread()
    {
        Intent intent =  new Intent(this,Bread.class);
        startActivity(intent);

    }
    public void openMFS()
    {
        Intent intent =  new Intent(this,Meat_Fish_Seafood.class);
        startActivity(intent);

    }
    public void openPRC()
    {
        Intent intent =  new Intent(this,Pasta_Rice_Cereal.class);
        startActivity(intent);

    }
    public void openFrozen()
    {
        Intent intent =  new Intent(this,Frozen_Foods.class);
        startActivity(intent);

    }


}