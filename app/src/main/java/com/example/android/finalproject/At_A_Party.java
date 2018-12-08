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



public class At_A_Party extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at__a__party);

        Button insertButtonName1 = (Button) findViewById(R.id.partycocktailhome);
        insertButtonName1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT)
                        .show();
                goToInsertNameOfNextClass1();
            }
        });

        Button insertButtonName2 = (Button) findViewById(R.id.partybeerhome);
        insertButtonName2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT)
                        .show();
                goToInsertNameOfNextClass2();
            }
        });

        Button insertButtonName3 = (Button) findViewById(R.id.collegespirits);
        insertButtonName3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It just works!", Toast.LENGTH_SHORT)
                        .show();
                goToInsertNameOfNextClass3();
            }
        });
    }
    private void goToInsertNameOfNextClass1() {
        Intent intent = new Intent(this, Party_cocktail.class);
        startActivity(intent);
    }
    private void goToInsertNameOfNextClass2() {
        Intent intent = new Intent(this, Party_beer.class);
        startActivity(intent);
    }
    private void goToInsertNameOfNextClass3() {
        Intent intent = new Intent(this, Party_spirit.class);
        startActivity(intent);
    }
}
