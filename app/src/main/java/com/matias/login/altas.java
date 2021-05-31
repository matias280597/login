package com.matias.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class altas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altas);




        WebView myWebView =(WebView) findViewById(R.id.webview1);
        myWebView.loadUrl("https://busesaltascumbres.cl");
    }
}