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

public class Buzzed_spirit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buzzed_spirit);

        Button goHome = (Button) findViewById(R.id.buzzedspirits);
        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotomaindashboard();
            }
        });
    }
    private void gotomaindashboard() {
        Intent intent = new Intent(this, Main_dashboard.class);
        startActivity(intent);
    }
}
