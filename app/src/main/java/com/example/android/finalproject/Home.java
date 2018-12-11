package com.example.android.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button goToBAC = (Button) findViewById(R.id.BAC);
        goToBAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchBAC();
            }
        });
    }
    private void launchBAC() {
        Intent intent = new Intent(this, BAC.class);
        startActivity(intent);
    }
}
