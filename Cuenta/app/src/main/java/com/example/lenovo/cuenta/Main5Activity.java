package com.example.lenovo.cuenta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {


    private Button btnConsultar;
    private Cuenta cuenta;
    private String mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        iniciar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mensaje="Usted tiene en su cuenta un saldo de = "+cuenta.getSaldo();

                Toast.makeText(getApplicationContext(), "Usted tiene en su cuenta un saldo de = " + cuenta.getSaldo(), Toast.LENGTH_SHORT).show();

                        finish();
            }

        });


    }

    private void iniciar(){
        btnConsultar=(Button)findViewById(R.id.btnConsulta);

        cuenta=(Cuenta)getIntent().getSerializableExtra("cuenta");
    }
}
