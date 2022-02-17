/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_herenciapolimorfismo_03_clase_abstracta;

/**
 *
 * @author adria
 */
public abstract class CuentaBancaria {
    
    String numeroCuenta;
    double saldo;
    final double interesAnualBasico = 0.2;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteresAnualBasico() {
        return interesAnualBasico;
    }
    
    public double ingresar(double cantidad) {
        saldo = saldo + cantidad;
        return saldo;
    }
    
    public double retirar(double cantidad) {
        saldo = saldo - cantidad;
        return saldo;
    }
    
    public void traspaso(CuentaBancaria cuenta1, CuentaBancaria cuenta2, double cantidad) {
        cuenta1.saldo = cuenta1.saldo - cantidad;
        cuenta2.saldo = cuenta2.saldo + cantidad;
    }
    
    public void traspaso2(CuentaBancaria cuenta1, double cantidad) {
        cuenta1.saldo = cuenta1.saldo + cantidad;
        this.saldo = this.saldo - cantidad;
    }
    
    public abstract double calcularIntereses();
    
    public void mostrarCuenta() {
        System.out.println("IBAN: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }
    
}
