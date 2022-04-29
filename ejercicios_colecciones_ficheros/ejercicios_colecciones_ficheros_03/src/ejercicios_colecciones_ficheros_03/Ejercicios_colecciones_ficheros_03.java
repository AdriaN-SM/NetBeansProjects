/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_colecciones_ficheros_03;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 *
 *
 * @since 28.04.2022
 * Fecha de modificación: 28.04.2022
 * @author Adrian Solanas
 */
public class Ejercicios_colecciones_ficheros_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a1 = new Animal("Perro", 4);
        Animal a2 = new Animal("Gato", 4);
        Animal a3 = new Animal("Pato", 2);
        Animal a4 = new Animal("Pingüino", 2);
        Animal a5 = new Animal("Cebra", 4);
        
        List<Animal> arrAnimales = new ArrayList<>();
        arrAnimales.add(a1);
        arrAnimales.add(a2);
        arrAnimales.add(a3);
        arrAnimales.add(a4);
        arrAnimales.add(a5);
        
        List<Animal> arrAnimales2 = new ArrayList<>();
        
        //Escribir en el fichero
        ObjectOutputStream fichEscribir = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("./animales.txt");
            fichEscribir = new ObjectOutputStream(fos);
            for (int i = 0; i<arrAnimales.size(); i++) {
                fichEscribir.writeObject(arrAnimales.get(i));
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
        
        //Leer los objetos del fichero
        
        ObjectInputStream fichLeer = null;
        try {
            boolean hayDatos = true;
            Animal animal;
            fichLeer = new ObjectInputStream(new FileInputStream("./animales.txt"));
            System.out.println("\nLos datos de los coches recuperados del fichero son: ");
            while (hayDatos) {
                try {
                    animal = (Animal) fichLeer.readObject();
                    System.out.println(animal);
                    arrAnimales2.add(animal);
                }catch(EOFException e) {
                    hayDatos = false; //Para salir del bucle usamos la excepcion "EndOfFile"
                }
            }
            System.out.println("\nFichero recorride completamente");
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
        
        System.out.println("************************************");
        System.out.println("Objetos de la segunda lista:");
        Iterator it = arrAnimales2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
