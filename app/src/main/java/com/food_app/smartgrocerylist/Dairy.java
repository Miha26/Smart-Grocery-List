package com.food_app.smartgrocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Dairy extends AppCompatActivity {
    private CheckBox check_butter, check_cheese, check_eggs, check_milk, check_yogourt, check_ayran, check_kefir, check_cream, check_sourc;
    public static boolean isEggsChecked;
    public static boolean isMilkChecked;
    public static boolean isCheeseChecked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);

        check_butter = (CheckBox) findViewById(R.id.butter_check);
        check_cheese = (CheckBox) findViewById(R.id.cheese_check);
        check_eggs = (CheckBox) findViewById(R.id.eggs_check);
        check_milk = (CheckBox) findViewById(R.id.milk_check);
        check_yogourt = (CheckBox) findViewById(R.id.yogourt_check);
        check_ayran = (CheckBox) findViewById(R.id.ayran_check);
        check_kefir = (CheckBox) findViewById(R.id.kefir_check);
        check_cream = (CheckBox) findViewById(R.id.cream_check);
        check_sourc = (CheckBox) findViewById(R.id.sourc_check);


        check_butter.setChecked(getSharedPreferences("Butter", Context.MODE_PRIVATE).getBoolean("check_butter", true));
         check_cheese.setChecked(getSharedPreferences("Cheese", Context.MODE_PRIVATE).getBoolean(" check_cheese", true));
        check_eggs.setChecked(getSharedPreferences("Eggs", Context.MODE_PRIVATE).getBoolean("check_eggs", true));
        check_milk.setChecked(getSharedPreferences("Milk", Context.MODE_PRIVATE).getBoolean("check_milk", true));
         check_yogourt.setChecked(getSharedPreferences("Yogourt", Context.MODE_PRIVATE).getBoolean(" check_yogourt", true));
         check_ayran.setChecked(getSharedPreferences("Ayran", Context.MODE_PRIVATE).getBoolean(" check_ayran", true));
        check_kefir.setChecked(getSharedPreferences("Kefir", Context.MODE_PRIVATE).getBoolean("check_kefir", true));
        check_cream.setChecked(getSharedPreferences("Cream", Context.MODE_PRIVATE).getBoolean("check_cream", true));
        check_sourc.setChecked(getSharedPreferences("Sour Cream", Context.MODE_PRIVATE).getBoolean("check_sourc", true));

        check_butter.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Butter", Context.MODE_PRIVATE).edit().putBoolean("check_butter", isChecked).commit();

            }
        });
         check_cheese.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Cheese", Context.MODE_PRIVATE).edit().putBoolean(" check_cheese", isChecked).commit();

                isCheeseChecked=isChecked;
                Intent intent = new Intent(Dairy.this, Groceries.class);
                CheckBox checkBox = findViewById(R.id.cheese_check);
                boolean isGood = checkBox.isChecked();
                intent.putExtra("checkCheese", isGood);
                startActivity(intent);
            }
        });

        check_eggs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Eggs", Context.MODE_PRIVATE).edit().putBoolean("check_eggs", isChecked).commit();

                isEggsChecked=isChecked;
                Intent intent = new Intent(Dairy.this, Groceries.class);
                CheckBox checkBox = findViewById(R.id.eggs_check);
                boolean isGood = checkBox.isChecked();
                intent.putExtra("checkEggs", isGood);
                startActivity(intent);
            }
        });

        check_milk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Milk", Context.MODE_PRIVATE).edit().putBoolean("check_milk", isChecked).commit();

                isMilkChecked=isChecked;

                Intent intent = new Intent(Dairy.this, Groceries.class);
                CheckBox checkBox = findViewById(R.id.milk_check);
                boolean isGood = checkBox.isChecked();
                intent.putExtra("checkMilk", isGood);
                startActivity(intent);

            }
        });
         check_yogourt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Yogourt", Context.MODE_PRIVATE).edit().putBoolean(" check_yogourt", isChecked).commit();

            }
        });
         check_ayran.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Ayran", Context.MODE_PRIVATE).edit().putBoolean(" check_ayran", isChecked).commit();

            }
        });

        check_kefir.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Kefir", Context.MODE_PRIVATE).edit().putBoolean("check_kefir", isChecked).commit();

            }
        });
        check_cream.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Cream", Context.MODE_PRIVATE).edit().putBoolean("check_cream", isChecked).commit();

            }
        });
        check_sourc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Sour Cream", Context.MODE_PRIVATE).edit().putBoolean("check_sourc", isChecked).commit();

            }
        });


    }
}