/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_funciones_01;

import java.util.Scanner;

/**
 *
 * Este programa consta de una función para que muestra una frase el número de
 * veces que se introducen por teclado.
 * 
 * Fecha de creación: 09/12/2021
 * Fecha de modificación: 09/12/2021
 * @version 1.0
 * @author Adrian Solanas
 */
public class Ejercicios_funciones_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Introduce un número entero: ");
        int num1 = Teclado(); //llamamos a la función para leer por teclado un número entero
        Ejecutando(num1); //ejecutamos la función para que muestre la frase el número de veces que hemos introducido por teclado
        System.out.println("\nPrograma finalizado...");
    }
    
    //función para mostrar la frase
    public static void Ejecutando(int num1) {
        while (num1 > 0) {
            System.out.println("Módulo ejecutándose");
            num1--;
        }
    }
    
    //función para leer por teclado
    public static int Teclado() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
}
