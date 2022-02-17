/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_funciones_02;

import java.util.Scanner;

/**
 *
 * Este programa recibe 2 números y calcula el máximo de los dos.
 * 
 * @since 09.12.2021
 * Versión 1.0
 * @author Adrian Solanas
 */
public class Ejercicios_funciones_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Este programa compara qué número es mayor de los 2 números enteros.");
        System.out.print("Introduce el primer número: ");
        int num1 = Numeros(); //pedimos los números por teclado
        System.out.print("Introduce el segundo número: ");
        int num2 = Numeros();
        int mayor = Maximo(num1, num2); //le pasamos los números a la función para que calcule el máximo
        if (mayor == 0) {
            System.out.println("Los números son iguales.");
        }
        else {
            System.out.println("El número mayor es " + mayor);
        }
        System.out.println("\nPrograma finalizado...");
        
    }
    
    //función para introducir números enteros por teclado
    public static int Numeros() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
    //función para calcular el máximo
    public static int Maximo(int num1, int num2) {
        int mayor;
        if (num1 > num2) {
            mayor = num1;
        }
        else if (num1 < num2) {
            mayor = num2;
        }
        else {
            mayor = 0;
        }
        return mayor;
    }

}
