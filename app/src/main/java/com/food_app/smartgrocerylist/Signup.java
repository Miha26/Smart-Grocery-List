package com.food_app.smartgrocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.food_app.smartgrocerylist.databinding.ActivitySignupBinding;

public class Signup extends AppCompatActivity {

    ActivitySignupBinding binding;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        binding.singupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.singupEmail.getText().toString();
                String password = binding.singupPassword.getText().toString();
                String confirmPassword = binding.singupConfirm.getText().toString();

                if(email.equals("") || password.equals("") || confirmPassword.equals(""))
                    Toast.makeText(Signup.this,"All fields are mandatory!",Toast.LENGTH_SHORT).show();
                else
                {
                    if(password.equals(confirmPassword))
                    {
                        Boolean checkUserEmail =  databaseHelper.checkEmail(email);

                        if(checkUserEmail == false)
                        {
                            Boolean insert = databaseHelper.insertData(email, password);

                            if(insert == true)
                            {
                                Toast.makeText(Signup.this,"Signup Successfull!",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent (getApplicationContext(), Login.class);
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(Signup.this,"Signup Failed!",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(Signup.this,"User already exists! Please login!",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(Signup.this,"Invalid Password!",Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });
        binding.loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Login.class);
                startActivity(intent);

            }
        });
    }
}