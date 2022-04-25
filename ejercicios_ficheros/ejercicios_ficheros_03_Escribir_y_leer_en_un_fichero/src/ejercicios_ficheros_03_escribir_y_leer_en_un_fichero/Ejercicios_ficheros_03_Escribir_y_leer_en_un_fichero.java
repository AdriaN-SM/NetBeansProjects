/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_ficheros_03_escribir_y_leer_en_un_fichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 *
 *
 * @since 22.04.2022
 * Fecha de modificación: 22.04.2022
 * @author Adrian Solanas
 */
public class Ejercicios_ficheros_03_Escribir_y_leer_en_un_fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String opcion;
        
        do {
            System.out.println("*************************************");
            System.out.println("* Menú:                             *");
            System.out.println("* 1. Crear fichero                  *");
            System.out.println("* 2. Mostrar contenido del fichero  *");
            System.out.println("*                                   *");
            System.out.println("* 3. Salir del programa             *");
            System.out.println("*************************************");
            System.out.print("Opción: ");
            opcion = teclado();
            menu(opcion);
        }while(opcion.equals("3")== false);
    }
    
    public static String teclado() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static void menu(String opcion) throws IOException {
        switch(opcion) {
            case "1":
                escribirFichero();
                break;
            case "2":
                leerFichero();
                break;
            default:
                System.out.println("Cerrando el programa...");
                System.exit(0);
        }
    }
    
    public static void escribirFichero () {
        FileWriter fw = null;
        PrintWriter pw = null;
        String fichero = null;
        try {
            System.out.print("Introduce el nombre del fichero de texto:");
            fichero = teclado();
            fw = new FileWriter("./"+fichero);
            System.out.print("Introduce tu Nombre: ");
            String nombre = teclado();
            pw = new PrintWriter(fw);
            pw.println("Nombre: " + nombre);
            System.out.print("Introduce tus Apellidos: ");
            String apellidos = teclado();
            pw.println("Apellidos: " + apellidos);
            System.out.print("Introduce tu Ciudad de Nacimiento: ");
            String ciudad = teclado();
            pw.println("Ciudad de Nacimiento: " + ciudad);
            
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            try{                    
                if( null != fw ){   
                   fw.close();
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
    }
    public static void leerFichero() throws IOException {
        System.out.print("Introduce el nombre del fichero que deseas leer: ");
        String fichero = teclado();
        File archivo = archivo = new File (fichero);
        FileReader fr = null;
        try {

            fr = new FileReader (archivo);
            int caracter;
            if(archivo.exists()){
                while((caracter=fr.read())!=-1)
                System.out.print((char)caracter);
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
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
    }
    
}
