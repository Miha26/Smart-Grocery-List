package com.food_app.smartgrocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Pasta_Rice_Cereal extends AppCompatActivity {

    private boolean isCheckedValue;
    private CheckBox check_fettuccine, check_angelHairPasta, check_macaroni, check_fusilli, check_bowTies, check_penne, check_basmatiRice, check_japaneseShortGrainRice, check_sushiRice, check_japaneseGlutinousRice, check_wheat, check_rye, check_sorghum, check_rice, check_oats, check_maize, check_barley, check_millet, check_quinoa, check_corn;

    public static boolean isFusilliChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta_rice_cereal);



        check_fettuccine = (CheckBox) findViewById(R.id.fettuccine_check);
        check_angelHairPasta = (CheckBox) findViewById(R.id.angelhair_check);
        check_macaroni = (CheckBox) findViewById(R.id.macaroni_check);
        check_fusilli = (CheckBox) findViewById(R.id.fusilli_check);
        check_bowTies = (CheckBox) findViewById(R.id.bowties_check);
        check_penne = (CheckBox) findViewById(R.id.penne_check);
        check_basmatiRice = (CheckBox) findViewById(R.id.basmati_check);
        check_japaneseShortGrainRice = (CheckBox) findViewById(R.id.shortgrain_check);
        check_sushiRice = (CheckBox) findViewById(R.id.sushi_check);
        check_japaneseGlutinousRice = (CheckBox) findViewById(R.id.glutinous_check);
        check_wheat = (CheckBox) findViewById(R.id.wheat_check);
        check_rye = (CheckBox) findViewById(R.id.rye_check);
        check_sorghum = (CheckBox) findViewById(R.id.sorghum_check);
        check_rice = (CheckBox) findViewById(R.id.rice_check);
        check_oats = (CheckBox) findViewById(R.id.oats_check);
        check_maize = (CheckBox) findViewById(R.id.maize_check);
        check_barley = (CheckBox) findViewById(R.id.barley_check);
        check_millet = (CheckBox) findViewById(R.id.millet_check);
        check_quinoa = (CheckBox) findViewById(R.id.quinoa_check);
        check_corn = (CheckBox) findViewById(R.id.corn_check);

        check_fettuccine.setChecked(getSharedPreferences("Fettuccine", Context.MODE_PRIVATE).getBoolean("check_fettuccine", true));
        check_angelHairPasta.setChecked(getSharedPreferences("AngelHairPasta", Context.MODE_PRIVATE).getBoolean("check_angel_hair_pasta", true));
        check_macaroni.setChecked(getSharedPreferences("Macaroni", Context.MODE_PRIVATE).getBoolean("check_macaroni", true));
        check_fusilli.setChecked(getSharedPreferences("Fusilli", Context.MODE_PRIVATE).getBoolean("check_fusilli", true));
        check_bowTies.setChecked(getSharedPreferences("BowTies", Context.MODE_PRIVATE).getBoolean("check_bow_ties", true));
        check_penne.setChecked(getSharedPreferences("Penne", Context.MODE_PRIVATE).getBoolean("check_penne", true));
        check_basmatiRice.setChecked(getSharedPreferences("BasmatiRice", Context.MODE_PRIVATE).getBoolean("check_basmati_rice", true));
        check_japaneseShortGrainRice.setChecked(getSharedPreferences("JapaneseShortGrainRice", Context.MODE_PRIVATE).getBoolean("check_japanese_short_grain_rice", true));
        check_sushiRice.setChecked(getSharedPreferences("SushiRice", Context.MODE_PRIVATE).getBoolean("check_sushi_rice", true));
        check_japaneseGlutinousRice.setChecked(getSharedPreferences("JapaneseGlutinousRice", Context.MODE_PRIVATE).getBoolean("check_japanese_glutinous_rice", true));
        check_wheat.setChecked(getSharedPreferences("Wheat", Context.MODE_PRIVATE).getBoolean("check_wheat", true));
        check_rye.setChecked(getSharedPreferences("Rye", Context.MODE_PRIVATE).getBoolean("check_rye", true));
        check_sorghum.setChecked(getSharedPreferences("Sorghum", Context.MODE_PRIVATE).getBoolean("check_sorghum", true));
        check_rice.setChecked(getSharedPreferences("Rice", Context.MODE_PRIVATE).getBoolean("check_rice", true));
        check_oats.setChecked(getSharedPreferences("Oats", Context.MODE_PRIVATE).getBoolean("check_oats", true));
        check_maize.setChecked(getSharedPreferences("Maize", Context.MODE_PRIVATE).getBoolean("check_maize", true));
        check_barley.setChecked(getSharedPreferences("Barley", Context.MODE_PRIVATE).getBoolean("check_barley", true));
        check_millet.setChecked(getSharedPreferences("Millet", Context.MODE_PRIVATE).getBoolean("check_millet", true));
        check_quinoa.setChecked(getSharedPreferences("Quinoa", Context.MODE_PRIVATE).getBoolean("check_quinoa", true));
        check_corn.setChecked(getSharedPreferences("Corn", Context.MODE_PRIVATE).getBoolean("check_corn", true));
        //// end of this  task





        //check if the check box is checked
        check_fettuccine.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Fettuccine", Context.MODE_PRIVATE).edit().putBoolean("check_fettuccine", isChecked).apply();
            }
        });

        check_angelHairPasta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("AngelHairPasta", Context.MODE_PRIVATE).edit().putBoolean("check_angel_hair_pasta", isChecked).apply();
            }
        });

        check_macaroni.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Macaroni", Context.MODE_PRIVATE).edit().putBoolean("check_macaroni", isChecked).apply();
            }
        });

        check_fusilli.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                 getSharedPreferences("Fusilli", Context.MODE_PRIVATE).edit().putBoolean("check_fusilli", isChecked).apply();


                isFusilliChecked=isChecked;
                Intent intent = new Intent(Pasta_Rice_Cereal.this, Groceries.class);
                CheckBox checkBox = findViewById(R.id.fusilli_check);
                boolean isGood = checkBox.isChecked();
                intent.putExtra("checkFusilli", isGood);
                startActivity(intent);
            }
        });

        check_bowTies.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("BowTies", Context.MODE_PRIVATE).edit().putBoolean("check_bow_ties", isChecked).apply();
            }
        });

        check_penne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Penne", Context.MODE_PRIVATE).edit().putBoolean("check_penne", isChecked).apply();
            }
        });

        check_basmatiRice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("BasmatiRice", Context.MODE_PRIVATE).edit().putBoolean("check_basmati_rice", isChecked).apply();
            }
        });

        check_japaneseShortGrainRice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("JapaneseShortGrainRice", Context.MODE_PRIVATE).edit().putBoolean("check_japanese_short_grain_rice", isChecked).apply();
            }
        });

        check_sushiRice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("SushiRice", Context.MODE_PRIVATE).edit().putBoolean("check_sushi_rice", isChecked).apply();
            }
        });

        check_japaneseGlutinousRice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("JapaneseGlutinousRice", Context.MODE_PRIVATE).edit().putBoolean("check_japanese_glutinous_rice", isChecked).apply();
            }
        });

        check_wheat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Wheat", Context.MODE_PRIVATE).edit().putBoolean("check_wheat", isChecked).apply();
            }
        });

        check_rye.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Rye", Context.MODE_PRIVATE).edit().putBoolean("check_rye", isChecked).apply();
            }
        });

        check_sorghum.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Sorghum", Context.MODE_PRIVATE).edit().putBoolean("check_sorghum", isChecked).apply();
            }
        });

        check_rice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Rice", Context.MODE_PRIVATE).edit().putBoolean("check_rice", isChecked).apply();
            }
        });

        check_oats.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Oats", Context.MODE_PRIVATE).edit().putBoolean("check_oats", isChecked).apply();
            }
        });

        check_maize.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Maize", Context.MODE_PRIVATE).edit().putBoolean("check_maize", isChecked).apply();
            }
        });

        check_barley.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Barley", Context.MODE_PRIVATE).edit().putBoolean("check_barley", isChecked).apply();
            }
        });

        check_millet.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Millet", Context.MODE_PRIVATE).edit().putBoolean("check_millet", isChecked).apply();
            }
        });

        check_quinoa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Quinoa", Context.MODE_PRIVATE).edit().putBoolean("check_quinoa", isChecked).apply();
            }
        });

        check_corn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getSharedPreferences("Corn", Context.MODE_PRIVATE).edit().putBoolean("check_corn", isChecked).apply();
            }
        });


            }



}