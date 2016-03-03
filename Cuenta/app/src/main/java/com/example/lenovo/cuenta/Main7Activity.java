package com.example.lenovo.cuenta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {

    private ArrayList<Cuenta> cuentas;
    private Button btnTransferir;
    private EditText txtCuenta;
    private EditText txtSaldo;
    private Cuenta cuenta1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main72);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        iniciar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        for(Cuenta cuenta:cuentas){
            if(cuenta.getId().equals(txtCuenta.getText().toString())){
                if (txtSaldo.getText().toString() != ""){
                    try {
                        cuenta1.transferencia(cuenta1,cuenta,Double.parseDouble(txtSaldo.getText().toString()));
                        Toast.makeText(getApplicationContext(), "La transaccion se efectuo con exito", Toast.LENGTH_SHORT);
                    }catch (ArithmeticException e){
                        Toast.makeText(getApplicationContext(),"Solo ingrese numeros",Toast.LENGTH_SHORT);
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Debe ingresar un valor",Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(getApplicationContext(),"El numero de cuenta no existe",Toast.LENGTH_SHORT).show();
            }
        }


    }
    private void iniciar(){
        MainActivity mai = new MainActivity();
        btnTransferir=(Button)findViewById(R.id.btnTransferencia2);
        txtCuenta=(EditText)findViewById(R.id.txtNumeroTrans);
        txtSaldo=(EditText)findViewById(R.id.txtSaldoTransferenca);
        cuenta1 = mai.getCuenta();
        cuentas = mai.getCuentas();
    }

}
