/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_clases2_03;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class CuentaCorriente {
    
    String numCuenta;
    double saldo;

    public CuentaCorriente() {
    }
    
    public CuentaCorriente(String numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = 0;
    }
    
    public double ingresaEfectivo(double cantidad) {
        
        return this.saldo = this.saldo + cantidad;
    }
    
    public boolean retirarEfectivo(double cantidad) {
        
        boolean correcto = false;
        
        if (this.saldo > 0 && cantidad < this.saldo) {
            this.saldo = this.saldo - cantidad;
            correcto = true;
        }
        
        return correcto;
    }
    
    public void visualiza() {
        
        System.out.println(this.toString());
        
    }

    @Override
    public String toString() {
        
        String cuentaCorriente;
        
        cuentaCorriente = "Num. Cuenta: " + this.numCuenta + " Saldo: " + this.saldo;
        
        return cuentaCorriente;
    }
    
    public void menuCC() {
        int opcion;
        Scanner tecladoEntero = new Scanner(System.in);
        
        Scanner inDouble = new Scanner(System.in);
        double cantidad;
        
        System.out.println("1. Ingresar CC 001");
        System.out.println("2. Ingresar CC 002");
        System.out.println("3. Retirar CC 001");
        System.out.println("4. Retirar CC 002");
        System.out.println("5. Visualizar CC 001 y CC 002");
        System.out.println("");
        System.out.println("0. Salir del programa");
        
        System.out.println("\nOpción: ");
        opcion = tecladoEntero.nextInt();
        
        do {
            switch (opcion) {
                case 1:
                    
                    cantidad = inDouble.nextDouble();
                    this.ingresaEfectivo(cantidad);
                    break;
                case 2:
                    cantidad = inDouble.nextDouble();
                    this.ingresaEfectivo(cantidad);
                    break;
                case 3:
                    cantidad = inDouble.nextDouble();
                    this.retirarEfectivo(cantidad);
                    break;
                case 4:
                    cantidad = inDouble.nextDouble();
                    this.retirarEfectivo(cantidad);
                    break;
                case 5:
                    visualiza();
                    break;
                case 0:
                    System.out.println("\nPrograma finalizado...");
                    break;
            }
        } while (opcion != 0);
        
        
    }
    
}
