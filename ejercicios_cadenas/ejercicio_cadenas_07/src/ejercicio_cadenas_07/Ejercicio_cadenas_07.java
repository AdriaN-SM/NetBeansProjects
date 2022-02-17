/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_cadenas_07;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_cadenas_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena1, cadena2 = "";
        int i;
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa una cadena para invertirla: ");
        cadena1 = in.nextLine();
        
        for (i = 0; i < cadena1.length(); i++) { // Con este bucle almacenamos cada caracter de la cadena 1 en la cadena 2 pero de forma invertida
            cadena2 = cadena1.charAt(i) + cadena2;
        }
        System.out.println("El resultado es: " + cadena2); // Mostramos el resultado
    }
    
}
