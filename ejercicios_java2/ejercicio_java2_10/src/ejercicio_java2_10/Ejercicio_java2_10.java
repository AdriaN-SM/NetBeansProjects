/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java2_10;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_java2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, i = 0;
        
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número para saber su tabla de multiplicar: ");
        num1 = in.nextInt();
        if (num1 <= 10 && num1 >= 0) {
            while (i <= 10) {
                System.out.println(num1 + " x " + i + " = " + num1*i);
                i++;
            }
        }
        else {
            System.out.println("ERROR. El número debe ser entre 0 y 10.");
        }
        
    }
    
}
