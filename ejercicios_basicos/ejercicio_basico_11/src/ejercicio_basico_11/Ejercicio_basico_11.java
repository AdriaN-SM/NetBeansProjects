/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_basico_11;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_basico_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float precio;
        float precio_final;
        
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el un precio sin IVA para saber el precio final: ");
        precio = in.nextFloat();
        if (precio > 0) {
            precio_final = (float) (precio * 1.21);
            System.out.println("El precio con IVA incluido es: " + precio_final);
        }
        else {
            System.out.println("ERROR. Debes introducir un valor decimal positivo.");
        }
        
    }
    
}
