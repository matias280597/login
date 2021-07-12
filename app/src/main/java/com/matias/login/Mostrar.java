package com.matias.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Mostrar extends AppCompatActivity {
    Button btn_volver;
    ListView Listado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        btn_volver = (Button)findViewById((R.id.button7));
        Listado = (ListView)findViewById(R.id.LV);

        ArrayList<String> registro = new ArrayList<String>();
        ArrayList <Integer> registro_pk = new ArrayList<Integer>();


        SQLiteDatabase db;
        DbHelper Conn = new DbHelper(Listado.getContext());
        db=Conn.getWritableDatabase();
        Cursor C = db.query("registro", null,null,null,null,null,null);
        if (C!=null)
        {
            if (C.moveToFirst())
            {
                do{
                    registro_pk.add(C.getInt(0));
                    String Informacion = C.getString(1)+ " - "+C.getString(2)+ " - "+C.getString(3)
                            + " - "+C.getString(4)+ " - "+C.getString(5)+ " - "+C.getString(6);
                    registro.add(Informacion);
                }
                while (C.moveToNext());

            }
        }
        ArrayAdapter<String> Adaptador = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,registro);
        Listado.setAdapter(Adaptador);

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        Listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Item = Listado.getItemAtPosition(position).toString();

            }
        });


    }
}