package com.example.lenovo.cuenta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {

    private EditText txtConsulta;
    private Cuenta cuenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        iniciar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtConsulta.setText("Usted tiene en su cuenta un saldo de = "+cuenta.getSaldo());

    }
    private void iniciar(){
        MainActivity mai=new MainActivity();
        txtConsulta = (EditText)findViewById(R.id.txtConsulta2);
        cuenta = mai.getCuenta();
    }

}
