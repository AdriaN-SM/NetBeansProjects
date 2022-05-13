/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_repaso_examen3ev_02;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 *
 *
 * @since 13.05.2022
 * Fecha de modificación: 13.05.2022
 * @author Adrian Solanas
 */
public class Ejercicios_repaso_examen3ev_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro l1 = new Libro("Antes de volar", "Amanda Ruz", new Isbn(1));
        Libro l2 = new Libro("Después de volar", "Amanda Ruz", new Isbn(2));
        Libro l3 = new Libro("Piensa en java", "Rufino", new Isbn(3));
        Libro l4 = new Libro("El niño del pijama de rallas", "Pablo", new Isbn(4));
        Libro l5 = new Libro("Gerónimo Stilton 1", "Ratilla", new Isbn(5));
        
        List<Libro> listaLibros = new LinkedList<>();
        
        listaLibros.add(l1);
        listaLibros.add(l2);
        listaLibros.add(l3);
        listaLibros.add(l4);
        listaLibros.add(l5);
        
        HashMap<Integer, Libro> mapLibros = new HashMap<>();
        for (int i = 0; i<listaLibros.size(); i++) {
            mapLibros.put(listaLibros.get(i).getIsbn().getIsbnValor(), listaLibros.get(i));
        }
        
        //Escribir en el fichero
        ObjectOutputStream fichEscribir = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("./libros.dat");
            fichEscribir = new ObjectOutputStream(fos);
            Iterator<Integer> it = mapLibros.keySet().iterator();
            while (it.hasNext()) {
                Integer clave = it.next();
                Libro valor = mapLibros.get(clave);
                fichEscribir.writeObject(valor);
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
        
        System.out.println("\nLECTURA DE LOS OBJETOS DEL FICHERO");
        //Leer los objetos del fichero
        ObjectInputStream fichLeer = null;
        try {
            boolean hayDatos = true;
            Libro libro;
            fichLeer = new ObjectInputStream(new FileInputStream("./libros.dat"));
            while (hayDatos) {
                try {
                    libro = (Libro) fichLeer.readObject();
                    System.out.println(libro);
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
        
        
        
    }

}
