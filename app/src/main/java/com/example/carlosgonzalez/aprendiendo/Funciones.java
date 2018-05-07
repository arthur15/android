package com.example.carlosgonzalez.aprendiendo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by
 * carlosgonzalez on 03/05/18.
 */

public class Funciones extends AppCompatActivity{
    public static void insertContacto(Context context, String nombre, String direccion, String telefono, String cumpleanos)
    {
        DataBase db = DataBase.getInstance(context);
        SQLiteDatabase dba = db.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("Nombre", nombre);
        cv.put("Direccion", direccion);
        cv.put("Telefono", telefono);
        cv.put("Cumpleanos", cumpleanos);
        dba.insert("",null, cv);
        db.close();
    }


}
