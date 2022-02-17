/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_cadenasarrays_01;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_cadenasArrays_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase, frase2 = "";
        boolean palindromo = false;
        int i;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Programa para saber si una frase para saber si es un palíndromo.");
        System.out.print("Introduce una frase: ");
        frase = in.nextLine(); // Introducimos la frase a evaluar
        frase = frase.replace(" ", ""); // Quitamos los espacios de la frase
        frase = frase.replace(",", ""); // Quitamos las comas de la frase
        frase = frase.replace(".", ""); // Quitamos los puntos de la frase
        frase = frase.toLowerCase(); // Cambiamos la frase a minusculas
        for (i = 0; i < frase.length(); i++) { // Con este bucle almacenamos cada caracter de la frase en la frase2 pero de forma invertida
            frase2 = frase.charAt(i) + frase2;
        }
        if (frase.equals(frase2) == true) { // Con esta condición comprobamos que las dos cadenas sean iguales
            palindromo = true;
        }
        if (palindromo == true) { // Si las dos cadenas son iguales, la frase es un palindromo
            System.out.println("La frase es un palíndromo.");
        }
        else { // Si no son iguales, la frase no es un palíndromo
            System.out.println("La frase no es un palíndromo");
        }
    }
    
}
