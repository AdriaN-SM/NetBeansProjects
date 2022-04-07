/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_colecciones_map_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import javax.swing.plaf.basic.BasicScrollPaneUI;

/**
 *
 *
 *
 * @since 07.04.2022
 * Fecha de modificación: 07.04.2022
 * @author Adrian Solanas
 */
public class Ejercicios_colecciones_map_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap <Integer, String> map1 = new HashMap <Integer, String>();
        TreeMap <Integer, String> map2 = new TreeMap<Integer, String>();
        LinkedHashMap <Integer, String> map3 = new LinkedHashMap <Integer, String>();
        //Rellenamos el HashMap
        map1.put(1, "Casillas");
        map1.put(15, "Ramos");
        map1.put(3, "Pique");
        map1.put(5, "Puyol");
        map1.put(11, "Capdevila");
        map1.put(14, "Xabi Alonso");
        map1.put(16, "Busquets");
        map1.put(8, "Xavi Hernandez");
        map1.put(18, "Pedrito");
        map1.put(6, "Iniesta");
        map1.put(7, "Villa");
        
        //Imprimimos el HashMap mediante un Iterator
        Iterator it = map1.keySet().iterator();
        System.out.println("--**HASHMAP**--");
        while(it.hasNext()){
          Integer key = (Integer) it.next();
          System.out.println("Clave: " + key + " -> Valor: " + map1.get(key));
        }
        
        //Rellenamos el TreeMap
        map2.put(1, "Casillas");
        map2.put(15, "Ramos");
        map2.put(3, "Pique");
        map2.put(5, "Puyol");
        map2.put(11, "Capdevila");
        map2.put(14, "Xabi Alonso");
        map2.put(16, "Busquets");
        map2.put(8, "Xavi Hernandez");
        map2.put(18, "Pedrito");
        map2.put(6, "Iniesta");
        map2.put(7, "Villa");
        
        it = map2.keySet().iterator();
        System.out.println("\n--**TREEMAP**--");
        while(it.hasNext()){
          Integer key = (Integer) it.next();
          System.out.println("Clave: " + key + " -> Valor: " + map2.get(key));
        }
        
        //Rellenamos el LinkedHashMap
        map3.put(1, "Casillas");
        map3.put(15, "Ramos");
        map3.put(3, "Pique");
        map3.put(5, "Puyol");
        map3.put(11, "Capdevila");
        map3.put(14, "Xabi Alonso");
        map3.put(16, "Busquets");
        map3.put(8, "Xavi Hernandez");
        map3.put(18, "Pedrito");
        map3.put(6, "Iniesta");
        map3.put(7, "Villa");
        
        it = map3.keySet().iterator();
        System.out.println("\n--**LINKEDHASHMAP**--");
        while(it.hasNext()){
          Integer key = (Integer) it.next();
          System.out.println("Clave: " + key + " -> Valor: " + map3.get(key));
        }
        
        //Segunda parte del ejercicio
        System.out.println("\nEl número de elementos del TreeMap es: " 
                + map2.size());
        if (map2.isEmpty())
            System.out.println("El mapa está vacio");
        else
            System.out.println("El mapa contiene elementos");
        System.out.println("Elementos 6, 7 y 3");
        System.out.println(map2.get(6) + "\n" + map2.get(7) + "\n" + map2.get(3));
        System.out.println("Borramos el elemento con clave 18: " + map2.remove(18));
        System.out.println("Comprobamos que pasa si llamamos al elemento que "
                + "acabamos de borrar (18): " + map2.get(18));
        System.out.println("Comprobamos si existe un eleento con clave 18: " 
                + map2.containsKey(18));
        System.out.println("Comprobamos si existe un eleento con clave 1: " 
                + map2.containsKey(1));
        System.out.println("Comprobamos si existe un eleento con valor 'Villa': " 
                + map2.containsValue("Villa"));
        System.out.println("Comprobamos si existe un eleento con valor 'Maradona': " 
                + map2.containsValue("Maradona"));
        System.out.println("Eliminamos todos los elementos del Map");
        map2.clear();
        System.out.println("El número de elementos del TreeMap es: " 
                + map2.size());
        if (map2.isEmpty())
            System.out.println("El mapa está vacio");
        else
            System.out.println("El mapa contiene elementos");
    }

}
