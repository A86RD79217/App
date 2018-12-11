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

public class Slightly_Buzzed extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slightly__buzzed);

        Button beer = (Button) findViewById(R.id.collegebeer);
        beer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSlightBuzzBeer();
            }
        });

        Button cocktail = (Button) findViewById(R.id.SBcocktail);
        cocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSlightBuzzCocktail();
            }
        });
    }
    private void goToSlightBuzzBeer() {
        Intent intent = new Intent(this, Slightbuzz_beer.class);
        startActivity(intent);
    }
    private void goToSlightBuzzCocktail() {
        Intent intent = new Intent(this, Slightbuzz_cocktail.class);
        startActivity(intent);
    }
}
