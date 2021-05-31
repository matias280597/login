package com.matias.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
     public void altas(View view){

         Intent boton = new Intent(menu.this, altas.class);
         startActivity(boton);

     }


    public void talca(View view){

        Intent boton = new Intent(menu.this, talca.class);
        startActivity(boton);

    }
}