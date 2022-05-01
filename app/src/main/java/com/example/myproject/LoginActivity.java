package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

public class LoginActivity extends AppCompatActivity {
    private Toolbar toolbar;
   private EditText edtUsername, edtPassword;

    private AppCompatButton btnLogin, btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        initToolbar();
        findViews();

    }

    private void findViews() {
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignUp = findViewById(R.id.btnSignup);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (error()) {
                    Intent intent1 = new Intent(LoginActivity.this, DashboardActivity.class);
                    startActivity(intent1);

                }
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(LoginActivity.this, SignupActivity.class );
                startActivity(intent2);
            }
        });

    }



    private boolean error(){
        if(edtUsername.getText().toString().isEmpty())
        {
            Toast.makeText(LoginActivity.this, "Please Provide your Username.", Toast.LENGTH_LONG).show();
            return false;
        }

        else if(edtPassword.getText().toString().isEmpty())
        {
            Toast.makeText(LoginActivity.this, "Please Provide your Password.", Toast.LENGTH_LONG).show();
            return false;
        }
        else{
            Toast.makeText(LoginActivity.this,"Login Successful.", Toast.LENGTH_SHORT).show();
        }

        return true;
    }




    private void initToolbar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Ishan's App");
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

    }
}
