package com.example.bibliotecaut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //pasar al segundo activity:
    public void Siguiente(View view){
        Intent siguiente=new Intent(this, SegundoActivity.class);
        startActivity(siguiente);

    }
}
//Aplicacón en donde el primer intent con un diseño de bienvenida y un botón, hasta que se le de click nos
//mandará a otro intent.