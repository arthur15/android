package com.example.carlosgonzalez.aprendiendo;

//import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int num1 = 0;
    public static final String KEY = "KEY";

    EditText etNombre;
    EditText etdireccion;
    EditText ettelefono;
    EditText etcumple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre = findViewById(R.id.nombre);
        etdireccion = findViewById(R.id.direccion);
        ettelefono = findViewById(R.id.tel);
        etcumple = findViewById(R.id.cumple);
        Button add = findViewById(R.id.agregar);
        Button view = findViewById(R.id.mostrar);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = etNombre.getText().toString();
                String dire = etdireccion.getText().toString();
                String tel = ettelefono.getText().toString();
                String cumple = etcumple.getText().toString();

                ContactModel contact = new ContactModel();
                contact.setNombre(etNombre.getText().toString());
                if (!contact.getNombre().equals("") && !dire.equals("") && !cumple.equals("")) {
                    cleanEditTexts();
                    Funciones.insertContacto(MainActivity.this, nombre, dire, tel, cumple);
                    Toast.makeText(MainActivity.this, "Muy bien, PUTO!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Captura bien, PUTO!", Toast.LENGTH_SHORT).show();
                }


            }
        });

        view.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view1) {
                                       Toast.makeText(MainActivity.this, "its ok", Toast.LENGTH_SHORT).show();
                                   }

                               }
        );
        /*if (savedInstanceState != null) {
            num1 = savedInstanceState.getInt(KEY_NUM_1, 0);
        }*/
    }


    public void cleanEditTexts() {
        etNombre.setText("");
        etdireccion.setText("");
        ettelefono.setText("");
        etcumple.setText("");
    }
   /* @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_NUM_1, num1);
    }*/
}
