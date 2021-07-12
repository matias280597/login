package com.matias.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class registro extends AppCompatActivity {
    Button button;
     EditText nombre, email, pass, pass2;
     CheckBox talca, curico;
     RadioButton hombre, femenino ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = findViewById(R.id.nombrer);
        hombre = findViewById(R.id.masculino);
        femenino = findViewById(R.id.femenino);
        talca = findViewById(R.id.talca);
        curico = findViewById(R.id.curico);
        email = findViewById(R.id.correor);
        pass = findViewById(R.id.clave);
        pass2 = findViewById(R.id.claver);
        button =(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            Boolean hombre1 = hombre.isChecked();
            Boolean talca1 = talca.isChecked();
            @Override
            public void onClick(View v) {
                SQLiteDatabase db;
                DbHelper  Conn= new DbHelper(getApplicationContext());
                db = Conn.getWritableDatabase();
                ContentValues CV= new ContentValues();
                CV.put("nombre", nombre.getText().toString());
                if (hombre1 = true) {
                    CV.put("sexo", hombre.getText().toString());
                }
                else{
                    CV.put("sexo", femenino.getText().toString());
                }
                if (talca1 = true) {
                    CV.put("ciudad", talca.getText().toString());
                }
                else{
                    CV.put("ciudad", curico.getText().toString());
                }
                CV.put("correo", email.getText().toString());
                CV.put("clave", pass.getText().toString());
                CV.put("claver", pass2.getText().toString());
                db.insert("registro", null,CV);
                Toast.makeText(getApplicationContext(),"registro insertado",Toast.LENGTH_LONG).show();
            }
        });




    }
    public void mostrar(View view)
    {
        Intent boton = new Intent(registro.this, Mostrar.class);
        startActivity(boton);

    }

    public void regresar(View view)
    {
        Intent boton = new Intent(registro.this, MainActivity.class);
        startActivity(boton);

    }


}







