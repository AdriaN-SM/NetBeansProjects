/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_repaso_examen_05;

import java.util.Scanner;

/**
 * Escribe un programa con un menú que pida resolver ecuaciones de primer grado 
 * o de segundo grado, según pida el usuario. El programa finalizará cuando el 
 * usuario pulse el cero dese el menú.
 * 
 * @author adria
 */
public class Ejercicio_repaso_examen_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int option = 1;
        double x, a, r;
        
        Scanner in = new Scanner(System.in);
        while (option != 0) {
            System.out.println("╔═════════════════════════════════════════════════════════╗");
            System.out.println("║                    ECUACIONEITOR 3000                   ║");
            System.out.println("║                                                         ║");
            System.out.println("║ Este programa resuelve ecuaciones de primer y segundo   ║");
            System.out.println("║ grado, elige que tipo de ecuación quieres resolver:     ║");
            System.out.println("║                                                         ║");
            System.out.println("║   1. Ecuación de primer grado                           ║");
            System.out.println("║   2. Ecuación de segundo grado                          ║");
            System.out.println("║                                                         ║");
            System.out.println("║   0. Salir del Programa                                 ║");
            System.out.println("╚═════════════════════════════════════════════════════════╝");
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("\nEcuación de primer grado.");
                    System.out.println("\nIntroduce el valor de X: ");
                    x = in.nextDouble();
                    System.out.println("\nIntroduce el valor de X: ");
                    x = in.nextDouble();
                    break;
                case 2:
                    System.out.println("Introduce una ecuación de segundo grado: ");
                    break;
            }
        }
        
    }
    
}
