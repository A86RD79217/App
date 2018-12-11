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

public class Disclaimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);

        Button continue1 = (Button) findViewById(R.id.continue123456789);
        continue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMainDash();
            }
        });
    }
    private void goMainDash() {
        Intent intent = new Intent(this, Main_dashboard.class);
        startActivity(intent);
    }

}
