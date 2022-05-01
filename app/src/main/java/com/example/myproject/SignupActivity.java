package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText fName, lName, Email, Password,DOB,Address;
    private AppCompatButton btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initToolbar();
        findViews();
    }



    private void findViews() {
        fName = findViewById(R.id.fname);
        lName = findViewById(R.id.lname);
        DOB = findViewById(R.id.dob);
        Email = findViewById(R.id.email);
        Password = findViewById(R.id.password);
        Address = findViewById(R.id.address);

        btnSignup = findViewById(R.id.signup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (error()) {
                    Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                    startActivity(intent);

                }
            }
        });


    }



    private boolean error(){
        if(fName.getText().toString().isEmpty())
        {
            Toast.makeText(SignupActivity.this, "Please Provide your First Namme.", Toast.LENGTH_LONG).show();
            return false;
        }

        else if(lName.getText().toString().isEmpty())
        {
            Toast.makeText(SignupActivity.this, "Please Provide your Last Name.", Toast.LENGTH_LONG).show();
            return false;
        }

        else if(Email.getText().toString().isEmpty())
        {
            Toast.makeText(SignupActivity.this, "Please Provide your Email.", Toast.LENGTH_LONG).show();
            return false;
        }

        else if(Password.getText().toString().isEmpty())
        {
            Toast.makeText(SignupActivity.this, "Please Provide your Password.", Toast.LENGTH_LONG).show();
            return false;
        }
        else if(Address.getText().toString().isEmpty())
        {
            Toast.makeText(SignupActivity.this, "Please Provide your Address.", Toast.LENGTH_LONG).show();
            return false;
        }
        else{
            Toast.makeText(SignupActivity.this,"Login Successful.", Toast.LENGTH_SHORT).show();
        }

        return true;
    }



    private void initToolbar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Ishan's App- SignUp Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

    }
}