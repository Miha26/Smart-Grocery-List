package com.food_app.smartgrocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Bread extends AppCompatActivity {

    private CheckBox check_whiteb, check_wheatb, check_wholemealb, check_ryeb, check_hamburger, check_hotdog, check_pita, check_sticks, check_rolls, check_croissant, check_pretzel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bread);
        // Initialize the Check Boxes
        check_whiteb = (CheckBox) findViewById(R.id.whiteb_check);
        check_wheatb = (CheckBox) findViewById(R.id.wheatb_check);
        check_wholemealb = (CheckBox) findViewById(R.id.wholemealb_check);
        check_ryeb = (CheckBox) findViewById(R.id.ryeb_check);
        check_hamburger = (CheckBox) findViewById(R.id.hamburger_check);
        check_hotdog = (CheckBox) findViewById(R.id.hotdog_check);
        check_pita = (CheckBox) findViewById(R.id.pita_check);
        check_sticks = (CheckBox) findViewById(R.id.sticks_check);
        check_rolls = (CheckBox) findViewById(R.id.rolls_check);
        check_croissant = (CheckBox) findViewById(R.id.croissant_check);
        check_pretzel = (CheckBox) findViewById(R.id.pretzel_check);

        check_whiteb.setChecked(getSharedPreferences("White Bread", Context.MODE_PRIVATE).getBoolean("check_whiteb", true));
        check_wheatb.setChecked(getSharedPreferences("Wheat Bread", Context.MODE_PRIVATE).getBoolean("check_wheatb", true));
        check_wholemealb.setChecked(getSharedPreferences("Wholemeal Bread", Context.MODE_PRIVATE).getBoolean("check_wholemealb", true));
        check_ryeb.setChecked(getSharedPreferences("Rye Bread", Context.MODE_PRIVATE).getBoolean("check_ryeb", true));
        check_hamburger.setChecked(getSharedPreferences("Hamburger Bun", Context.MODE_PRIVATE).getBoolean("check_hamburger", true));
        check_hotdog.setChecked(getSharedPreferences("Hot Dog Bun", Context.MODE_PRIVATE).getBoolean("check_hotdog", true));
        check_pita.setChecked(getSharedPreferences("Pita bread", Context.MODE_PRIVATE).getBoolean("check_pita", true));
        check_sticks.setChecked(getSharedPreferences("Bread Sticks", Context.MODE_PRIVATE).getBoolean("check_sticks", true));
        check_rolls.setChecked(getSharedPreferences("Rolls", Context.MODE_PRIVATE).getBoolean("check_rolls", true));
        check_croissant.setChecked(getSharedPreferences("Croissant", Context.MODE_PRIVATE).getBoolean("check_croissant", true));
        check_pretzel.setChecked(getSharedPreferences("Pretzel", Context.MODE_PRIVATE).getBoolean("check_pretzel", true));

        check_whiteb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("White Bread", Context.MODE_PRIVATE).edit().putBoolean("check_whiteb", isChecked).commit();
            }
        });

        check_wheatb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Wheat Bread", Context.MODE_PRIVATE).edit().putBoolean("check_wheatb", isChecked).commit();
            }
        });

        check_wholemealb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Wholemeal Bread", Context.MODE_PRIVATE).edit().putBoolean("check_wholemealb", isChecked).commit();
            }
        });

        check_ryeb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Rye Bread", Context.MODE_PRIVATE).edit().putBoolean("check_ryeb", isChecked).commit();
            }
        });

        check_hamburger.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Hamburger Bun", Context.MODE_PRIVATE).edit().putBoolean("check_hamburger", isChecked).commit();
            }
        });

        check_hotdog.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Hot Dog Bun", Context.MODE_PRIVATE).edit().putBoolean("check_hotdog", isChecked).commit();
            }
        });

        check_pita.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Pita bread", Context.MODE_PRIVATE).edit().putBoolean("check_pita", isChecked).commit();
            }
        });

        check_sticks.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Bread Sticks", Context.MODE_PRIVATE).edit().putBoolean("check_sticks", isChecked).commit();
            }
        });

        check_rolls.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Rolls", Context.MODE_PRIVATE).edit().putBoolean("check_rolls", isChecked).commit();
            }
        });

        check_croissant.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Croissant", Context.MODE_PRIVATE).edit().putBoolean("check_croissant", isChecked).commit();
            }
        });

        check_pretzel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Pretzel", Context.MODE_PRIVATE).edit().putBoolean("check_pretzel", isChecked).commit();
         }
        });
    }
}