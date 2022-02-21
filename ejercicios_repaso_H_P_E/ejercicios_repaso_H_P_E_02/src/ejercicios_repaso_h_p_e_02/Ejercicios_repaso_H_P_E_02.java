/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_repaso_h_p_e_02;

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
public class Ejercicios_repaso_H_P_E_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int A;
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        try{
            A = in.nextInt();
            System.out.println("Valor introducido: " + A);
        }
        catch(InputMismatchException ime) {
            System.err.println("Valor introducido incorrecto");
        }
        
        
        
    }

}
