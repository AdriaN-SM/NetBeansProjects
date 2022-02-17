/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java2_02;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_java2_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float nota;
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce una nota de 0 a 10: ");
        nota = in.nextFloat();
        if (nota >= 0 && nota <= 10) {
            if (nota >= 0 && nota < 5) {
            System.out.println("Una nota de " + nota + " es del tipo INSUFICIENTE :(");
            }
            else if (nota >= 5 && nota < 6) {
                System.out.println("Una nota de " + nota + " es del tipo SUFICIENTE");
            }
            else if (nota >= 6 && nota < 7) {
                System.out.println("Una nota de " + nota + " es del tipo BIEN");
            }
            else if (nota >= 7 && nota < 9) {
                System.out.println("Una nota de " + nota + " es del tipo NOTABLE :)");
            }
            else if (nota >= 9 && nota <= 10) {
                System.out.println("Una nota de " + nota + " es del tipo SOBRESALIENTE ;)");
            }
        }
        else {
            System.out.println("ERROR. El número debe ser del 0 al 10.");
        }
        
        
        
    }
    
}
