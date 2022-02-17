/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_arrays_02;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_arrays_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeros[] = {0,0,0,0,0}; // Inicializamos el array de tipo entero con 5 ceros
        int i; // Establecemos la variable entera i
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 5 números.");
        for (i = 0; i < 5; i++) { // Con este bucle almacenamos de 1 en 1 los números en el array
            System.out.print("Introduce un número: ");
            numeros[i] = in.nextInt();
        }
        System.out.println("Lista de los números introducidos invertidos:");
        for (i = 4; i >= 0; i--) { // Con este bucle mostramos los números en el orden inverso a su introducción en el array
            System.out.println(numeros[i]);
        }
        
    }
    
}
