/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_adrian;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio5_adrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double num1, num2, num3, resultado; // variables para los datos a introducir por el usuario
        int opcion = 1;
        
        Scanner in = new Scanner(System.in);
        while (opcion != 0) { // mientras que la opción sea distinta de 0 nos pregunta que opción elegimos
            System.out.println("╔═══════════════════════════════════════════════════════════╗");
            System.out.println("║            Programa Calculadora de triángulos             ║");
            System.out.println("║                                                           ║");
            System.out.println("║ Debes introducir el número de la opción que desees usar   ║");
            System.out.println("║ de la calculadora. Las opciones son las siguientes:       ║");
            System.out.println("║   1. Calcular hipotenusa de un triángulo rectángulo       ║");
            System.out.println("║   2. Calcular el catero de un triángulo rectángulo        ║");
            System.out.println("║   3. Indicar si un triángulo es rectángulo, obtusángulo o ║");
            System.out.println("║      acutángulo                                           ║");
            System.out.println("║   4. Calcular el área de un triángulo                     ║");
            System.out.println("║   5. Calcular el perímetro de un triángulo rectángulo     ║");
            System.out.println("║                                                           ║");
            System.out.println("║   0. Salir del Programa                                   ║");
            System.out.println("╚═══════════════════════════════════════════════════════════╝");
            System.out.print("  Opción: ");
            opcion = in.nextInt();
            
            switch (opcion) { // dependiendo de la opción elegida
                case 1:
                    System.out.print("\n  Introduce el valor del cateto 1: ");
                    num1 = in.nextDouble(); // introducimos el primer valor
                    System.out.print("\n  Introduce el valor del cateto 2: ");
                    num2 = in.nextDouble(); // introducimos el segundo valor
                    resultado = Math.hypot(num1, num2); // hacemos la operación 
                    System.out.println("\n  La hipotenusa es: " + resultado); // mostramos el resultado
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("\n  Introduce el valor del cateto: ");
                    num1 = in.nextDouble();
                    System.out.print("\n  Introduce el valor de la hipotenusa: ");
                    num2 = in.nextDouble();
                    resultado = Math.sqrt((num2*num2)-(num1*num1));
                    System.out.println("\n  El cateto vale: " + resultado);
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("\n  Introduce el valor del cateto 1: ");
                    num1 = in.nextDouble();
                    System.out.print("\n  Introduce el valor del cateto 2: ");
                    num2 = in.nextDouble();
                    System.out.print("\n  Introduce el valor de la hipotenusa: ");
                    num3 = in.nextDouble();
                    if (num3 > (num1 + num2)) {
                        System.out.println("\n  El triángulo es obtusángulo");
                    }
                    if (num3 < (num1 + num2)) {
                        System.out.println("\n  El triángulo es acutángulo");
                    }
                    if (num3 == (num1 + num2)) {
                        System.out.println("\n  El triángulo es rectángulo");
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("\n  Introduce el valor de la base: ");
                    num1 = in.nextDouble();
                    System.out.print("\n  Introduce el valor de la altura: ");
                    num2 = in.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("\n  El área del triángulo es " + resultado/2);
                    System.out.println("");
                    break;
                case 5:
                    System.out.print("\n  Introduce el valor del lado 1: ");
                    num1 = in.nextDouble();
                    System.out.print("\n  Introduce el valor del lado 2: ");
                    num2 = in.nextDouble();
                    System.out.print("\n  Introduce el valor del lado 3: ");
                    num3 = in.nextDouble();
                    resultado = num1 + num2 + num3;
                    System.out.println("\n  El perímetro del triángulo es " + resultado);
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
