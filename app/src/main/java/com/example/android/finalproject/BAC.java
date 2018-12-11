package com.example.android.finalproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
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
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class BAC extends AppCompatActivity {

    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bac);

        webView = (WebView) findViewById(R.id.BAC);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.alcoholhelpcenter.net/program/bac_standalone.aspx");
    }
}

