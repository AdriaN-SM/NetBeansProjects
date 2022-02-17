/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_repaso_examen_01;

import java.util.Scanner;

/**
 *
 * Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas 
 * mayúsculas y minúsculas tiene y lo imprima
 * 
 * @author adria
 */
public class Ejercicio_repaso_examen_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase;
        int i, contadorMayusculas = 0, contadorMinusculas = 0;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa cuenta las mayúsculas y minusculas de una frase.");
        System.out.println("Introduce una frase (< 80 caracteres): ");
        frase = in.nextLine();
        if (frase.length() <= 80) {
            for (char caracter = 'A'; caracter <= 'Z'; caracter++) {
                for (i = 0; i < frase.length(); i++) {
                    if (caracter == frase.charAt(i)) {
                        contadorMayusculas++;
                    }
                }
            }
            for (char caracter = 'a'; caracter <= 'z'; caracter++) {
                for (i = 0; i < frase.length(); i++) {
                    if (caracter == frase.charAt(i)) {
                        contadorMinusculas++;
                    }
                }
            }
        }
        else {
            System.out.println("ERROR. La longitud de la frase debe ser menor a 80 caracteres.");
        }
        
        System.out.println("El número de letras mayúsculas es " + contadorMayusculas);
        System.out.println("El número de letras minúsculas es " + contadorMinusculas);
        
    }
    
}
