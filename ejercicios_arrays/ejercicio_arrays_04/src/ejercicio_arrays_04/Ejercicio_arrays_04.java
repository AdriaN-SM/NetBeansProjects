/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_arrays_04;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_arrays_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeros[] = {0,0,0,0,0,0,0,0,0,0}; // Inicializamos el array de tipo entero con 10 ceros
        int i; // Inicializamos en 0 la variable entera
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 10 números para evaluarlos.");
        for (i = 0; i < 10; i++) { // Con este bucle iremos almacenando los 10 números en el array.
            System.out.print("Introduce un número: ");
            numeros[i] = in.nextInt();
        }
        System.out.println(numeros[0]); // Mostramos las posiciones que queremos
        System.out.println(numeros[9]);
        System.out.println(numeros[1]);
        System.out.println(numeros[8]); 
        System.out.println(numeros[2]); 
        System.out.println(numeros[7]); 
        System.out.println(numeros[3]); 
        System.out.println(numeros[6]); 
        System.out.println(numeros[4]); 
        System.out.println(numeros[5]); 
        
    }
    
}
