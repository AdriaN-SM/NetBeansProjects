/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_funciones_07;

import java.util.Scanner;

/**
 *
 * Escribe una función que determine el número de palabras que contiene una frase.
 *
 *
 * @since 16.12.2021
 * Fecha de modificación: 16.12.2021
 * @author Adrian Solanas
 */
public class Ejercicios_funciones_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase;
        
        
        System.out.println("Este programa cuenta las palabras de una frase.");
        System.out.println("Introduce una frase: ");
        frase = entradaFrase();
        System.out.println("\nLa frase que has introducido contiene " + contarPalabras(frase) + " palabra/s.");
        System.out.println("\nPrograma finalizado...");
        
    }
    
    public static int contarPalabras(String frase) {
        int palabras = 0, i;
        
        frase+=" ";
        for (i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                palabras++;
            }
        }
        
        return palabras;
    }
    
    public static String entradaFrase() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}
