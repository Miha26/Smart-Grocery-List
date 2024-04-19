package com.food_app.smartgrocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class Fruits extends AppCompatActivity {

    private CheckBox check_apple ,check_banana, check_grapes, check_orange, check_strawberry, check_avocado, check_peach, check_apricot, check_raspberry, check_bluebery, check_blackberry, check_cherry, check_coconut, check_dragon, check_kiwi, check_lime, check_lemon, check_mango, check_watermalon, check_pear, check_pineaple, check_nuts;

    public static boolean isLemonChecked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        // Initialize the Check Boxes
        check_apple = (CheckBox) findViewById(R.id.apple_check);
        check_banana = (CheckBox) findViewById(R.id.banana_check);
        check_grapes = (CheckBox) findViewById(R.id.grapes_check);
        check_orange = (CheckBox) findViewById(R.id.orange_check);
        check_strawberry = (CheckBox) findViewById(R.id.strawberry_check);
        check_avocado = (CheckBox) findViewById(R.id.avocado_check);
        check_peach = (CheckBox) findViewById(R.id.peach_check);
        check_apricot = (CheckBox) findViewById(R.id.apricot_check);
        check_raspberry = (CheckBox) findViewById(R.id.raspberry_check);
        check_bluebery = (CheckBox) findViewById(R.id.blueberry_check);
        check_blackberry = (CheckBox) findViewById(R.id.blackberry_check);
        check_cherry = (CheckBox) findViewById(R.id.cherry_check);
        check_coconut = (CheckBox) findViewById(R.id.coconut_check);
        check_dragon = (CheckBox) findViewById(R.id.dragon_check);
        check_kiwi = (CheckBox) findViewById(R.id.kiwi_check);
        check_lime = (CheckBox) findViewById(R.id.lime_check);
        check_lemon = (CheckBox) findViewById(R.id.lemon_check);
        check_mango = (CheckBox) findViewById(R.id.mango_check);
        check_watermalon = (CheckBox) findViewById(R.id.watermalon_check);
        check_pear= (CheckBox) findViewById(R.id.pear_check);
        check_pineaple = (CheckBox) findViewById(R.id.pineaple_check);
        check_nuts = (CheckBox) findViewById(R.id.nuts_check);


        check_apple.setChecked(getSharedPreferences("Apple", Context.MODE_PRIVATE).getBoolean("check_apple", true));
        check_banana.setChecked(getSharedPreferences("Banana", Context.MODE_PRIVATE).getBoolean("check_banana", true));
        check_grapes.setChecked(getSharedPreferences("Grapes", Context.MODE_PRIVATE).getBoolean("check_grapes", true));
        check_orange.setChecked(getSharedPreferences("Orange", Context.MODE_PRIVATE).getBoolean("check_orange", true));
        check_strawberry.setChecked(getSharedPreferences("Srawberry", Context.MODE_PRIVATE).getBoolean("check_strawberry", true));
        check_avocado.setChecked(getSharedPreferences("Avocado", Context.MODE_PRIVATE).getBoolean("check_avocado", true));
        check_peach.setChecked(getSharedPreferences("Peach", Context.MODE_PRIVATE).getBoolean("check_peach", true));
        check_apricot.setChecked(getSharedPreferences("Apricot", Context.MODE_PRIVATE).getBoolean("check_apricot", true));
        check_raspberry.setChecked(getSharedPreferences("Raspberry", Context.MODE_PRIVATE).getBoolean("check_raspberry", true));
        check_bluebery.setChecked(getSharedPreferences("Blueberry", Context.MODE_PRIVATE).getBoolean("check_bluebery", true));
        check_blackberry.setChecked(getSharedPreferences("Blackbery", Context.MODE_PRIVATE).getBoolean("check_blackberry", true));
        check_cherry.setChecked(getSharedPreferences("Cherry", Context.MODE_PRIVATE).getBoolean("check_cherry", true));
        check_coconut.setChecked(getSharedPreferences("Coconut", Context.MODE_PRIVATE).getBoolean("check_coconut", true));
        check_dragon.setChecked(getSharedPreferences("Dragon Fruit", Context.MODE_PRIVATE).getBoolean("check_dragon", true));
        check_kiwi.setChecked(getSharedPreferences("Kiwi", Context.MODE_PRIVATE).getBoolean("check_kiwi", true));
        check_lime.setChecked(getSharedPreferences("Lime", Context.MODE_PRIVATE).getBoolean("check_lime", true));
        check_lemon.setChecked(getSharedPreferences("Lemon", Context.MODE_PRIVATE).getBoolean("check_lemon", true));
        check_mango.setChecked(getSharedPreferences("Mango", Context.MODE_PRIVATE).getBoolean("check_mango", true));
        check_watermalon.setChecked(getSharedPreferences("Watermelon", Context.MODE_PRIVATE).getBoolean("check_watermalon", true));
        check_pear.setChecked(getSharedPreferences("Pear", Context.MODE_PRIVATE).getBoolean("check_pear", true));
        check_pineaple.setChecked(getSharedPreferences("Pineaple", Context.MODE_PRIVATE).getBoolean("check_pineaple", true));
        check_nuts.setChecked(getSharedPreferences("Nuts", Context.MODE_PRIVATE).getBoolean("check_nuts", true));




        check_apple.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Apple", Context.MODE_PRIVATE).edit().putBoolean("check_apple", isChecked).commit();

            }
        });

        check_banana.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Banana", Context.MODE_PRIVATE).edit().putBoolean("check_banana", isChecked).commit();

            }
        });

        check_grapes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Grapes", Context.MODE_PRIVATE).edit().putBoolean("check_grapes", isChecked).commit();

            }
        });

        check_orange.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Orange", Context.MODE_PRIVATE).edit().putBoolean("check_orange", isChecked).commit();

            }
        });
        check_strawberry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Srawberry", Context.MODE_PRIVATE).edit().putBoolean("check_strawberry", isChecked).commit();

            }
        });
        check_apple.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Apple", Context.MODE_PRIVATE).edit().putBoolean("check_apple", isChecked).commit();

            }
        });
        check_apple.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Apple", Context.MODE_PRIVATE).edit().putBoolean("check_apple", isChecked).commit();

            }
        });
        check_avocado.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Avocado", Context.MODE_PRIVATE).edit().putBoolean("check_avocado", isChecked).commit();

            }
        });
        check_peach.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Peach", Context.MODE_PRIVATE).edit().putBoolean("check_peach", isChecked).commit();

            }
        });
        check_apricot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Apricot", Context.MODE_PRIVATE).edit().putBoolean("check_apricot", isChecked).commit();

            }
        });
        check_raspberry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Raspberry", Context.MODE_PRIVATE).edit().putBoolean("check_raspberry", isChecked).commit();

            }
        });
        check_bluebery.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Blueberry", Context.MODE_PRIVATE).edit().putBoolean("check_bluebery", isChecked).commit();

            }
        });
        check_blackberry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Blackbery", Context.MODE_PRIVATE).edit().putBoolean("check_blackberry", isChecked).commit();

            }
        });
        check_cherry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Cherry", Context.MODE_PRIVATE).edit().putBoolean("check_cherry", isChecked).commit();

            }
        });
        check_coconut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Coconut", Context.MODE_PRIVATE).edit().putBoolean("check_coconut", isChecked).commit();

            }
        });
        check_dragon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Dragon Fruit", Context.MODE_PRIVATE).edit().putBoolean("check_dragon", isChecked).commit();

            }
        });
        check_kiwi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Kiwi", Context.MODE_PRIVATE).edit().putBoolean("check_kiwi", isChecked).commit();

            }
        });
        check_lime.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Lime", Context.MODE_PRIVATE).edit().putBoolean("check_lime", isChecked).commit();

            }
        });
        check_lemon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Lemon", Context.MODE_PRIVATE).edit().putBoolean("check_lemon", isChecked).commit();

                isLemonChecked=isChecked;
                Intent intent = new Intent(Fruits.this, Groceries.class);
                CheckBox checkBox = findViewById(R.id.lemon_check);
                boolean isGood = checkBox.isChecked();
                intent.putExtra("checkLemon", isGood);
                startActivity(intent);
            }
        });
        check_mango.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Mango", Context.MODE_PRIVATE).edit().putBoolean("check_mango", isChecked).commit();

            }
        });
        check_watermalon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Watermelon", Context.MODE_PRIVATE).edit().putBoolean("check_watermalon", isChecked).commit();

            }
        });
        check_pear.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Pear", Context.MODE_PRIVATE).edit().putBoolean("check_pear", isChecked).commit();

            }
        });
        check_pineaple.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Pineaple", Context.MODE_PRIVATE).edit().putBoolean("check_pineaple", isChecked).commit();

            }
        });

        check_nuts.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Nuts", Context.MODE_PRIVATE).edit().putBoolean("check_nuts", isChecked).commit();

            }
        });
















    }
}