/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo1_punto;

/**
 *
 *
 *
 * @since 10.01.2022
 * Fecha de modificación: 10.01.2022
 * @author Adrian Solanas
 */
public class Ejemplo1_Punto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        
        p1.x = 0.0;
        p1.y = 0.0;
        
        p2.x = 0.0;
        p2.y = 0.0;
        
        double distanciaOrigen = Math.sqrt(p2.x*p2.y - p1.x*p1.y);
        System.out.println("Distancia origen = " + distanciaOrigen);
        
    }

}
