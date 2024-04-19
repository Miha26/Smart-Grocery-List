package com.food_app.smartgrocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;

import android.widget.CompoundButton;
public class Vegetables extends AppCompatActivity {

   private CheckBox check_ginger, check_cabbage, check_eggplant, check_carrot, check_courgette, check_broccoli, check_cauliflower, check_cucumber, check_lettuce, check_mushroom, check_onion, check_peas, check_pepper, check_hot_pepper, check_potato, check_pumpkin, check_tomato, check_radish, check_zucchini, check_brussels_sprouts, check_corn, check_sweet_potato, check_garlic;

    public static boolean isTomatoChecked;
    public static boolean isCucumberChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        check_ginger = (CheckBox) findViewById(R.id.ginger_check);
        check_cabbage = (CheckBox) findViewById(R.id.cabbage_check);
        check_eggplant = (CheckBox) findViewById(R.id.eggplant_check);
        check_carrot = (CheckBox) findViewById(R.id.carrot_check);
        check_courgette = (CheckBox) findViewById(R.id.courgette_check);
        check_broccoli = (CheckBox) findViewById(R.id.broccoli_check);
        check_cauliflower = (CheckBox) findViewById(R.id.cauliflower_check);
        check_cucumber = (CheckBox) findViewById(R.id.cucumber_check);
        check_lettuce = (CheckBox) findViewById(R.id.lettuce_check);
        check_mushroom = (CheckBox) findViewById(R.id.mushroom_check);
        check_onion = (CheckBox) findViewById(R.id.onion_check);
        check_peas = (CheckBox) findViewById(R.id.peas_check);
        check_pepper = (CheckBox) findViewById(R.id.pepper_check);
        check_hot_pepper = (CheckBox) findViewById(R.id.hot_pepper_check);
        check_potato = (CheckBox) findViewById(R.id.potato_check);
        check_pumpkin = (CheckBox) findViewById(R.id.pumpkin_check);
        check_tomato = (CheckBox) findViewById(R.id.tomato_check);
        check_radish = (CheckBox) findViewById(R.id.radish_check);
        check_zucchini = (CheckBox) findViewById(R.id.zucchini_check);
        check_brussels_sprouts = (CheckBox) findViewById(R.id.brussels_sprouts_check);
        check_corn = (CheckBox) findViewById(R.id.corn_check);
        check_sweet_potato = (CheckBox) findViewById(R.id.sweet_potato_check);
        check_garlic = (CheckBox) findViewById(R.id.garlic_check);

        check_ginger.setChecked(getSharedPreferences("Ginger", Context.MODE_PRIVATE).getBoolean("check_ginger", true));
        check_cabbage.setChecked(getSharedPreferences("Cabbage", Context.MODE_PRIVATE).getBoolean("check_cabbage", true));
        check_eggplant.setChecked(getSharedPreferences("Eggplant", Context.MODE_PRIVATE).getBoolean("check_eggplant", true));
        check_carrot.setChecked(getSharedPreferences("Carrot", Context.MODE_PRIVATE).getBoolean("check_carrot", true));
        check_courgette.setChecked(getSharedPreferences("Courgette", Context.MODE_PRIVATE).getBoolean("check_courgette", true));
        check_broccoli.setChecked(getSharedPreferences("Broccoli", Context.MODE_PRIVATE).getBoolean("check_broccoli", true));
        check_cauliflower.setChecked(getSharedPreferences("Cauliflower", Context.MODE_PRIVATE).getBoolean("check_cauliflower", true));
        check_cucumber.setChecked(getSharedPreferences("Cucumber", Context.MODE_PRIVATE).getBoolean("check_cucumber", true));
        check_lettuce.setChecked(getSharedPreferences("Lettuce", Context.MODE_PRIVATE).getBoolean("check_lettuce", true));
        check_mushroom.setChecked(getSharedPreferences("Mushroom", Context.MODE_PRIVATE).getBoolean("check_mushroom", true));
        check_onion.setChecked(getSharedPreferences("Onion", Context.MODE_PRIVATE).getBoolean("check_onion", true));
        check_peas.setChecked(getSharedPreferences("Peas", Context.MODE_PRIVATE).getBoolean("check_peas", true));
        check_pepper.setChecked(getSharedPreferences("Pepper", Context.MODE_PRIVATE).getBoolean("check_pepper", true));
        check_hot_pepper.setChecked(getSharedPreferences("Hot Pepper", Context.MODE_PRIVATE).getBoolean("check_hot_pepper", true));
        check_potato.setChecked(getSharedPreferences("Potato", Context.MODE_PRIVATE).getBoolean("check_potato", true));
        check_pumpkin.setChecked(getSharedPreferences("Pumpkin", Context.MODE_PRIVATE).getBoolean("check_pumpkin", true));
        check_tomato.setChecked(getSharedPreferences("Tomato", Context.MODE_PRIVATE).getBoolean("check_tomato", true));
        check_lettuce.setChecked(getSharedPreferences("Lettuce", Context.MODE_PRIVATE).getBoolean("check_lettuce", true));
        check_radish.setChecked(getSharedPreferences("Radish", Context.MODE_PRIVATE).getBoolean("check_radish", true));
        check_zucchini.setChecked(getSharedPreferences("Zucchini", Context.MODE_PRIVATE).getBoolean("check_zucchini", true));
        check_brussels_sprouts.setChecked(getSharedPreferences("Brussels Sprouts", Context.MODE_PRIVATE).getBoolean("check_brussels_sprouts", true));
        check_corn.setChecked(getSharedPreferences("Corn", Context.MODE_PRIVATE).getBoolean("check_corn", true));
        check_sweet_potato.setChecked(getSharedPreferences("Sweet Potato", Context.MODE_PRIVATE).getBoolean("check_sweet_potato", true));
        check_garlic.setChecked(getSharedPreferences("Garlic", Context.MODE_PRIVATE).getBoolean("check_garlic", true));

