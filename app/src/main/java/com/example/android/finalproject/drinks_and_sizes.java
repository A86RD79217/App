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

public class drinks_and_sizes extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_and_sizes);

        Button ageConfirm = (Button) findViewById(R.id.ageconfirm);
        ageConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMainDashboard();
            }
        });

        Button ageDeny = (Button) findViewById(R.id.agedeny);
        ageDeny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitApp();
            }
        });
    }
    private void goToMainDashboard() {
        Intent intent = new Intent(this, Disclaimer.class);
        startActivity(intent);
    }
    private void exitApp() {
        finishAffinity(); //technically not correct but it sorta works so ill just leave this for now
        System.exit(0);
    }
}
