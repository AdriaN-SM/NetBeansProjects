/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_clases_01;

import java.util.Scanner;

/**
 *
 *
 *
 * @since 12.01.2022
 * Fecha de modificación: 12.01.2022
 * @author Adrian Solanas
 */
public class Ejercicios_clases_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1 = new Persona("Adrián", "Solanas Marín", 20, "17466993B");
        Persona persona2 = new Persona("Jorge", "Solanas Marín", 20, "17466994N");
        
        System.out.println(persona1.Mostrar(persona1));
        persona1.mayorEdad(20);
        System.out.println(persona2.Mostrar(persona2));
        persona2.mayorEdad(20);
        
    }
    
    public static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

}
