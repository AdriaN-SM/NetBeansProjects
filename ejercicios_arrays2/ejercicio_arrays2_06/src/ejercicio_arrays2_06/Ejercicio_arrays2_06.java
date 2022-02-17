/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_arrays2_06;

import java.util.Random;

/**
 *
 * Este programa genera una matriz de 10x10 y la rellena con números enteros generados aleatoriamente
 * entre -5 y 5. Se calculan la suma de cada fila y la suma de cada columna.
 * 
 * Fecha de creación: 03/12/2021
 * Fecha de modificación: 05/12/2021
 * Versión 1.0
 * 
 * @author adria
 */
public class Ejercicio_arrays2_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr1[][] = new int[10][10]; //matriz de 10x10
        int filas[] = new int[10]; //array para almacenar la suma de las filas
        int col[] = new int[10]; //array para almacenar la suma de las columnas
        int aleatorio, i, j; //variables para los arrays
        
        Random rand = new Random();
        System.out.println("Matriz de 10x10:");
        System.out.println("");
        //Rellenamos la matriz de 10x10 con números aleatorios entre -5 y 5 y la mostramos
        for (i = 0; i<arr1.length; i++) {
            for (j = 0; j<arr1[0].length; j++) {
                aleatorio = rand.nextInt(6 - (-5))-5;
                arr1[i][j] = aleatorio;
                System.out.print(arr1[i][j]);
                System.out.print(" , ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("***********************************************");
        System.out.println("");
        //Filas: sumamos todos los números de la fila a la primera posición del array "filas"
        for (i = 0; i<10; i++) {
            for (j = 0; j<10; j++) {
                filas[i] = filas[i] + arr1[i][j];
            }
            System.out.println("Suma de la fila " + i + " es: " + filas[i]);
        }
        System.out.println("");
        //Columnas: sumamos todos los números de la columna a la primera posición del array "columnas"
        for (j = 0; j<10; j++) {
            for (i = 0; i<10; i++) {
                col[j] = col[j] + arr1[i][j];
            }
            System.out.println("Suma de la columna " + j + " es: " + col[j]);
        }
        System.out.println("\nPrograma finalizado...");
    }
    
}
