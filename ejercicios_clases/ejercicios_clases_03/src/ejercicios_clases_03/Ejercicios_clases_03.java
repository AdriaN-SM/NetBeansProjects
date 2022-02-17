/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_clases_03;

import java.util.Scanner;

/**
 *
 *
 *
 * @since 19.01.2022
 * Fecha de modificación: 19.01.2022
 * @author Adrian Solanas
 */
public class Ejercicios_clases_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double descuento;
        int desc, cantidad;
        
        
        Articulo a1 = new Articulo("Pantalones", 50, 20);
        
        a1.mostrarInformacion();
        do {
            System.out.print("\nIntroduce el descuento a aplicar: ");
            descuento = entradaEntero();
        }while(descuento <= 0 || descuento >= 100);
        desc = (int) descuento;
        System.out.println("El precio con el " + desc + "% de "
                + "descuento es: " + a1.CalcularPVPDescuento(descuento));
        System.out.print("\nIntroduce la cantidad que quieres vender: ");
        cantidad = entradaEntero();
        if (a1.vender(cantidad) == true) {
            a1.mostrarInformacion();
        }
        System.out.print("\nIntroduce la cantidad que quieres almacenar: ");
        cantidad = entradaEntero();
        if (a1.almacenar(cantidad) == true) {
            a1.mostrarInformacion();
        }
        
        System.out.println("\n" + a1.toString());
        
        System.out.println("\nPrograma finalizado...");
        
    }
    
    private static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

}
