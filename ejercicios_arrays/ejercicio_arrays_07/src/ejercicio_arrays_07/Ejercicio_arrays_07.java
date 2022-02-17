/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_arrays_07;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_arrays_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeros[] = new int[10]; // Definimos un array de longitud 10
        int i, num, sitio = 0, j = 0;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 6 números enteros de forma creciente.");
        for (i = 0; i < 5; i++) { // Almacenamos 5 números en el array
            System.out.print("Introduce un número entero (de forma creciente): ");
            numeros[i] = in.nextInt();
        }
        
        System.out.print("Introduce otro número entero para ordenarlo entre los anteriores: ");
        num = in.nextInt(); // Ingresamos otro número en la posición 0 (posición vacía)
        
        while (numeros[j] < num && j <= 4) { // Con este bucle buscamos la posición en la que debe ir el número
            sitio++;
            j++;
        }
        for (i = 4; i >= sitio; i--) { // Con este bucle movemos los números una posición desde el sitio en el que debe estar el sexto número
            numeros[i+1] = numeros[i];
        }
        numeros[sitio] = num; // Introducimos el número en la posición
        
        System.out.println("");
        System.out.println("Números ordenados de forma ascendente:");
        for (i = 0; i < numeros.length; i++) { // Volvemos a mostrar los números ordenados
            System.out.print(numeros[i] + ", ");
        }
        System.out.println("");
        System.out.println("");
        
    }
    
}
