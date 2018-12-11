package com.example.android.finalproject;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
//import android.support.v7.app.ActionBar;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.TextView;

public class College_at_party extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_at_party);

        Button cbeer = (Button) findViewById(R.id.collegebeer);
        cbeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCbeer();
            }
        });

        Button ccocktail = (Button) findViewById(R.id.collegecocktail);
        ccocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCcocktail();
            }
        });

        Button cspirits = (Button) findViewById(R.id.collegespirits);
        cspirits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCspirits();
            }
        });
    }
    private void gotoCbeer() {
        Intent intent = new Intent(this, college_beer.class);
        startActivity(intent);
    }
    private void gotoCcocktail() {
        Intent intent = new Intent(this, college_cocktail.class);
        startActivity(intent);
    }
    private void gotoCspirits() {
        Intent intent = new Intent(this, college_spirit.class);
        startActivity(intent);
    }
}
