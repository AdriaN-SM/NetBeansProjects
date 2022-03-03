/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_repaso_h_p_e_06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 *
 *
 * @since 03.03.2022
 * Fecha de modificación: 03.03.2022
 * @author Adrian Solanas
 */
public class Ejercicios_repaso_H_P_E_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in =new Scanner(System.in);
        int N = (int) (Math.random() * 100 + 1);
        int[] arrEnteros = new int[N];
        int valor = 0;
        
        for (int i = 0; i < arrEnteros.length; i++) {
            arrEnteros[i] = (int) (Math.random() * 10 + 1);
        }
        do {
            try {
                System.out.println("¿Qué posición quieres consultar?");
                valor = in.nextInt();
                System.out.println("La posición " + valor + " es " + arrEnteros[valor]);
            }catch(InputMismatchException ime) {
                System.err.println("No has introducido un número");
                in.nextLine();
            }catch(ArrayIndexOutOfBoundsException aiobe) {
                System.err.println("El número está fuera del rango del array");
                System.out.println("La longitud del array es " + (arrEnteros.length-1));
            }
        }while(valor >= 0);
    }

}
