package com.matias.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class registro extends AppCompatActivity {

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

    }
    public void regresar(View view)
    {
        Intent boton = new Intent(registro.this, MainActivity.class);
        startActivity(boton);

    }

    public void validar(View view) {
        String no = nombre.getText().toString();
        String emai = email.getText().toString();
        String pas = pass.getText().toString();
        String passr = pass2.getText().toString();
        boolean hombre1 = hombre.isChecked();
        boolean femenino1 = femenino.isChecked();
        boolean  talca1 = talca.isChecked();
        boolean curico1 = curico.isChecked();
        if (femenino1 == false) {

            Toast.makeText(getApplicationContext(), "seleccione una casilla", Toast.LENGTH_LONG).show();

            if (femenino1 == true) {

                Log.i("sexo:", femenino.getText().toString());

            } else {

                Log.i("sexo:", hombre.getText().toString());

            }
        }

        if (talca1 == false) {

            Toast.makeText(getApplicationContext(), "seleccione una casilla", Toast.LENGTH_LONG).show();

            if (talca1 == true) {

                Log.i("ciudad:", talca.getText().toString());

            } else {

                Log.i("ciudad:", curico.getText().toString());

            }
        }
        if (no.isEmpty()){

            Toast.makeText(getApplicationContext(), "ingrese un nombre", Toast.LENGTH_LONG).show();
        }
        else   {

            Log.i("nombre:", nombre.getText().toString());
        }

        if (emai.isEmpty()) {

            Toast.makeText(getApplicationContext(), "ingrese un email", Toast.LENGTH_LONG).show();
        }
        else{
            Log.i("email:", email.getText().toString());

        }

        if (pas.isEmpty()){

            Toast.makeText(getApplicationContext(), "ingrese una contraseña", Toast.LENGTH_LONG).show();
        }

        else{

            Log.i("contraseña:", pass.getText().toString());
        }

        if (passr.isEmpty()){

            Toast.makeText(getApplicationContext(), "ingrese la repeticion de la contraseña ", Toast.LENGTH_LONG).show();
        }

        else{


            Log.i("repetir contraseña:", pass2.getText().toString());


        }




    }


}







