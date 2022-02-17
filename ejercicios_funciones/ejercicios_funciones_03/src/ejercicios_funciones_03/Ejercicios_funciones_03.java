/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_funciones_03;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Este programa calcula el máximo de un array de "n" números
 * 
 * @since 09.12.2021
 * Versión 1.0
 * @author Adrian Solanas
 */
public class Ejercicios_funciones_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, aleatorio, longitud;
        
        
        System.out.println("Este programa genera un array de números aleatorios entre 1 y 100 de "
                + "\nuna longitud a elegir y muestra cual es el número máximo.");
        
        do {
            System.out.print("\nIntroduce cual quieres que sea la longitud del array (número entero): ");
            longitud = entradaEntero();
            if (longitud <= 0) {
                System.out.println("\nERROR. " + longitud + " no es una longitud.");
            }
        }while (longitud <= 0);
        
        int arr1[] = new int[longitud];
        
        Random rand = new Random(); 
        //rellenamos el array con números enteros de 1 a 100
        for (i = 0; i < arr1.length; i++) {
            aleatorio = rand.nextInt(101 - (1))+1;
            arr1[i] = aleatorio;
        }
        int max = maximo(arr1);
        System.out.println("El máximo del array es: " + max);
        System.out.println("\nPrograma finalizado...");
    }
    
    public static int maximo(int arr1[]) {
        int max = 0, i;
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        return max;
    }
    
    public static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

}
