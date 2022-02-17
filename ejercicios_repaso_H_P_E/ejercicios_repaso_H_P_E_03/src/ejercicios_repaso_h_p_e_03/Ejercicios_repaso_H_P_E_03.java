/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_repaso_h_p_e_03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 *
 *
 * @since 16.02.2022
 * Fecha de modificación: 16.02.2022
 * @author Adrian Solanas
 */
public class Ejercicios_repaso_H_P_E_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int A, B;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa divide A entre B.");
        System.out.print("Introduce el número A: ");
        try {
            A = in.nextInt();
            System.out.print("Introduce el número B: ");
            try {
                B = in.nextInt();
                try {
                    System.out.println("El resultado de " + A + "/" + B + " es: " + (A/B));
                }
                catch (ArithmeticException ae) {
                    System.out.println("No se puede dividir entre 0.");
                }
            }
            catch (InputMismatchException ime) {
                System.out.println("Valor introducido incorrecto.");
            }
        }
        catch (InputMismatchException ime) {
            System.out.println("Valor introducido incorrecto.");
        }
        
        
    }

}
