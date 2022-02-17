/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_arrays2_01;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * En este programa se generan 20 números aleatorios de tipo entero entre -10 y 10
 * se almacenan en un vector y se calcula la media y cuantos números hay superiores,
 * inferiores e iguales a la media.
 * 
 * Creado: 02/12/2021
 * Modificado: 05/12/2021
 * Versión 1.0
 * 
 * @author Adrian Solanas
 */
public class Ejercicio_arrays2_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr1[] = new int[20]; //array de tipo entero de 20 de longitud
        int inf = 0, sup = 0, igual = 0; //variables para los cálculos
        int aleatorio, i; //variables para rellenar el array
        double media = 0; 
        
        System.out.println("Este programa genera 20 números de tipo enteros "
                + "\naleatorios entre -10 y 10 y muestra la media, cuantos números "
                + "\nhay superiores, iguales e inferiores a la media.\n"
                + "\n**************************************************************");
        Random rand = new Random(); 
        //rellenamos el array con números enteros de -10 a 10
        for (i = 0; i < arr1.length; i++) {
            aleatorio = rand.nextInt(11 - (-10))-10;
            arr1[i] = aleatorio;
        }
        //acumulamos todos los números del array recorriendolo uno a uno en la variable "media"
        for (i = 0; i < arr1.length; i++) {
            media = arr1[i] + media;
        }
        //Calculamos la media
        media = media/arr1.length;
        //Calculamos cuantos números hay superiores, inferiores e iguales a la media
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] < media) {
                inf++;
            }
            else if (arr1[i] > media) {
                sup++;
            }
            else {
                igual++;
            }
        }
        //Mostramos el array y los cálculos realizados
        System.out.println("\nNúmeros generados aleatoriamente:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("\nMedia: " + media);
        System.out.println("Números superiores a la media: " + sup);
        System.out.println("Números inferiores a la media: " + inf);
        System.out.println("Números iguales a la media: " + igual);
        System.out.println("");
        System.out.println("Programa finalizado.");
        System.out.println("");
        
    }
    
}
