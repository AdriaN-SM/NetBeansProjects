/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_cadenas_02;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_cadenas_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, palabras = 0;
        String cadena, palabra = "";
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        cadena = in.nextLine();
        cadena += " ";
        
        for (i = 0; i < cadena.length(); i++) {
            palabra = palabra + cadena.charAt(i);
            if (cadena.charAt(i) == ' ') {
                palabras++;
            }
        }
        System.out.println("El número de palabras es: " + palabras);
    }
    
}
