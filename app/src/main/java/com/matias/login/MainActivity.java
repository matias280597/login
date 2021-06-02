package com.matias.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        boton = (Button) findViewById(R.id.botonr);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boton = new Intent(MainActivity.this, registro.class);
                startActivity(boton);
            }
        });

    }

        public void enviar (View view){

            EditText usuario = findViewById(R.id.usuariologin);
            EditText contraseña = findViewById(R.id.contraseñalogin);

            Log.i("usuario:", usuario.getText().toString());
            Log.i("contraseña:", contraseña.getText().toString());

        }

    public void ir (View view){

        Intent boton = new Intent(MainActivity.this, menu.class);
        startActivity(boton);


    }


}