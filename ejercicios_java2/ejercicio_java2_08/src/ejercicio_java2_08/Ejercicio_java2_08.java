/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java2_08;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_java2_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2 = 0;
        
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número para sumar: ");
        num1 = in.nextInt();
        while (num1 != 0) {
            num2 = num2 + num1;
            System.out.print("Introduce otro número para sumar: ");
            num1 = in.nextInt();
        }
        System.out.println("La suma total es: " + num2);
        
    }
    
}
