package com.food_app.smartgrocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;

import android.widget.CompoundButton;
public class Meat_Fish_Seafood extends AppCompatActivity {
    private CheckBox check_chicken, check_beef, check_turkey, check_pork, check_goat, check_lamb, check_rabbit, check_cow, check_duck, check_goose, check_tuna, check_cod, check_herring, check_sardines, check_salmon, check_shrimp, check_crab, check_shells, check_lobster, check_squid, check_caviar, check_seaweed;

    public static boolean isChickenChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat_fish_seafood);

        // Initialize the Check Boxes
        check_chicken = (CheckBox) findViewById(R.id.chicken_check);
        check_beef = (CheckBox) findViewById(R.id.beef_check);
        check_turkey = (CheckBox) findViewById(R.id.turkey_check);
        check_pork = (CheckBox) findViewById(R.id.pork_check);
        check_goat = (CheckBox) findViewById(R.id.goat_check);
        check_lamb = (CheckBox) findViewById(R.id.lamb_check);
        check_rabbit = (CheckBox) findViewById(R.id.rabbit_check);
        check_cow = (CheckBox) findViewById(R.id.cow_check);
        check_duck = (CheckBox) findViewById(R.id.duck_check);
        check_goose = (CheckBox) findViewById(R.id.goose_check);
        check_tuna = (CheckBox) findViewById(R.id.tuna_check);
        check_cod = (CheckBox) findViewById(R.id.cod_check);
        check_herring = (CheckBox) findViewById(R.id.herring_check);
        check_sardines = (CheckBox) findViewById(R.id.sardines_check);
        check_salmon = (CheckBox) findViewById(R.id.salmon_check);
        check_shrimp = (CheckBox) findViewById(R.id.shrimp_check);
        check_crab = (CheckBox) findViewById(R.id.crab_check);
        check_shells = (CheckBox) findViewById(R.id.shells_check);
        check_lobster = (CheckBox) findViewById(R.id.lobster_check);
        check_squid = (CheckBox) findViewById(R.id.squid_check);
        check_caviar = (CheckBox) findViewById(R.id.caviar_check);
        check_seaweed = (CheckBox) findViewById(R.id.seaweed_check);

        check_chicken.setChecked(getSharedPreferences("Chicken", Context.MODE_PRIVATE).getBoolean("check_chicken", true));
        check_beef.setChecked(getSharedPreferences("Beef", Context.MODE_PRIVATE).getBoolean("check_beef", true));
        check_turkey.setChecked(getSharedPreferences("Turkey", Context.MODE_PRIVATE).getBoolean("check_turkey", true));
        check_pork.setChecked(getSharedPreferences("Pork", Context.MODE_PRIVATE).getBoolean("check_pork", true));
        check_goat.setChecked(getSharedPreferences("Goat", Context.MODE_PRIVATE).getBoolean("check_goat", true));
        check_lamb.setChecked(getSharedPreferences("Lamb", Context.MODE_PRIVATE).getBoolean("check_lamb", true));
        check_rabbit.setChecked(getSharedPreferences("Rabbit", Context.MODE_PRIVATE).getBoolean("check_rabbit", true));
        check_cow.setChecked(getSharedPreferences("Cow", Context.MODE_PRIVATE).getBoolean("check_cow", true));
        check_duck.setChecked(getSharedPreferences("Duck", Context.MODE_PRIVATE).getBoolean("check_duck", true));
        check_goose.setChecked(getSharedPreferences("Goose", Context.MODE_PRIVATE).getBoolean("check_goose", true));
        check_tuna.setChecked(getSharedPreferences("Tuna", Context.MODE_PRIVATE).getBoolean("check_tuna", true));
        check_cod.setChecked(getSharedPreferences("Cod", Context.MODE_PRIVATE).getBoolean("check_cod", true));
        check_herring.setChecked(getSharedPreferences("Herring", Context.MODE_PRIVATE).getBoolean("check_herring", true));
        check_sardines.setChecked(getSharedPreferences("Sardines", Context.MODE_PRIVATE).getBoolean("check_sardines", true));
        check_salmon.setChecked(getSharedPreferences("Salmon", Context.MODE_PRIVATE).getBoolean("check_salmon", true));
        check_shrimp.setChecked(getSharedPreferences("Shrimp", Context.MODE_PRIVATE).getBoolean("check_shrimp", true));
        check_crab.setChecked(getSharedPreferences("Crab", Context.MODE_PRIVATE).getBoolean("check_crab", true));
        check_shells.setChecked(getSharedPreferences("Shells", Context.MODE_PRIVATE).getBoolean("check_shells", true));
        check_lobster.setChecked(getSharedPreferences("Lobster", Context.MODE_PRIVATE).getBoolean("check_lobster", true));
        check_squid.setChecked(getSharedPreferences("Squid", Context.MODE_PRIVATE).getBoolean("check_squid", true));
        check_caviar.setChecked(getSharedPreferences("Caviar", Context.MODE_PRIVATE).getBoolean("check_caviar", true));
        check_seaweed.setChecked(getSharedPreferences("Seaweed", Context.MODE_PRIVATE).getBoolean("check_seaweed", true));


        check_chicken.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Chicken", Context.MODE_PRIVATE).edit().putBoolean("check_chicken", isChecked).commit();

                isChickenChecked=isChecked;
                Intent intent = new Intent(Meat_Fish_Seafood.this, Groceries.class);
                CheckBox checkBox = findViewById(R.id.chicken_check);
                boolean isGood = checkBox.isChecked();
                intent.putExtra("checkChicken", isGood);
                startActivity(intent);
            }
        });

        check_beef.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Beef", Context.MODE_PRIVATE).edit().putBoolean("check_beef", isChecked).commit();
            }
        });

        check_turkey.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Turkey", Context.MODE_PRIVATE).edit().putBoolean("check_turkey", isChecked).commit();
            }
        });

        check_pork.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Pork", Context.MODE_PRIVATE).edit().putBoolean("check_pork", isChecked).commit();
            }
        });

        check_goat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Goat", Context.MODE_PRIVATE).edit().putBoolean("check_goat", isChecked).commit();
            }
        });

        check_lamb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Lamb", Context.MODE_PRIVATE).edit().putBoolean("check_lamb", isChecked).commit();
            }
        });

        check_rabbit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Rabbit", Context.MODE_PRIVATE).edit().putBoolean("check_rabbit", isChecked).commit();
            }
        });

        check_cow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Cow", Context.MODE_PRIVATE).edit().putBoolean("check_cow", isChecked).commit();
            }
        });

        check_duck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Duck", Context.MODE_PRIVATE).edit().putBoolean("check_duck", isChecked).commit();
            }
        });
        check_goose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Goose", Context.MODE_PRIVATE).edit().putBoolean("check_goose", isChecked).commit();
            }
        });

        check_tuna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Tuna", Context.MODE_PRIVATE).edit().putBoolean("check_tuna", isChecked).commit();
            }
        });

        check_cod.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Cod", Context.MODE_PRIVATE).edit().putBoolean("check_cod", isChecked).commit();
            }
        });

        check_herring.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Herring", Context.MODE_PRIVATE).edit().putBoolean("check_herring", isChecked).commit();
            }
        });

        check_sardines.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Sardines", Context.MODE_PRIVATE).edit().putBoolean("check_sardines", isChecked).commit();
            }
        });

        check_salmon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Salmon", Context.MODE_PRIVATE).edit().putBoolean("check_salmon", isChecked).commit();
            }
        });

        check_shrimp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Shrimp", Context.MODE_PRIVATE).edit().putBoolean("check_shrimp", isChecked).commit();
            }
        });

        check_crab.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Crab", Context.MODE_PRIVATE).edit().putBoolean("check_crab", isChecked).commit();
            }
        });

        check_shells.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Shells", Context.MODE_PRIVATE).edit().putBoolean("check_shells", isChecked).commit();
            }
        });

        check_lobster.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Lobster", Context.MODE_PRIVATE).edit().putBoolean("check_lobster", isChecked).commit();
            }
        });

        check_squid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Squid", Context.MODE_PRIVATE).edit().putBoolean("check_squid", isChecked).commit();
            }
        });

        check_caviar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Caviar", Context.MODE_PRIVATE).edit().putBoolean("check_caviar", isChecked).commit();
            }

        });
        check_seaweed.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Seaweed", Context.MODE_PRIVATE).edit().putBoolean("check_seaweed", isChecked).commit();
            }

        });


    }
}