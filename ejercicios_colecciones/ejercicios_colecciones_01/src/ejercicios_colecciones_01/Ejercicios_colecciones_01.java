/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_colecciones_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 *
 *
 * @since 25.03.2022
 * Fecha de modificación: 25.03.2022
 * @author Adrian Solanas
 */
public class Ejercicios_colecciones_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto p1 = new Producto("Manzana", 15); 
        Producto p2 = new Producto("Pera", 25);
        Producto p3 = new Producto("Melón", 55);
        Producto p4 = new Producto("Cereza", 5);
        Producto p5 = new Producto("Melocotón", 8);
        
        ArrayList <Producto> listaProd = new ArrayList<>();
        
        listaProd.add(p1);
        listaProd.add(p2);
        listaProd.add(p3);
        listaProd.add(p4);
        listaProd.add(p5);
        
        visualizar(listaProd);
        System.out.println("******************************");
        System.out.println("Eliminamos el producto nº 2 y 3");
        listaProd.remove(1);
        listaProd.remove(2);
        
        visualizar(listaProd);
        System.out.println("******************************");
        System.out.println("Añadumos un producto a la posición 3");
        listaProd.add(2, p1);
        
        visualizar(listaProd);
        System.out.println("******************************");
        listaProd.clear();
        visualizar(listaProd);
    }
    
    public static void visualizar(ArrayList listaProd) {
        int i=1;
        Iterator it = listaProd.iterator();
        System.out.println("La lista tiene " + listaProd.size() + " elementos.");
        while (it.hasNext()) {
            System.out.println(i + ". " + it.next());
            i++;
        }
//        for (Iterator<Producto> it = listaProd.iterator(); it.hasNext(); i++) {
//            System.out.println(i + ". " + it.next());
//        }
    }
    
}
