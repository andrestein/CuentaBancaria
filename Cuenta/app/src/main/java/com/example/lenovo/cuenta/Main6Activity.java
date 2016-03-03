package com.example.lenovo.cuenta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    private Cuenta cueta;
    private Button btnCambiarClave;
    private EditText txtCambioClave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        inicar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnCambiarClave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtCambioClave.getText().toString() != "") {
                    cueta.setClave(txtCambioClave.getText().toString());
                    Toast.makeText(getApplicationContext(), "El cambio se efectuo con exito", Toast.LENGTH_SHORT);
                }else{
                    Toast.makeText(getApplicationContext(),"Debe ingresar la contraseña",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void inicar(){
        MainActivity mai= new MainActivity();
        cueta = mai.getCuenta();
        btnCambiarClave = (Button) findViewById(R.id.btnCambioClave2);
        txtCambioClave = (EditText) findViewById(R.id.txtCambioClave);
    }

}
