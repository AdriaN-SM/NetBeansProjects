/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_arrays_06;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_arrays_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeros[] = {0,0,0,0,0,0,0,0,0,0}; // Inicializamos el array de tipo entero con 10 ceros
        int i, num, j;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 10 números para cambiar su orden.");
        for (i = 0; i < 10; i++) { // Almacenamos los números en el array
            System.out.print("Introduce un número: ");
            numeros[i] = in.nextInt();
        }
        j = numeros[9];
        for (i = 8; i >= 0; i--) { 
            numeros[i+1] = numeros[i];
        }
        numeros[0] = j;
        System.out.println("");
        for (i = 0; i < numeros.length; i++) { // Mostramos el array
            System.out.print(numeros[i] + " ");
        }
        
    }
    
}
