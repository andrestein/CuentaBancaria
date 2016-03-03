package com.example.lenovo.cuenta;

/**
 * Created by LENOVO on 20/02/2016.
 */
public class Cuenta {

    //Atributos
    private String id;
    private String clave;
    private String sucursal;
    private double saldo;

    //Constructor de la clase cuenta
    public Cuenta(String id,String clave,String sucursal,double saldo){
        this.setId(id);
        this.setClave(clave);
        this.setSaldo(saldo);
        this.setSucursal(sucursal);
    }
    //Este metodo retira el dinero de la cuenta
    public String retiro(double retirar){
        if (this.getSaldo() > retirar){
            this.setSaldo(this.getSaldo() - retirar);
            return "Exito al retirar, el saldo actual es : "+this.getSaldo()+"\n";
        }else{
            return "Saldo insuficiente para relaizar el retiro";
        }
    }
    //Este metodo ingresa dinero a la cuenta
    public String consignar(double consignacion){
        this.setSaldo(this.getSaldo()+ consignacion);
        return "La consignacion fue exitosa su saldo actual es de : "+this.getSaldo();
    }
    //Este metodo retorna el saldo
    public String consultarSaldo(){
        return "Su salario es de :"+this.getSaldo();
    }
    //Este metodo tranfiere el dinero una cuenta a otra
    public void transferencia(Cuenta c, Cuenta c2,double transaccion){
        c.setSaldo(c.getSaldo() - transaccion);
        c2.setSaldo(c2.getSaldo() + transaccion);

    }
    //Este metodo cambia la clave
    public void cambiarClave(String claveNueva){
        this.setClave(claveNueva);
    }

    //Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
