/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java2_05;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_java2_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número para calcular su cuadrado: ");
        num1 = in.nextInt();
        while (num1 >= 0) {
            System.out.println("El cuadrado de " + num1 + " es " + num1*num1);
            System.out.print("Introduce otro número: ");
            num1 = in.nextInt();
        }
        System.out.println("ERROR. No se puede calcular el cuadrado de un número negativo.");
        
        
    }
    
}
