/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_cadenasarrays_02;

/**
 *
 * @author adria
 */
public class Ejercicio_cadenasArrays_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int aleatorio; // Variable en la que almacenaremos un número aleatorio más adelante.
        int vector1[] = new int[10]; // Primer array de longitud 10
        int vector2[] = new int[10]; // Segundo array de longitud 10
        int cantidad[] = new int[10]; // Array en el que almacenaremos las veces que se repite un valor del array1 en el array2
        int i, j, con = 0; // Variables para los bucles
        
        
        for (i = 0; i < vector1.length; i++) { // Con este bucle rellenamos el array con números aleatorios del 1 al 5 (incluidos)
            vector1[i] = (aleatorio = (int) Math.floor(Math.random()*5+1));
        }
        System.out.println("Vector 1: ");
        for (i = 0; i < vector1.length; i++) { // Con este bucle mostramos el array
            System.out.print(vector1[i] + " ");
        }
        
        for (i = 0; i < vector2.length; i++) { // Con este bucle rellenamos el array con números aleatorios del 1 al 5 (incluidos)
            vector2[i] = (aleatorio = (int) Math.floor(Math.random()*5+1));
        }
        System.out.println();
        System.out.println("Vector 2: ");
        for (i = 0; i < vector2.length; i++) { // Con este bucle mostramos el array
            System.out.print(vector2[i] + " ");
        }
        
        for (i = 0; i < vector1.length; i++) { // Con este bucle recorremos el primer array (elemento por elemento)
            for (j = 0; j < 10; j++) { // Con este bucle anidado, recorremos el segundo array (elemento por elemento)
                if (vector1[i] == vector2[j]) { // Aquí contamos las veces que se repite un valor del primer array en el segundo array
                    con++;
                    cantidad[i] = con; // Establecemos en cada elemento las veces que se repite un valor
                }
            }
            con = 0; // Establecemos el contador a 0 para evaluar el siguiente elemento del array1 con los demás elementos del array2
        }
        System.out.println();
        System.out.println("Cantidades: ");
        j = 1; // Establecemos la variable j en 1 para identificar cada elemento del array de cantidades
        for (i = 0; i < cantidad.length; i++) { // Mostramos las veces que se repite cada elemento del array1 con los valores que hemos almacenado en el array de cantidades
            System.out.println("El elemento " + j + " se repite " + cantidad[i] + " veces.");
            j++;
        }
    }
    
}
