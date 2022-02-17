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
public class CuentaAhorro extends CuentaBancaria {

    final double saldoMinimo = 300;

    public CuentaAhorro() {
    }

    public CuentaAhorro(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }
    
    @Override
    public double calcularIntereses() {
        if (saldo < saldoMinimo) {
            return saldo += saldo * (interesAnualBasico / 2);
        }
        else {
            return saldo += saldo * (interesAnualBasico * 2);
        }
    }

    @Override
    public void mostrarCuenta() {
        System.out.println("*********************************");
        System.out.println("Cuenta de Ahorros:");
        super.mostrarCuenta();
        System.out.println("*********************************");
    }
    
    
    
}
