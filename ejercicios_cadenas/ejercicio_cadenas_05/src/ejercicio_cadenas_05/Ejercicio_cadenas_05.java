/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_cadenas_05;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_cadenas_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, contador = 0;
        String cadena1, cadena2 = "", falta = "";
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        cadena1 = in.nextLine();
        
        for (i = 0; i < cadena1.length(); i++) {
            if (cadena1.charAt(i) != ' ') {
                cadena2 += cadena1.charAt(i);
            }
        }
        
        cadena2 = cadena2.toLowerCase();
        
        for (char caracter = 'a'; caracter <= 'z'; caracter++) {
            for (i = 0; i < cadena2.length(); i++) {
                if (caracter == cadena2.charAt(i)) {
                    contador++;
                }
            }
            if (contador == 0) {
                falta += caracter + " ";
            }
            contador = 0;
            
        }
        
        System.out.println("Las letras que faltan son: " + falta);
        
    }
    
}
