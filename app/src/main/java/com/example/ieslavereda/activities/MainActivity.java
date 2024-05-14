package com.example.ieslavereda.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;

import com.example.ieslavereda.base.BaseActivity;
import com.example.myweatherbase.R;

public class MainActivity extends BaseActivity {

    private EditText usuario;
    private EditText contrasenya;
    private Button iniciarSesion;
    private Button crearCuenta;
    private Button reiniciarContrasenya;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
        usuario = findViewById(R.id.editTextUsuario);
        contrasenya = findViewById(R.id.editTextContrasenya);
        iniciarSesion = findViewById(R.id.buttonIniciarSesion);
        crearCuenta = findViewById(R.id.buttonCrearCuenta);
        reiniciarContrasenya = findViewById(R.id.buttonReiniciarContrasenya);


    }

    public void CrearCuenta() {
        Intent intent = new Intent(this, CrearCuentaActivity.class);
        ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
                    if (result.getResultCode() == RESULT_OK) {

                    } else {

                    }
                });
        resultLauncher.launch(intent);
    }

    public void IniciarSesion() {
        // if (credenciales correctos) { iniciar PeliculasActivity }

    }

    public void ReiniciarContrasenya() {
        Intent intent = new Intent(this, ReiniciarContrasenyaActivity.class);
        // intent.putExtra("Usuario", nombreUsuario);
        // intent.putExtra("Contraseña", contraseña);
        ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == RESULT_OK) {
                //Cambiar contraseña del usuario a la introducida
            } else {
                Toast.makeText(this, "Cambio de contraseña cancelado", Toast.LENGTH_SHORT).show();
            }
        });
        resultLauncher.launch(intent);
    }

}