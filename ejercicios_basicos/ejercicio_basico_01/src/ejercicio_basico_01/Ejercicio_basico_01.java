/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_basico_01;

/**
 *
 * @author adrian
 * 
 * 
 * Declara dos variables numéricas (con el valor que desees), muestra por consola la
 * suma, resta, multiplicación, división y módulo (resto de la división).
 * 
 * v1.0
 */
import java.util.Scanner;
public class Ejercicio_basico_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double num1;
        double num2;
        double resultado;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num1 = in.nextDouble();
        System.out.println("Introduce otro número: ");
        num2 = in.nextDouble();
        resultado = num1 + num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + resultado);
        resultado = num1 - num2;
        System.out.println("La resta de " + num1 + " - " + num2 + " es: " + resultado);
        resultado = num1 * num2;
        System.out.println("La multiplicación de " + num1 + " * " + num2 + " es: " + resultado);
        resultado = num1 / num2;
        System.out.println("La division de " + num1 + " entre " + num2 + " es: " + resultado);
        resultado = num1 % num2;
        System.out.println("El módulo de " + num1 + " y " + num2 + " es: " + resultado);
        
        
        
        
        
        
    }
    
}
