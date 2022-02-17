/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_basico_03;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_basico_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor
        de los dos. Si son iguales indicarlo también. Ves cambiando los valores para
        comprobar que funciona.
        */
        int num1;
        int num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        num1 = in.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = in.nextInt();
        if (num1 == num2) {
            System.out.println(num1 + " es igual que " + num2);
        }
        else if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        }
        else {
            System.out.println(num1 + " es mayor que " + num2);
        }
    }
    
}
