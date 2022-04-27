/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_colecciones_ficheros_02;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 *
 * @since 27.04.2022
 * Fecha de modificación: 27.04.2022
 * @author Adrian Solanas
 */
public class Ejercicios_colecciones_ficheros_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche c1 = new Coche("Toledo", "Seat");
        Coche c2 = new Coche("Ibiza", "Seat");
        Coche c3 = new Coche("M3", "BMW");
        Coche c4 = new Coche("11", "Renault");
        Coche c5 = new Coche("C15", "Citroen");
        
        List<Coche> arrCoches = new ArrayList<>();
        arrCoches.add(c1);
        arrCoches.add(c2);
        arrCoches.add(c3);
        arrCoches.add(c4);
        arrCoches.add(c5);
        
        ObjectOutputStream fichEscribir = null;
        try {
            FileOutputStream fos = new FileOutputStream("./coches.txt");
            fichEscribir = new ObjectOutputStream(fos);
            for (int i = 0; i<arrCoches.size(); i++) {
                fichEscribir.writeObject(arrCoches.get(i));
            }
        }catch(FileNotFoundException fnfe) {
            System.err.println("Error, no se encuentra el fichero");
        }catch(IOException ioe) {
            System.err.println("Error E/S: " + ioe.getMessage());
        }finally {
            try {
                if (fichEscribir != null) {
                    fichEscribir.close();
                }
            }catch(IOException ex) {
                System.err.println("Error al cerra el fichero: " + ex.getMessage());
            }
        }
        
        ObjectInputStream fichLeer = null;
        try {
            boolean hayDatos = true;
            Coche coche;
            fichLeer = new ObjectInputStream(new FileInputStream("./coches.txt"));
            System.out.println("\nLos datos de los coches recuperados del fichero son: ");
            while (hayDatos) {
                try {
                    coche = (Coche) fichLeer.readObject();
                    System.out.println(coche);
                }catch(EOFException e) {
                    hayDatos = false; //Para salir del bucle
                }
            }
            System.out.println("\nFichero recorrideo completamente");
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
        
    }

}
