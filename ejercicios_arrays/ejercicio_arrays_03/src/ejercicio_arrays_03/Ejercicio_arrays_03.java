/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_arrays_03;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_arrays_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeros[] = {0,0,0,0,0}; // Inicializamos el array de tipo entero con 5 ceros
        int i, positivos = 0, negativos = 0, ceros = 0; // Inicializamos en 0 las variables enteras
        int sumaPositivos = 0, sumaNegativos = 0; // Inicializamos en 0 las variables enteras
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 5 números para evaluarlos.");
        for (i = 0; i < 5; i++) { // Con este bucle iremos almacenando los 5 números en el array.
            System.out.print("Introduce un número: ");
            numeros[i] = in.nextInt();
        }
        for (i = 0; i < numeros.length; i++) { // Este bucle se encarga de ir pasando por cada posición del array
            if (numeros[i] > 0) { // En este "if" evaluamos si el número es positivo
                positivos++; // Incrementamos en 1 el contador de números positivos
                sumaPositivos = sumaPositivos + numeros[i]; // Sumamos el número a la suma de positivos.
            }
            else if (numeros[i] < 0) { // Si el número es negativo
                negativos++; // Incrementamos en 1 el contador de números negativos
                sumaNegativos = sumaNegativos + numeros[i]; // Sumamos el número a la suma de negativos.
            }
            else { // Si no se da ninguna de las 2 condiciones anteriores (el número es 0)
                ceros++; // Incrementamos en 1 el contador de ceros
            }
        }
        if (positivos == 0) { // Si la cantidad de números positivos es 0
            System.out.println("Media de los números positivos: No hay ningún número positivo."); // No hay ningún número positivo
        }
        else { // Sino
            System.out.println("Media de los números positivos: " + sumaPositivos/positivos); // Mostramos la media de los números positivos dividiendo la suma total de los positivos entre la cantidad de números positivos
        }
        if (negativos == 0) { // Si la cantidad de números negativos es 0
            System.out.println("Media de los números negativos: No hay ningún número negativo."); // No hay ningún número negativo
        }
        else { // Sino
            System.out.println("Media de los números negativos: " + sumaNegativos/negativos); // Mostramos la media de los números negativos dividiendo la suma total de los negativos entre la cantidad de números negativos
        }
        
        System.out.println("Cantidad de ceros: " + ceros); // Mostramos la cantidad de ceros
        
    }
    
}
