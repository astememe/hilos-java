package Ejercicios.CuentaBancaria;

public class Cajero {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1000);
        SacarDinero transaccion1 = new SacarDinero("Fabio", cuenta, 900);
        SacarDinero transaccion2 = new SacarDinero("Rodrigo", cuenta, 500);
        transaccion1.start();
        transaccion2.start();
    }
}
