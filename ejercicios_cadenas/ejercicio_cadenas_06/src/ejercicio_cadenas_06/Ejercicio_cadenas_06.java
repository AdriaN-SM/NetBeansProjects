/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_cadenas_06;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_cadenas_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena1, palabra = "", test = " ";
        int i;
        double por1, por2, contador = 0, p1 = 0, p2 = 0;
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        cadena1 = in.nextLine();
        cadena1 = cadena1 + " ";
        
        for (i = 0; i < cadena1.length(); i++) { // Para toda la longitud de la cadena
            palabra += cadena1.charAt(i); // Añadimos ese caracter a la variable 'palabra'
            if (cadena1.charAt(i) == ' ') { // Si el caracter es un espacio en blanco
                palabra = palabra.trim(); // Eliminamos el espacio en blanco de la variable
                if (palabra.length() < 5) { // Si la longitud de la palabra es menor que 5
                    p1++; // Sumamos 1 al contador de palabras que tienen menos de 5 carácteres
                }
                else { // Sino, 
                    p2++; // le sumamos 1 al contador de palabras que tienen 5 o más carácteres
                }
                palabra = ""; // Establecemos la palabra en blanco
                contador++; // Sumamos 1 al contador de palabras
            }
        }
        por1 = p1/contador * 100; // Calculamos el porcentaje de palabras que tienen menos de 5 carácteres
        
        por2 = 100-por1; // Calculamos el porcentaje de palabras que tienen 5 o más carácteres
        
        System.out.println("Hay un " + por1 + " % de palabras con menos de 5 carácteres"); // Mostramos resultado
        System.out.println("Hay un " + por2 + " % de palabras con 5 o más carácteres"); // Mostramos resultado
        
    }
    
}
