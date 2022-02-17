/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_cadenas_04;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_cadenas_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, j, k = 0;
        String cadena1, cadena2, resultado = "";
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce la primera cadena: ");
        cadena1 = in.nextLine();
        System.out.println("");
        System.out.print("Introduce la segunda cadena: ");
        cadena2 = in.nextLine();
        for (i = 0; i < cadena1.length(); i++) {
            resultado += cadena1.charAt(i);
            for (j = k; j < cadena2.length(); j++) {
                resultado += cadena2.charAt(j);
                j = cadena2.length();
                k++;
            }
        }
        System.out.println("La cadena resultante es: " + resultado);
    }
    
}
