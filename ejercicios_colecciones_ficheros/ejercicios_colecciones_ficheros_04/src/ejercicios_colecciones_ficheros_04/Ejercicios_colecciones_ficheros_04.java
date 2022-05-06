/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones_ficheros_04;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.List;

/**
 *
 *
 *
 * @since 29.04.2022 Fecha de modificación: 29.04.2022
 * @author Adrian Solanas
 */
public class Ejercicios_colecciones_ficheros_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Futbolista f1 = new Futbolista("Iker", "Casillas", "01");
        Futbolista f2 = new Futbolista("David", "Villa", "07");
        Futbolista f3 = new Futbolista("Luis", "Violeta", "05");
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
        
        List<Futbolista> listaFutbolistas2 = new ArrayList<>();
        
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
                    listaFutbolistas2.add(futbolista);
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
        FileWriter fw = null;
        PrintWriter pw = null;
        int iguales = 0;
        int diferentes = 0;
        //Escribir en el fichero los resultados
        try {
            fw = new FileWriter("./resultados.txt");
            pw = new PrintWriter(fw);
            for (int i = 0; i<listaFutbolistas.size(); i++) {
                if (listaFutbolistas.get(i).compareTo(listaFutbolistas2.get(i)) == 0) {
                    pw.println("El elemento nº" + (i+1) + " es igual en las dos listas.");
                    iguales++;
                } else {
                    pw.println("El elemento nº" + (i+1) + " es diferente en las dos listas.");
                    diferentes++;
                }
            }
            pw.println("Total de elementos iguales: " + iguales);
            pw.println("Total de elementos diferentes: " + diferentes);
        }catch(FileNotFoundException fnfe) {
            System.err.println("Error, no se encuentra el fichero");
        }catch(IOException ioe) {
            System.err.println("Error E/S: " + ioe.getMessage());
        }finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            }catch(IOException ex) {
                System.err.println("Error al cerrar el fichero: " + ex.getMessage());
            }
        }
        
        //LEER EL FICHERO
        System.out.println("Lectura del fichero de resultados:");
        File archivo = archivo = new File ("./resultados.txt");
        FileReader fr = null;
        BufferedReader br = null;
        try {

            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            if(archivo.exists()){
                String linea;
                while((linea=br.readLine())!=null) {
                    System.out.print(linea+"\n");
                }
            }else{
                System.out.println("EL FICHERO NO EXISTE ANIMAL");
            }
            System.out.println("");
        }
        catch(FileNotFoundException filenot){
            System.err.println("El fichero no existe");

        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
                if( null != fr ){   
                   fr.close();     
                }
                br.close();
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
        System.out.println("Fin del programa...");
    }

}
