/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java2_11;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_java2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, i, j;
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el número del lado para dibujar el cuadrado: ");
        num1 = in.nextInt();
        
        for (i = 0; i < num1; i++) {
            for (j = 0; j < num1; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        
    }
    
}
