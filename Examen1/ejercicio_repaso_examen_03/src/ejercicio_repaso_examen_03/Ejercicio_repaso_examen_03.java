/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_repaso_examen_03;

import java.util.Scanner;

/**
 * Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez 
 * filtrada y dado un numero entre 1 y 10 haga un cifrado de la frase (denominado 
 * cifrado CESAR) del modo siguiente , si el numero por ejemplo es 3, transforme 
 * la frase de manera que cada carácter se transforme en 3 códigos ASCII más, es 
 * decir : Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
 * 
 * @author adria
 */
public class Ejercicio_repaso_examen_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase, resultado = "";
        int i, contadorMinusculas, option, letra, letra2;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa hace el cifrado 'CESAR' de una frase en mayúsculas.");
        do {
            System.out.print("\nIntroduce una frase en mayúsculas: ");
            frase = in.nextLine();
            contadorMinusculas = 0;
            for (char caracter = 'a'; caracter <= 'z'; caracter++) {
                for (i = 0; i < frase.length(); i++) {
                    if (caracter == frase.charAt(i)) {
                        contadorMinusculas++;
                    }
                }
            }
            if (contadorMinusculas > 0) {
                System.out.println("\nERROR. La frase contiene minúsculas.");
            }
        } while (contadorMinusculas > 0);
        System.out.print("\nElije una opción de cifrado (1-10): ");
        option = in.nextInt();
        if (option > 0 && option <= 10) {
            for (i = 0; i < frase.length(); i++) {
                letra = frase.charAt(i) + option;
                if (letra > 90) {
                    letra2 = letra - 90;
                    letra = 64 + letra2;
                }
                char convertido = (char) letra;
                resultado+=convertido;
            }
            System.out.println("\nLa frase cifrada con la opción " + option + " es: " + resultado);
        }
        else {
            System.out.println("\nERROR. La opción debe ser entre 1 y 10.");
        }
        
    }
    
}
