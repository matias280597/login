package com.matias.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public static String nombre_bd="covid.db";
    public static int version_bd=1;

    public static String tabla_registro=" create table registro (id_registro integer primary key autoincrement," +
            "nombre text, sexo text, ciudad text, correo text, clave text, claver text )";
    public DbHelper(@Nullable Context context) {
        super(context, nombre_bd, null , version_bd );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla_registro);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists panoramas ");
        db.execSQL(tabla_registro);
    }
}
