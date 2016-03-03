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
                int con=0;
                double consignacion;
                consignacion = Double.parseDouble(txtConsigar.getText().toString());
                if(txtConsigar.getText().toString() != ""){
                    try {
                        Toast.makeText(getApplicationContext(), "La consignacion se efectuo con exito", Toast.LENGTH_SHORT).show();
                        con++;
                    }catch (ArithmeticException e){
                        Toast.makeText(getApplicationContext(),"Solo se debe ingresar numeros", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Debe escribir el valor a consignar",Toast.LENGTH_SHORT).show();
                }
                if(con ==1){
                    cuenta.consignar(consignacion);
                }
            }
        });
    }

    private void iniciar(){
        MainActivity mai= new MainActivity();
        btnConsigar=(Button) findViewById(R.id.btnConsigar2);
        txtConsigar = (EditText) findViewById(R.id.txtConsignar);
        cuenta = mai.getCuenta();
    }

}
