/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_adrian;

import java.util.Scanner;

/**
 *
 * @author adrian solanas
 */
public class Ejercicio2_adrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase;
        int i, vocales = 0, consonantes = 0, numericos = 0;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa cuenta las vocales, consonantes y "
                + "carácteres numéricos de una frase.");
        System.out.println("Introduce una frase de 80 caracteres máximo: ");
        frase = in.nextLine();
        if (frase.length() <= 80) {
            frase = frase.toLowerCase();
            frase = frase.replace(" ", "");
            frase = frase.replace(",", "");
            frase = frase.replace(".", "");
            for (i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z' || 
                        frase.charAt(i) >= '0' && frase.charAt(i) <= '9') {
                    
                    if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || 
                        frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || 
                        frase.charAt(i) == 'u') {
                        vocales++;
                    }
                    else if (frase.charAt(i) != 'a' && frase.charAt(i) != 'e' && 
                            frase.charAt(i) != 'i' && frase.charAt(i) != 'o' && 
                            frase.charAt(i) != 'u' && frase.charAt(i) > 'a' && 
                            frase.charAt(i) <= 'z') {
                        consonantes++;
                    }
                    if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9') {
                        numericos++;
                    }
                }
                
            }
            System.out.println("El número de vocales es: " + vocales);
            System.out.println("El número de consonantes es: " + consonantes);
            System.out.println("El número de carácteres numéricos es: " + numericos);
        }
        else {
            System.out.println("ERROR. La longitud de la frase debe ser de 80 "
                    + "caracteres como máximo.");
        }
        
    }
    
}
