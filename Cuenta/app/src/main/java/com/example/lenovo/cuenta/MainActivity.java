package com.example.lenovo.cuenta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Cuenta>cuentas ;
    private Button btnIngresar;
    private EditText txtNumeroCuenta;
    private EditText txtClaveCuenta;
    private Cuenta cuenta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        iniciar();

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Cuenta c: getCuentas()
                     ) {
                    for (Cuenta c2: getCuentas()) {
                        if (c.getId().equals(txtNumeroCuenta.getText().toString()) &&
                                c2.getClave().equals(txtClaveCuenta.getText().toString())) {
                            Intent intento = new Intent(getApplicationContext(), Main2Activity.class);
                            setCuenta(c);
                            startActivity(intento);
                            break;
                        }
                    }
                }
            }
        });
    }
    //Inicializacion de variables y casteo
    private void iniciar(){
        btnIngresar=(Button)findViewById(R.id.btnIngresar);
        txtNumeroCuenta=(EditText)findViewById(R.id.txtNumeroCuenta);
        txtClaveCuenta = (EditText)findViewById(R.id.txtClaveCuenta);


        cuentas =new ArrayList<>();
        cuentas.add(new Cuenta("2314", "1243", "Medellin", 400000));
        cuentas.add(new Cuenta("4312", "5412", "Bogota", 500000));
        cuentas.add(new Cuenta("9380", "2834", "Armenia", 400000));
        cuentas.add(new Cuenta("2834", "4312", "Meta", 600000));
        cuentas.add(new Cuenta("4352", "7384", "Medellin", 100000));
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
