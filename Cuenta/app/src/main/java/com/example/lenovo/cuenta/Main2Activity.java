package com.example.lenovo.cuenta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btnConsignaciones;
    private Button btnRetiros;
    private Button btnConsultas;
    private Button btnTrasnferencias;
    private Button btnCambioClave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        iniciar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnConsignaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent1);
            }
        });

        btnRetiros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(intent2);
            }
        });

        btnConsultas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(),Main5Activity.class);
                startActivity(intent3);
            }
        });

        btnCambioClave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(),Main6Activity.class);
                startActivity(intent4);
            }
        });

        btnTrasnferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getApplicationContext(),Main7Activity.class);
                startActivity(intent5);
            }
        });
    }
    //Casteo
    private void iniciar(){
        btnCambioClave = (Button) findViewById(R.id.btnCambioClave);
        btnConsignaciones = (Button) findViewById(R.id.btnConsignar);
        btnConsultas = (Button) findViewById(R.id.btnConsultas);
        btnRetiros = (Button) findViewById(R.id.btnRetiros);
        btnTrasnferencias = (Button) findViewById(R.id.btnTransferencia);
    }
}
