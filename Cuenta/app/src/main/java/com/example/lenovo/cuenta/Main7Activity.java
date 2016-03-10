package com.example.lenovo.cuenta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

        btnTransferir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(Cuenta cuenta:cuentas){
                    if(cuenta.getId().equals(txtCuenta.getText().toString())){
                        if (txtSaldo.getText().toString() != ""){
                            try {
                                cuenta1.transferencia(cuenta1,cuenta,Double.parseDouble(txtSaldo.getText().toString()));
                                Toast.makeText(getApplicationContext(), "La transaccion se efectuo con exito", Toast.LENGTH_SHORT).show();
                            }catch (ArithmeticException e){
                                Toast.makeText(getApplicationContext(),"Solo ingrese numeros",Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(getApplicationContext(),"Debe ingresar un valor",Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                finish();
            }

        });



    }
    private void iniciar(){
        cuenta1=(Cuenta)getIntent().getSerializableExtra("cuenta");
        btnTransferir=(Button)findViewById(R.id.btnTransferencia2);
        txtCuenta=(EditText)findViewById(R.id.txtNumeroTrans);
        txtSaldo=(EditText)findViewById(R.id.txtSaldoTransferenca);
        MainActivity mai = new MainActivity();
        cuentas= mai.getCuentas();
    }
}
