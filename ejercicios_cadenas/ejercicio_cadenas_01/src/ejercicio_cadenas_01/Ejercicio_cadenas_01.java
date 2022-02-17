/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_cadenas_01;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_cadenas_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, c = 0;
        String cadena, palabra = "", mostrar = null;
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cadena: ");
        cadena = in.nextLine();
        cadena += " "; //cadena = cadena + " ";
        
        for (i=0 ; i < cadena.length(); i++) {
            palabra = palabra + cadena.charAt(i);
            if (cadena.charAt(i) == ' ') {
                if (palabra.length() -1 > c) {
                    c = palabra.length() -1;
                    mostrar = palabra.trim();
                }
                palabra = "";
            }
        }
        System.out.println("La palabra de mayor longitud es: " + mostrar);
        System.out.println("Su longitud es: " + c);
        
    }
    
}
