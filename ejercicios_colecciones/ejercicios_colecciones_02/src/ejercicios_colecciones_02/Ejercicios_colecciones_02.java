/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_colecciones_02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 *
 *
 * @since 28.03.2022
 * Fecha de modificación: 28.03.2022
 * @author Adrian Solanas
 */
public class Ejercicios_colecciones_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<iFigura2D> figuras = new ArrayList<>();
        figuras.add(new Cuadrado(4));
        figuras.add(new Circulo(2.3));
        figuras.add(new Triangulo(10.3, 12, 12, 10));
        figuras.add(new Rectangulo(13.6, 33.9));
        
        System.out.println("/////////////////////////");
        System.out.println("//  FIGURAS INICIALES  //");
        System.out.println("/////////////////////////");
        imprimir(figuras);
        
        escala(figuras, 2);
        System.out.println("///////////////////////////////");
        System.out.println("//  Figuras escaladas a 2.0  //");
        System.out.println("///////////////////////////////");
        imprimir(figuras);
        
    }
    
    public static void imprimir(ArrayList<iFigura2D> f) {
        System.out.println("El número de figuras es: " + f.size());
        System.out.println("");
        Iterator<iFigura2D> it = f.iterator();
        while(it.hasNext()) {
            it.next().imprimir();
            System.out.println("****************************");
        }
    }
    
    public static void escala(ArrayList<iFigura2D> f, double escala) {
        Iterator<iFigura2D> it = f.iterator();
        while(it.hasNext()) {
            it.next().escalar(escala);
        }
    }

}
