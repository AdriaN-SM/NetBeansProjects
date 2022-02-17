/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_funciones_10;

import java.util.Scanner;

/**
 *
 * Escribe una función que muestre un menú por pantalla para hallar el área de un
 * cuadrado, un rectángulo y un triángulo. Además, escribe funciones para hallar las áreas de los
 * tres polígonos. El programa ha de ser recursivo, solo se podrá salir pulsando el cero.
 *
 *
 * @since 17.12.2021
 * Fecha de modificación: 17.12.2021
 * @author Adrian Solanas
 */
public class Ejercicios_funciones_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int option = 1;
        int num1, num2, num3;
        
        
        while (option != 0) {
            menu();
            option = entradaEntero();
            
            switch (option) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                default:
                    System.out.println("\nPrograma finalizado...");
                    break;
            }
        }
        
    }
    
    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                    Calculadora de Áreas                    ║");
        System.out.println("║                                                            ║");
        System.out.println("║ Debes introducir el número de la opción que desees usar.   ║");
        System.out.println("║ Las opciones son las siguientes:                           ║");
        System.out.println("║                                                            ║");
        System.out.println("║   1. Calcular el área de un Cuadrado                       ║");
        System.out.println("║   2. Calcular el área de un Rectángulo                     ║");
        System.out.println("║   3. Calcular el área de un Triángulo                      ║");
        System.out.println("║                                                            ║");
        System.out.println("║   0. Salir del Programa                                    ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.print("  Opción: ");
    }
    
    public static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

}
