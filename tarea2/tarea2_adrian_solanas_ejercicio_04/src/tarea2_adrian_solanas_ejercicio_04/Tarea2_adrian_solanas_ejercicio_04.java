/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_adrian_solanas_ejercicio_04;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Tarea2_adrian_solanas_ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double num1, num2, resultado; // variables para los datos a introducir por el usuario
        int opcion = 1;
        
        Scanner in = new Scanner(System.in);
        while (opcion != 0) { // mientras que la opción sea distinta de 0 nos pregunta que opción elegimos
            System.out.println("╔═══════════════════════════════════════════════════════════╗");
            System.out.println("║                Programa Calculadora Básica                ║");
            System.out.println("║                                                           ║");
            System.out.println("║ Debes introducir el número de la opción que desees usar   ║");
            System.out.println("║ de la calculadora. Las opciones son las siguientes:       ║");
            System.out.println("║   1. Sumar                                                ║");
            System.out.println("║   2. Restar                                               ║");
            System.out.println("║   3. Multiplicar                                          ║");
            System.out.println("║   4. Dividir                                              ║");
            System.out.println("║                                                           ║");
            System.out.println("║   0. Salir del Programa                                   ║");
            System.out.println("╚═══════════════════════════════════════════════════════════╝");
            System.out.print("  Opción: ");
            opcion = in.nextInt();
            
            switch (opcion) { // dependiendo de la opción elegida
                case 1:
                    System.out.println("\n  Has seleccionado 'Sumar'");
                    System.out.print("\n  Introduce el primer valor: ");
                    num1 = in.nextDouble(); // introducimos el primer valor
                    System.out.print("\n  Introduce el segundo valor: ");
                    num2 = in.nextDouble(); // introducimos el segundo valor
                    resultado = num1 + num2; // hacemos la operación (en este caso sumar)
                    System.out.println("\n  El resultado de " + num1 + " + " + num2 + " = " + resultado); // mostramos el resultado
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("\n  Has seleccionado 'Restar'");
                    System.out.print("\n  Introduce el primer valor: ");
                    num1 = in.nextDouble();
                    System.out.print("\n  Introduce el segundo valor: ");
                    num2 = in.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("\n  El resultado de " + num1 + " - " + num2 + " = " + resultado);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("\n  Has seleccionado 'Multiplicar'");
                    System.out.print("\n  Introduce el primer valor: ");
                    num1 = in.nextDouble();
                    System.out.print("\n  Introduce el segundo valor: ");
                    num2 = in.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("\n  El resultado de " + num1 + " * " + num2 + " = " + resultado);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("\n  Has seleccionado 'Dividir'");
                    System.out.print("\n  Introduce el primer valor: ");
                    num1 = in.nextDouble();
                    System.out.print("\n  Introduce el segundo valor: ");
                    num2 = in.nextDouble();
                    resultado = num1 / num2;
                    System.out.println("\n  El resultado de " + num1 + " / " + num2 + " = " + resultado);
                    System.out.println("");
                    break;
                default: // esta es la opción 0 (Salir del Programa)
                    System.out.println("\nPrograma cerrado. Hasta pronto.");
                    System.out.println("");
                    break;
            }
        }
        
    }
    
}
