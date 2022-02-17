/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_funciones_08;

import java.util.Scanner;

/**
 *
 * Escribe una función que determine si en una frase hay más vocales que consonantes.
 *
 *
 * @since 16.12.2021
 * Fecha de modificación: 16.12.2021
 * @author Adrian Solanas
 */
public class Ejercicios_funciones_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase;
        
        
        System.out.println("Este programa determina si hay mas vocales que consonantes en una frase.");
        System.out.println("Introduce una frase (solo letras simples):");
        frase = entradaFrase();
        System.out.println("\nEn la frase hay " + vocalesConsonantes(frase));
        System.out.println("\nPrograma finalizado...");
    }
    
    public static String vocalesConsonantes(String frase) {
        
        String vocales = "aeiou";
        String contador;
        int contadorVocal = 0, contadorCons = 0, i;
        
        
        frase = frase.toLowerCase();
        for (i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= 97 && frase.charAt(i) <= 122) {
                if (vocales.indexOf(frase.charAt(i)) != -1) {
                    contadorVocal++;
                }
                else {
                    contadorCons++;
                }
            }
        }
        if (contadorVocal > contadorCons) {
            contador = "más vocales.";
        }
        else if (contadorVocal < contadorCons) {
            contador = "más consonantes.";
        }
        else {
            contador = "las mismas vocales que consonantes.";
        }
        return contador;
        
    }
    
    public static String entradaFrase() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}
