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
public class CuentaCorriente extends CuentaBancaria {
    
    public CuentaCorriente(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }
    
    @Override
    public double calcularIntereses() {
        return saldo += saldo*interesAnualBasico;
    }

    @Override
    public void mostrarCuenta() {
        System.out.println("*********************************");
        System.out.println("Cuenta Corriente:");
        super.mostrarCuenta();
        System.out.println("*********************************");
    }
    
    
    
}
