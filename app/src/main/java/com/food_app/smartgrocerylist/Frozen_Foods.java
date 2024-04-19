package com.food_app.smartgrocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Frozen_Foods extends AppCompatActivity {

    private CheckBox check_iceCream, check_fishFillets, check_pizza, check_sausages, check_fishFingers, check_breadedChicken, check_burgers, check_iceLollies, check_yorkshirePuddings, check_sweetCorn, check_roastPotatoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frozen_foods);

        check_iceCream = (CheckBox) findViewById(R.id.ice_cream_check);
        check_fishFillets = (CheckBox) findViewById(R.id.fish_fillets_check);
        check_pizza = (CheckBox) findViewById(R.id.pizza_check);
        check_sausages = (CheckBox) findViewById(R.id.sausages_check);
        check_fishFingers = (CheckBox) findViewById(R.id.fish_fingers_check);
        check_breadedChicken = (CheckBox) findViewById(R.id.breaded_chicken_check);
        check_burgers = (CheckBox) findViewById(R.id.burgers_check);
        check_iceLollies = (CheckBox) findViewById(R.id.ice_lollies_check);
        check_yorkshirePuddings = (CheckBox) findViewById(R.id.yorkshire_puddings_check);
        check_sweetCorn = (CheckBox) findViewById(R.id.sweet_corn_check);
        check_roastPotatoes = (CheckBox) findViewById(R.id.roast_potatoes_check);

        check_iceCream.setChecked(getSharedPreferences("IceCream", Context.MODE_PRIVATE).getBoolean("check_iceCream", true));
        check_fishFillets.setChecked(getSharedPreferences("FishFillets", Context.MODE_PRIVATE).getBoolean("check_fishFillets", true));
        check_pizza.setChecked(getSharedPreferences("Pizza", Context.MODE_PRIVATE).getBoolean("check_pizza", true));
        check_sausages.setChecked(getSharedPreferences("Sausages", Context.MODE_PRIVATE).getBoolean("check_sausages", true));
        check_fishFingers.setChecked(getSharedPreferences("FishFingers", Context.MODE_PRIVATE).getBoolean("check_fishFingers", true));
        check_breadedChicken.setChecked(getSharedPreferences("BreadedChicken", Context.MODE_PRIVATE).getBoolean("check_breadedChicken", true));
        check_burgers.setChecked(getSharedPreferences("Burgers", Context.MODE_PRIVATE).getBoolean("check_burgers", true));
        check_iceLollies.setChecked(getSharedPreferences("IceLollies", Context.MODE_PRIVATE).getBoolean("check_iceLollies", true));
        check_yorkshirePuddings.setChecked(getSharedPreferences("YorkshirePuddings", Context.MODE_PRIVATE).getBoolean("check_yorkshirePuddings", true));
        check_sweetCorn.setChecked(getSharedPreferences("SweetCorn", Context.MODE_PRIVATE).getBoolean("check_sweetCorn", true));
        check_roastPotatoes.setChecked(getSharedPreferences("RoastPotatoes", Context.MODE_PRIVATE).getBoolean("check_roastPotatoes", true));

        check_iceCream.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("IceCream", Context.MODE_PRIVATE).edit().putBoolean("check_iceCream", isChecked).commit();
            }
        });

        check_fishFillets.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("FishFillets", Context.MODE_PRIVATE).edit().putBoolean("check_fishFillets", isChecked).commit();
            }
        });

        check_pizza.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Pizza", Context.MODE_PRIVATE).edit().putBoolean("check_pizza", isChecked).commit();
            }
        });

        check_sausages.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Sausages", Context.MODE_PRIVATE).edit().putBoolean("check_sausages", isChecked).commit();
            }
        });

        check_fishFingers.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("FishFingers", Context.MODE_PRIVATE).edit().putBoolean("check_fishFingers", isChecked).commit();
            }
        });

        check_breadedChicken.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("BreadedChicken", Context.MODE_PRIVATE).edit().putBoolean("check_breadedChicken", isChecked).commit();
            }
        });

        check_burgers.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Burgers", Context.MODE_PRIVATE).edit().putBoolean("check_burgers", isChecked).commit();
            }
        });

        check_iceLollies.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("IceLollies", Context.MODE_PRIVATE).edit().putBoolean("check_iceLollies", isChecked).commit();
            }
        });

        check_yorkshirePuddings.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("YorkshirePuddings", Context.MODE_PRIVATE).edit().putBoolean("check_yorkshirePuddings", isChecked).commit();
            }
        });

        check_sweetCorn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("SweetCorn", Context.MODE_PRIVATE).edit().putBoolean("check_sweetCorn", isChecked).commit();
            }
        });

        check_roastPotatoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("RoastPotatoes", Context.MODE_PRIVATE).edit().putBoolean("check_roastPotatoes", isChecked).commit();
            }
        });


    }
}