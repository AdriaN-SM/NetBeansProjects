/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_adrian;

/**
 *
 * @author adrian solanas
 */
public class Ejercicio3_adrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero, multiplicador;
        
        
        System.out.println("TABLAS DE MULTIPLICAR");
        
        for (numero = 1; numero <= 10; numero++) {
            System.out.println("");
            System.out.println("Tabla de multiplicar del " + numero);
            for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
                System.out.println(numero + " x " + multiplicador + " = " + numero*multiplicador);
            }
        }
        
    }
    
}
