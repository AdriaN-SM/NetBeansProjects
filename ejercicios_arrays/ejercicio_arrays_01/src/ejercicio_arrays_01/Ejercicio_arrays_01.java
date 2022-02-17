/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_arrays_01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_arrays_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeros[] = {0,0,0,0,0}; // Inicializamos el array de tipo entero con 5 ceros
        int i; // Establecemos la variable entera i
        //int numeros[] = new int[5];
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 5 números.");
        
        for (i = 0; i < 5; i++) { // Con este bucle iremos almacenando los 5 números en el array
            System.out.print("Introduce un número: ");
            numeros[i] = in.nextInt();
        }
        System.out.println("Lista de los números introducidos:");
        for (i = 0; i < numeros.length; i++) { // Con este bucle mostraremos los números en el orden de introducción
            System.out.println(numeros[i]);
        }
    }
    
}
