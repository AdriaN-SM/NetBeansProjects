/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_herenciapolimorfismo_03_clase_abstracta;

/**
 *
 *
 *
 * @since 04.02.2022
 * Fecha de modificación: 04.02.2022
 * @author Adrian Solanas
 */
public class Ejercicios_herenciaPolimorfismo_03_Clase_Abstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancaria[] cuentas = new CuentaBancaria[3];
        cuentas[0] = new CuentaCorriente("001", 1000);
        cuentas[1] = new CuentaAhorro("002", 500);
        cuentas[2] = new CuentaCorriente("003", 800);
        
        cuentas[0].mostrarCuenta();
        cuentas[1].mostrarCuenta();
        cuentas[2].mostrarCuenta();
        
        cuentas[0].ingresar(100);
        System.out.println("\nIngreso\n");
        cuentas[0].mostrarCuenta();
        cuentas[1].retirar(300);
        cuentas[2].traspaso(cuentas[2], cuentas[0], 10);
        
        System.out.println("\n Cuentas operadas:");
        cuentas[0].mostrarCuenta();
        cuentas[1].mostrarCuenta();
        cuentas[2].mostrarCuenta();
        
        System.out.println("\nPrograma finalizado...");
        
    }

}
