/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_basico_08;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_basico_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float radio;
        float longitud;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el radio para calcular la longitud de la circunferencia: ");
        radio = in.nextFloat();
        longitud = (float) (Math.PI * 2 * radio);
        System.out.println("La longitud de la circunferencia es: " + longitud);
                
    }
    
}
