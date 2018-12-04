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

        Button insertButtonName = (Button) findViewById(R.id.insertIDofButton);
        startPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        Button insertButtonName = (Button) findViewById(R.id.insertIDofButton);
        startPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        Button insertButtonName = (Button) findViewById(R.id.insertIDofButton);
        startPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
