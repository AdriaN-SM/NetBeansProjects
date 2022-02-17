/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_funciones_09;

import java.util.Scanner;

/**
 *
 * Escribe una función que determine si un número es primo. El programa debe ser
 * recursivo, se saldrá de el al pulsar cualquier tecla distinta del cero.
 *
 *
 * @since 16.12.2021
 * Fecha de modificación: 16.12.2021
 * @author Adrian Solanas
 */
public class Ejercicios_funciones_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        
        System.out.println("Este programa determina si un número es primo.");
        System.out.println("Introduce un número entero: ");
        numero = entradaEntero();
        if (esPrimo(numero) == true) {
            System.out.println("El número " + numero + " es primo");
        }
        else {
            System.out.println("El número " + numero + " no es primo");
        }
        
    }
    
    public static boolean esPrimo(int numero) {
        
        int i;
        
        
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (i = 2; i < numero / 2; i++) {
            // Si es divisible por cualquiera de estos números, no es primo
            if (numero % i == 0) {
                return false;
            }
        }
        // Si no se pudede dividir por ninguno de los de arriba, sí es primo
        return true;
    }
    
    public static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

}
