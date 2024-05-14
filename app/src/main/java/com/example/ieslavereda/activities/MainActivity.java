package com.example.ieslavereda.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myweatherbase.R;

public class MainActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText contrasenya;
    private Button iniciarSesion;
    private Button crearCuenta;
    private Button reiniciarContrasenya;
    
    
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
        usuario = findViewById(R.id.editTextUsuario);
        contrasenya = findViewById(R.id.editTextContrasenya);
        iniciarSesion = findViewById(R.id.buttonIniciarSesion);
        crearCuenta = findViewById(R.id.buttonCrearCuenta);
        reiniciarContrasenya = findViewById(R.id.buttonReiniciarContrasenya);

        crearCuenta.setOnClickListener(view -> {

        });
    }
}