package com.example.myproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

public class CategoryActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        initToolbar();
        getSupportFragmentManager().beginTransaction().add(R.id.frmContainer, new DashboardFragment()).commit();

    }

    private void initToolbar(){
        toolbar=findViewById(R.id.toolbar);
        //getSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Bsc CSIT");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // toolbar.setNavigationIcon(R.drawable.ic_user);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

    }


    public boolean onOptionsItemsSelected(@NonNull MenuItem item){
        if(item.getItemId() == android.R.id.home)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, new HomeFragment()).commit();
        }

        return super.onOptionsItemSelected(item);

    }

}