        check_ginger.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Ginger", Context.MODE_PRIVATE).edit().putBoolean("check_ginger", isChecked).commit();
            }
        });

        check_cabbage.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Cabbage", Context.MODE_PRIVATE).edit().putBoolean("check_cabbage", isChecked).commit();
            }
        });

        check_eggplant.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Eggplant", Context.MODE_PRIVATE).edit().putBoolean("check_eggplant", isChecked).commit();
            }
        });

        check_carrot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Carrot", Context.MODE_PRIVATE).edit().putBoolean("check_carrot", isChecked).commit();
            }
        });

        check_courgette.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Courgette", Context.MODE_PRIVATE).edit().putBoolean("check_courgette", isChecked).commit();
            }
        });

        check_broccoli.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Broccoli", Context.MODE_PRIVATE).edit().putBoolean("check_broccoli", isChecked).commit();
            }
        });

        check_cauliflower.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Cauliflower", Context.MODE_PRIVATE).edit().putBoolean("check_cauliflower", isChecked).commit();
            }
        });

        check_cucumber.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Cucumber", Context.MODE_PRIVATE).edit().putBoolean("check_cucumber", isChecked).commit();

                isCucumberChecked=isChecked;
                Intent intent = new Intent(Vegetables.this, Groceries.class);
                CheckBox checkBox = findViewById(R.id.cucumber_check);
                boolean isGood = checkBox.isChecked();
                intent.putExtra("checkCucumber", isGood);
                startActivity(intent);
            }
        });

        check_lettuce.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Lettuce", Context.MODE_PRIVATE).edit().putBoolean("check_lettuce", isChecked).commit();
            }
        });

        check_mushroom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Mushroom", Context.MODE_PRIVATE).edit().putBoolean("check_mushroom", isChecked).commit();
            }
        });

        check_onion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Onion", Context.MODE_PRIVATE).edit().putBoolean("check_onion", isChecked).commit();
            }
        });

        check_peas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Peas", Context.MODE_PRIVATE).edit().putBoolean("check_peas", isChecked).commit();
            }
        });

        check_pepper.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Pepper", Context.MODE_PRIVATE).edit().putBoolean("check_pepper", isChecked).commit();
            }
        });

        check_hot_pepper.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Hot Pepper", Context.MODE_PRIVATE).edit().putBoolean("check_hot_pepper", isChecked).commit();
            }
        });

        check_potato.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Potato", Context.MODE_PRIVATE).edit().putBoolean("check_potato", isChecked).commit();
            }
        });

        check_pumpkin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Pumpkin", Context.MODE_PRIVATE).edit().putBoolean("check_pumpkin", isChecked).commit();
            }
        });

        check_tomato.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Tomato", Context.MODE_PRIVATE).edit().putBoolean("check_tomato", isChecked).commit();

                isTomatoChecked=isChecked;
                Intent intent = new Intent(Vegetables.this, Groceries.class);
                CheckBox checkBox = findViewById(R.id.tomato_check);
                boolean isGood = checkBox.isChecked();
                intent.putExtra("checkTomato", isGood);
                startActivity(intent);
            }
        });

        check_lettuce.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Lettuce", Context.MODE_PRIVATE).edit().putBoolean("check_lettuce", isChecked).commit();
            }
        });

        check_radish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Radish", Context.MODE_PRIVATE).edit().putBoolean("check_radish", isChecked).commit();
            }
        });

        check_zucchini.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Zucchini", Context.MODE_PRIVATE).edit().putBoolean("check_zucchini", isChecked).commit();
            }
        });

        check_brussels_sprouts.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Brussels Sprouts", Context.MODE_PRIVATE).edit().putBoolean("check_brussels_sprouts", isChecked).commit();
            }
        });

        check_corn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Corn", Context.MODE_PRIVATE).edit().putBoolean("check_corn", isChecked).commit();
            }
        });

        check_sweet_potato.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Sweet Potato", Context.MODE_PRIVATE).edit().putBoolean("check_sweet_potato", isChecked).commit();

                Intent intent = new Intent(Vegetables.this, Groceries.class);
                CheckBox checkBox = findViewById(R.id.sweet_potato_check);
                boolean isGood = checkBox.isChecked();
                intent.putExtra("checkSweetPotato", isGood);
                startActivity(intent);
            }
        });

        check_garlic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Garlic", Context.MODE_PRIVATE).edit().putBoolean("check_garlic", isChecked).commit();
            }
        });




    }
}