/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosumafuncion;

import java.util.Scanner;

/**
 *
 * Este programa consta de una función para sumar
 * 
 * Fecha de creación: 09/12/2021
 * Fecha de modificación: 09/12/2021
 * @version 1.0
 * @author Adrian Solanas
 */
public class EjemploSumaFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        int num2;
        int suma;
        //num1 = 5;
        //num2 = 6;
        
        System.out.println("Primer sumando: ");
        num1 = entradaEntero();
        System.out.println("Segundo sumando: ");
        num2 = entradaEntero();
        
        suma = Suma(num1, num2);
        System.out.println("La suma ahora es: " + Suma(num1, num2));
        
        System.out.println("La suma es: " + Suma(5, 3));
        
        Salida();
        System.out.println(suma);
        
    }
    
    static int Suma(int numero1, int numero2) {
        int suma;
        suma = numero1 + numero2;
        return suma;
    }
    
    public static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
    public static void Salida() {
        System.out.println("La suma es (soy la función salida): ");
    }
    
}
