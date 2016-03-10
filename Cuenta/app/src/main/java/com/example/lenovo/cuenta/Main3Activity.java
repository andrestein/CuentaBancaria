package com.example.lenovo.cuenta;

import  android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private Cuenta cuenta;
    private Button btnConsigar;
    private EditText txtConsigar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        iniciar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnConsigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double consignacion;
                consignacion = Double.parseDouble(txtConsigar.getText().toString());
                if (txtConsigar.getText().toString() != "") try {
                    Toast.makeText(getApplicationContext(), "La consignacion se efectuo con exito", Toast.LENGTH_SHORT).show();
                    cuenta.consignar(consignacion);
                } catch (ArithmeticException e) {
                    Toast.makeText(getApplicationContext(), "Solo se debe ingresar numeros", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Debe escribir el valor a consignar", Toast.LENGTH_SHORT).show();
                }
                finish();
            }
        });


    }

    private void iniciar(){
        btnConsigar=(Button) findViewById(R.id.btnConsigar2);
        txtConsigar = (EditText) findViewById(R.id.txtConsignar);
        cuenta=(Cuenta)getIntent().getSerializableExtra("cuenta");

    }
}
