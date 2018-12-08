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

public class Buzzed_beer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buzzed_beer);

        Button buzzedBeer = (Button) findViewById(R.id.buzzedbeer);
        buzzedBeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT)
                        .show();
                goToMainDashboard();
            }
        });
    }
    private void goToMainDashboard() {
        Intent intent = new Intent(this, Main_dashboard.class);
        startActivity(intent);
    }
}
