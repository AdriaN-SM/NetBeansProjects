/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_funciones_05;

import java.util.Scanner;

/**
 *
 * Escribir una función que calcule el máximo común divisor de dos números
 *
 *
 * @since 15.12.2021
 * Fecha de modificación: 15.12.2021
 * @author Adrian Solanas
 */
public class Ejercicios_funciones_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2;
        
        
        System.out.println("Este programa calcula el máximo común divisor de dos números enteros.");
        System.out.print("Introduce un número entero: ");
        num1 = entradaEntero();
        System.out.print("Introduce otro número entero: ");
        num2 = entradaEntero();
        System.out.println("El máximo comun divisor de " + num1 + " y " + num2 + " es " + mcd(num1, num2));
        System.out.println("\nPrograma finalizado...");
    }
    
    public static int mcd(int num1, int num2) {
        int resultado;
        
        while (num2 != 0) {
            resultado = num2;
            num2 = num1 % num2;
            num1 = resultado;
        }
        
        return num1;
    }
    
    public static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

}
