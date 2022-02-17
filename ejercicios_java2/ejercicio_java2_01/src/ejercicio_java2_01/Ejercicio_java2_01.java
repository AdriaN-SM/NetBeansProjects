/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java2_01;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_java2_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        int num2;
        int cifras = 0;
        
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número del 0 al 9999: ");
        num1 = in.nextInt();
        if (num1 >= 0 && num1 <= 9999) {
            num2 = num1;
            while (num1 != 0) {
                num1 = num1/10;
                cifras++;
            }
            System.out.println("El número " + num2 + " tiene " + cifras + " cifras.");
        }
        else {
            System.out.println("ERROR. Debes introducir un número del 0 al 9999.");
        }
        
    }
    
}
