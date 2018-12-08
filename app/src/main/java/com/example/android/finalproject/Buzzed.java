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

public class Buzzed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buzzed);

        Button BZbeer = (Button) findViewById(R.id.BZbeer);
        BZbeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT)
                        .show();
                goToBZbeer();
            }
        });

        Button BZcocktail = (Button) findViewById(R.id.BZcocktail);
        BZcocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT)
                        .show();
                goToBZcocktail();
            }
        });

        Button BZspirits = (Button) findViewById(R.id.BZspirits);
        BZspirits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT)
                        .show();
                goToBZspirits();
            }
        });
    }
    private void goToBZbeer() {
        Intent intent = new Intent(this, Buzzed_beer.class);
        startActivity(intent);
    }
    private void goToBZcocktail() {
        Intent intent = new Intent(this, Buzzed_cocktail.class);
        startActivity(intent);
    }
    private void goToBZspirits() {
        Intent intent = new Intent(this, Buzzed_spirit.class);
        startActivity(intent);
    }
}
