/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java2_06;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_java2_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número para saber si es par o impar: ");
        num1 = in.nextInt();
        while (num1 != 0) {
            if (num1 % 2 == 0) {
                System.out.println("El número " + num1 + " es par.");
            }
            else {
                System.out.println("El número " + num1 + " es impar.");
            }
            System.out.print("Introduce otro número: ");
            num1 = in.nextInt();
        }
        System.out.println("FIN ;)");
        
    }
    
}
