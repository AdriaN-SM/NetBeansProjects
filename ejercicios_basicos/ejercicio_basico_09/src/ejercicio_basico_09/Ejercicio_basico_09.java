/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_basico_09;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_basico_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float num1;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número para ver si se puede dividir entre 2:");
        num1 = in.nextFloat();
        if (num1 % 2 == 0) {
            System.out.println("El número es divisible entre 2");
        }
        else {
            System.out.println("El número no es divisible entre 2");
        }
        
        
    }
    
}
