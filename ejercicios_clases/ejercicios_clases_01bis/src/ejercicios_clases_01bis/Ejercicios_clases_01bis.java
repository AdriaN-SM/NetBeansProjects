/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_clases_01bis;

import java.util.Scanner;

/**
 *
 *
 *
 * @since 12.01.2022
 * Fecha de modificación: 12.01.2022
 * @author Adrian Solanas
 */
public class Ejercicios_clases_01bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        System.out.println("Bienvenido al programa que crea personas.");
        System.out.println("\nPERSONA 1");
        System.out.println("\nIntroduce el Nombre de la persona 1: ");
        persona1.nombre = entradaString();
        System.out.println("Introduce los Apellidos de la persona 1: ");
        persona1.apellidos = entradaString();
        System.out.println("Introduce el DNI de la persona 1: ");
        persona1.dni = entradaString();
        System.out.println("Introduce la Edad de la persona 1: ");
        persona1.edad = entradaEntero();
        
        System.out.println("\nPERSONA 2");
        System.out.println("\nIntroduce el Nombre de la persona 2: ");
        persona2.nombre = entradaString();
        System.out.println("Introduce los Apellidos de la persona 2: ");
        persona2.apellidos = entradaString();
        System.out.println("Introduce el DNI de la persona 2: ");
        persona2.dni = entradaString();
        System.out.println("Introduce la Edad de la persona 2: ");
        persona2.edad = entradaEntero();
        
        
        if (persona1.edad >= 18) {
            System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " tiene " + persona1.edad + " años y por lo tanto es mayor de edad.");
        }
        else {
            System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " tiene " + persona1.edad + " años y por lo tanto es menor de edad.");
        }
        
        if (persona2.edad >= 18) {
            System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + " tiene " + persona2.edad + " años y por lo tanto es mayor de edad.");
        }
        else {
            System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + " tiene " + persona2.edad + " años y por lo tanto es menor de edad.");
        }
        
    }
    
    public static String entradaString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    
    public static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

}
