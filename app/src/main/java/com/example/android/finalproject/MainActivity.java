package com.example.android.finalproject;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.onClickListener() {
        @Override
        public void onClick(View v) {
            goTodrinks_and_sizes();
        }
    });
    private void goTodrinks_and_sizes() {

        Intent intent = new Intent(this, drinks_and_sizes.class);

        startActivity(intent);

    }
}
