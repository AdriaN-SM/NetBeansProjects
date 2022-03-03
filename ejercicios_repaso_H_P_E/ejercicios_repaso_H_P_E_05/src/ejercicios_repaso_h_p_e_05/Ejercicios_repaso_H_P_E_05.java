/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_h_p_e_05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Enunciado:
 * Implementa un programa que cree un vector tipo double de tamaño 5 y luego, utilizando
 * un bucle, pida cinco valores por teclado y los introduzca en el vector. Tendrás que manejar la/las
 * posibles excepciones y seguir pidiendo valores hasta rellenar completamente el vector.
 *
 * @author Adrián
 */
public class Ejercicios_repaso_H_P_E_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        double[] arrDoubles = new double[5];
        Scanner in = new Scanner(System.in);
        
        for(i = 0; i < arrDoubles.length; i++) {
            try {
                System.out.print("Introduce el valor nº" + (i+1) + ": ");
                arrDoubles[i] = in.nextDouble();
            }
            catch (InputMismatchException ime) {
                System.err.println("El valor introducideo es incorrecto.");
                in.nextLine();
                i--;
            }
            catch (ArrayIndexOutOfBoundsException aibe) {
                System.err.println("Has introducido demasiados valores.");
            }
        }
        
        
    }
    
}
