/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java2_07;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_java2_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, i = 0;
        String nombre;
        int aleatorio = (int) Math.floor(Math.random()*999);
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Intenta adivinar el número aleatorio entre 0 y 999");
        System.out.print("Introduce tu nombre: ");
        nombre = in.nextLine();
        System.out.print("Introduce un número: ");
        num1 = in.nextInt();
        while (num1 != aleatorio) {
            if (num1 > aleatorio) {
                System.out.print(num1 + " es mayor que el número aleatorio: ");
                num1 = in.nextInt();
            }
            else if (num1 < aleatorio) {
                System.out.print(num1 + " es menor que el número aleatorio: ");
                num1 = in.nextInt();
            }
            i++;
        }
        System.out.println("FELICIDADES " + nombre + " has acertado el número en " + i + " intentos.");
    }
    
}
