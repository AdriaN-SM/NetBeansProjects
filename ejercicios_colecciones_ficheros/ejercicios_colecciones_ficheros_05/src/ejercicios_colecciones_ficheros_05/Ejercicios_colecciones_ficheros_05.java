/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_colecciones_ficheros_05;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 *
 *
 * @since 12.05.2022
 * Fecha de modificación: 12.05.2022
 * @author Adrian Solanas
 */
public class Ejercicios_colecciones_ficheros_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Futbolista f1 = new Futbolista("Iker", "Casillas", "01");
        Futbolista f2 = new Futbolista("David", "Villa", "07");
        Futbolista f3 = new Futbolista("Luis", "Violeta", "06");
        Futbolista f4 = new Futbolista("Luis", "Suárez", "12");
        Futbolista f5 = new Futbolista("Carles", "Puyol", "05");

        List<Futbolista> listaFutbolistas = new ArrayList<>();
        //Introducimos los futbolistas en la lista
        listaFutbolistas.add(f1);
        listaFutbolistas.add(f2);
        listaFutbolistas.add(f3);
        listaFutbolistas.add(f4);
        listaFutbolistas.add(f5);

        System.out.println("Lista sin ordenar:");
        for (int i = 0; i < listaFutbolistas.size(); i++) {
            System.out.println(listaFutbolistas.get(i));
        }
        sort(listaFutbolistas);
        System.out.println("-------------------------");
        System.out.println("Lista ordenada:");
        for (int i = 0; i < listaFutbolistas.size(); i++) {
            System.out.println(listaFutbolistas.get(i));
        }
        
        //Escribir en el fichero
        ObjectOutputStream fichEscribir = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("./futbolistas.dat");
            fichEscribir = new ObjectOutputStream(fos);
            for (int i = 0; i<listaFutbolistas.size(); i++) {
                fichEscribir.writeObject(listaFutbolistas.get(i));
            }
        }catch(FileNotFoundException fnfe) {
            System.err.println("Error, no se encuentra el fichero");
        }catch(IOException ioe) {
            System.err.println("Error E/S: " + ioe.getMessage());
        }finally {
            try {
                if (fos != null) {
                    fichEscribir.close();
                }
            }catch(IOException ex) {
                System.err.println("Error al cerra el fichero: " + ex.getMessage());
            }
        }
        
        LinkedHashMap<String, Futbolista> map1 = new LinkedHashMap<String, Futbolista>();
        
        System.out.println("\nLECTURA DE LOS OBJETOS DEL FICHERO");
        //Leer los objetos del fichero
        ObjectInputStream fichLeer = null;
        try {
            boolean hayDatos = true;
            Futbolista futbolista;
            fichLeer = new ObjectInputStream(new FileInputStream("./futbolistas.dat"));
            while (hayDatos) {
                try {
                    futbolista = (Futbolista) fichLeer.readObject();
                    System.out.println(futbolista);
                    map1.put(futbolista.getDorsal(), futbolista);
                }catch(EOFException e) {
                    hayDatos = false; //Para salir del bucle usamos la excepcion "EndOfFile"
                }
            }
            System.out.println("\nFichero recorrido completamente\n");
        }catch(ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }catch(IOException e) {
            System.err.println(e.getMessage());
        }finally {
            try {
                fichLeer.close();
            }catch(IOException e) {
                System.err.println(e.getMessage());
            }
        }
        
        System.out.println("");
        System.out.println(map1);
        
    }

}
