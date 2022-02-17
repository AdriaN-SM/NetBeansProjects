/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_arrays_05;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_arrays_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeros[] = {0,0,0,0,0,0,0,0,0,0}; // Inicializamos el array de tipo entero con 10 ceros
        int numeros2[] = {0,0,0,0,0,0,0,0,0,0}; // Inicializamos el array de tipo entero con 10 ceros
        int numeros3[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; // Este array es el array del resultado
        int i, j = 0;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 2 conjuntos 10 números enteros para evaluarlos.");
        System.out.println("Primer conjunto:");
        for (i = 0; i < 10; i++) { // Con este bucle iremos almacenando los 10 números en el array.
            System.out.print("Introduce un número: ");
            numeros[i] = in.nextInt();
        }
        System.out.println("");
        System.out.println("Segundo conjunto:");
        for (i = 0; i < 10; i++) { // Con este bucle iremos almacenando los 10 números en el array.
            System.out.print("Introduce un número: ");
            numeros2[i] = in.nextInt();
        }
        
        for (i = 0; i < 10; i++) { // Con este bucle almacenamos de forma intercalada en el tercer array los números del primer y segundo array
            numeros3[j] = numeros[i]; // En la posición "j" del array3 introducimos el número de la posición "i" del array1
            j++; // Incrementamos en 1 la variable "j" para pasar a la siguiente posición del array
            numeros3[j] = numeros2[i]; // En la posición "j" del array3 introducimos el número de la posición "i" del array2
            j++; // Incrementamos en 1 la variable "j" para pasar a la siguiente posición del array
        }
        System.out.println("");
        System.out.println("Los dos conjuntos intercalados: ");
        for (i = 0; i < numeros3.length; i++) { // Con este bucle mostramos el array3
            System.out.print(numeros3[i] + " ");
        }
        System.out.println("");
        
    }
    
}
