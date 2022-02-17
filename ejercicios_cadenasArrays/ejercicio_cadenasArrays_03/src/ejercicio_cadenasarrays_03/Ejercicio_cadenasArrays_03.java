/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_cadenasarrays_03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Este programa lee 2 series de 10 números enteros de forma ordenada (creciente)
 * y las fusiona en una tercera de forma ordenada (crecientemente)
 * 
 * Creado: 01/12/2021
 * Modificado: 01/12/2021
 * Versión 1.0
 * 
 * @author Adrian Solanas
 */
public class Ejercicio_cadenasArrays_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        int arr3[] = new int[20];
        int i;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Este programa recoge 2 series de 10 números y las "
                + "fusiona de forma ordenada.");
        System.out.println("**************************************************"
                + "**************************");
        System.out.println("");
        System.out.println("Primera serie de 10 números");
        System.out.println("");
        for (i = 0; i < arr1.length; i++) {
            System.out.print("Introduce un número entero: ");
            arr1[i] = in.nextInt();
        }
        System.out.println("******************************");
        System.out.println("");
        System.out.println("Segunda serie de 10 números");
        System.out.println("");
        for (i = 0; i < arr2.length; i++) {
            System.out.print("Introduce un número entero: ");
            arr2[i] = in.nextInt();
        }
        System.out.println("******************************");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.println("");
        System.out.println("Primera serie ordenada:");
        System.out.println("");
        for (i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        System.out.println("******************************");
        System.out.println("");
        System.out.println("Segunda serie ordenada:");
        System.out.println("");
        for (i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("******************************");
        
        System.arraycopy(arr1, 0, arr3, 0, 10);
        System.arraycopy(arr2, 0, arr3, 10, 10);
        
        Arrays.sort(arr3);
        
        System.out.println("");
        System.out.println("Las dos series fusionadas y ordenadas:");
        System.out.println("");
        for (i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("\nPrograma finalizado.");
        
    }
    
}
