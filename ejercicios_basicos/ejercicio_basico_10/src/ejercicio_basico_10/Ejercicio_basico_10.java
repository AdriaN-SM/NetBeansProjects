/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_basico_10;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_basico_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número para saber que caracter es en ASCII:");
        num1 = in.nextInt();
        if (num1 >= 0 && num1 < 256) {
            char convertido = (char)num1;
            System.out.println(num1 + " es igual a: " + convertido);
        }
        else {
            System.out.println("ERROR. El número debe ser entre 0-255");
        }
        
    }
    
}
