/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_funciones_06;

import java.util.Scanner;

/**
 *
 * Escribe una función que dado un número de mes devuelva el nombres de dicho mes.
 *
 *
 * @since 15.12.2021
 * Fecha de modificación: 15.12.2021
 * @author Adrian Solanas
 */
public class Ejercicios_funciones_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeroMes;
        String Mes;
        
        System.out.println("Este programa devuelve el nombre del mes dependiendo el número que introduzcas.");
        do {
            System.out.print("Introduce el número del mes (1-12): ");
            numeroMes = entradaEntero();
        } while (numeroMes <= 0 || numeroMes > 12);
        numeroMes--;
        Mes = nombreMes(numeroMes);
        numeroMes++;
        System.out.println("El nombre del mes " + numeroMes + " es " + Mes);
        System.out.println("\nPrograma finalizado...");
    }
    
    public static String nombreMes(int numeroMes) {
        String nombre;
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        nombre = meses[numeroMes];
        return nombre;
    }
    
    public static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
    public static boolean pagaExtra(String mes) {
        
        boolean pagaExtra = false;
        if (mes == "Julio" || mes == "Diciembre") {
            pagaExtra = true;
        }
        else {
            pagaExtra = false;
        }
        return pagaExtra;
    }

}
