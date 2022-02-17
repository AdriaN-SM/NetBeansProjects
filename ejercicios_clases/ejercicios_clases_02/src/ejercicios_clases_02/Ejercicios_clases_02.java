/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_clases_02;

import java.util.Scanner;

/**
 *
 *
 *
 * @since 13.01.2022
 * Fecha de modificación: 13.01.2022
 * @author Adrian Solanas
 */
public class Ejercicios_clases_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ladoR1x=0, ladoR1y=0, ladoR2x=0, ladoR2y=0;
        
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        
        System.out.println("Bienvenido al programa de los rectángulos.");
        System.out.println("\nRectángulo 1:");
        System.out.print("Introduce el valor de x1: ");
        r1.x1 = entradaEntero();
        System.out.print("Introduce el valor de y1: ");
        r1.y1 = entradaEntero();
        System.out.print("Introduce el valor de x2: ");
        r1.x2 = entradaEntero();
        System.out.print("troduce el valor de y2: ");
        r1.y2 = entradaEntero();
        
        System.out.println("\nRectángulo 2:");
        System.out.print("Introduce el valor de x1: ");
        r2.x1 = entradaEntero();
        System.out.print("Introduce el valor de y1: ");
        r2.y1 = entradaEntero();
        System.out.print("Introduce el valor de x2: ");
        r2.x2 = entradaEntero();
        System.out.print("Introduce el valor de y2: ");
        r2.y2 = entradaEntero();
        
        //RECTÁNGULO 1
        //x
        if (r1.x1 > r1.x2) {
            ladoR1x = r1.x1 - r1.x2;
        }
        else if (r1.x1 < r1.x2) {
            ladoR1x = r1.x2 - r1.x1;
        }
        //y
        if (r1.y1 > r1.y2) {
            ladoR1y = r1.y1 - r1.y2;
        }
        else if (r1.y1 < r1.y2) {
            ladoR1y = r1.y2 - r1.y1;
        }
        
        
        //RECTÁNGULO 2
        //x
        if (r2.x1 > r2.x2) {
            ladoR2x = r2.x1 - r2.x2;
        }
        else if (r2.x1 < r2.x2) {
            ladoR2x = r2.x2 - r2.x1;
        }
        //y
        if (r2.y1 > r2.y2) {
            ladoR2y = r2.y1 - r2.y2;
        }
        else if (r2.y1 < r2.y2) {
            ladoR2y = r2.y2 - r2.y1;
        }
        
        int perimetroR1 = (ladoR1x * 2) + (ladoR1y * 2);
        int perimetroR2 = (ladoR2x * 2) + (ladoR2y * 2);
        
        int areaR1 = ladoR1x * ladoR1y;
        int areaR2 = ladoR2x * ladoR2y;
        
        System.out.println("\nCoordenadas del Rectángulo 1: (" + r1.x1 + ", " + r1.y1 + ") y (" + r1.x2 + ", " + r1.y2 + ")");
        System.out.println("Coordenadas del Rectángulo 2: (" + r2.x1 + ", " + r2.y1 + ") y (" + r2.x2 + ", " + r2.y2 + ")");
        System.out.println("El perímetro del Rectángulo 1 es: " + perimetroR1);
        System.out.println("El perímetro del Rectángulo 2 es: " + perimetroR2);
        System.out.println("El área del Rectángulo 1 es: " + areaR1);
        System.out.println("El área del Rectángulo 2 es: " + areaR2);
        System.out.println("\nPrograma finalizado...");
        
    }
    
    public static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

}
