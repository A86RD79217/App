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

public class Main_dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);

        Button slightlyBuzzed = (Button) findViewById(R.id.slightlybuzzed);
        slightlyBuzzed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT).show();
                goToSlightlyBuzzed();
            }
        });

        Button buzzed = (Button) findViewById(R.id.buzzed);
        slightlyBuzzed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT).show();
                goToBuzzed();
            }
        });

        Button party = (Button) findViewById(R.id.party);
        slightlyBuzzed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT).show();
                goToParty();
            }
        });

        Button collegeparty = (Button) findViewById(R.id.college);
        slightlyBuzzed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT).show();
                goToCollege();
            }
        });

        Button gohome = (Button) findViewById(R.id.gohome);
        slightlyBuzzed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT).show();
                goToHome();
            }
        });
    }
    private void goToSlightlyBuzzed() {
        Intent intent = new Intent(this, Slightly_Buzzed.class);
        startActivity(intent);
    }
    private void goToBuzzed() {
        Intent intent = new Intent(this, Buzzed.class);
        startActivity(intent);
    }
    private void goToParty() {
        Intent intent = new Intent(this, At_A_Party.class);
        startActivity(intent);
    }
    private void goToCollege() {
        Intent intent = new Intent(this, College_at_party.class);
        startActivity(intent);
    }
    private void goToHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}