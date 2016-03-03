package com.example.lenovo.cuenta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    private Button btnRetirar;
    private Cuenta cuenta;
    private EditText txtRetirar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        iniciar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnRetirar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtRetirar.getText().toString() != ""){
                    try{
                        cuenta.retiro(Double.parseDouble(txtRetirar.getText().toString()));
                        Toast.makeText(getApplicationContext(), "El retiro se efectuo con exito", Toast.LENGTH_SHORT);
                    }catch (ArithmeticException e){
                        Toast.makeText(getApplicationContext(),"Solo ingrese numeros",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Debe ingresar un valor a retirar",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void iniciar(){
        MainActivity mai= new MainActivity();
        btnRetirar=(Button)findViewById(R.id.btnRetirar2);
        txtRetirar=(EditText)findViewById(R.id.txtRetirar);
        cuenta =  mai.getCuenta();
    }

}
