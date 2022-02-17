/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_basico_07;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_basico_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float radio;
        float area;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el radio para calcular el área del círculo: ");
        radio = in.nextFloat();
        area = (float) (Math.PI * Math.pow(radio, 2));
        System.out.println("El área del circulo es: " + area);
        
        
    }
    
}
