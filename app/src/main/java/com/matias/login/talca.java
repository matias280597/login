package com.matias.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class talca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talca);


        WebView myWebView =(WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://www.recorrido.cl/es/bus/talca-paris-y-londres-pasajes?gclid=Cj0KCQjwktKFBhCkARIsAJeDT0gQdlD5LzBIy_jilKUMdjjO0yyrFfnxwyIJoQp817Pfei2DWzVwoJsaAgrAEALw_wcB");

    }
}