/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_herenciapolimorfismo_02_interfaces;

/**
 *
 *
 *
 * @since 02.02.2022
 * Fecha de modificación: 02.02.2022
 * @author Adrian Solanas
 */
public class Ejercicios_herenciaPolimorfismo_02_Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        
        iFigura2D[] figuras = new iFigura2D[8];
        figuras[0] = new Cuadrado(12);
        figuras[1] = new Cuadrado(7);
        figuras[2] = new Rectangulo(15, 5);
        figuras[3] = new Rectangulo(21, 14);
        figuras[4] = new Triangulo(10, 12, 12, 10);
        figuras[5] = new Triangulo(11, 3, 3, 20);
        figuras[6] = new Circulo(5);
        figuras[7] = new Circulo(12);
        
        System.out.println("FIGURAS INICIALES");
        System.out.println("");
        for (i = 0; i < figuras.length; i++) {
            figuras[i].imprimir();
            System.out.println("*************************");
            figuras[i].escalar(2);
        }
        
        System.out.println("");
        System.out.println("FIGURAS ESCALADAS A 2");
        System.out.println("");
        for (i = 0; i < figuras.length; i++) {
            figuras[i].imprimir();
            System.out.println("*************************");
            figuras[i].escalar(0.1);
        }
        
        System.out.println("");
        System.out.println("FIGURAS ESCALADAS A 0.1");
        System.out.println("");
        for (i = 0; i < figuras.length; i++) {
            figuras[i].imprimir();
            System.out.println("*************************");
        }
        
        
        System.out.println("\nPrograma finalizado...");
        
    }

}
