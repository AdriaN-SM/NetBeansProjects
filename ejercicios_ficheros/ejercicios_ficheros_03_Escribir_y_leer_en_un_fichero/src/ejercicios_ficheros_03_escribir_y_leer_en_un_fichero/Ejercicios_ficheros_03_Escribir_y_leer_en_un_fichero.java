/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_ficheros_03_escribir_y_leer_en_un_fichero;

import java.io.BufferedReader;
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
        }while(opcion != "3");
        
    }
    
    public static String teclado() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static void menu(String opcion) throws IOException {
        switch(opcion) {
            case "1":
                FileWriter fw = null;
                PrintWriter pw = null;
                try {
                    System.out.print("Introduce el nombre del fichero de texto:");
                    String fichero = teclado();
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
                
                
                break;
            case "2":
                break;
            default:
                System.out.println("Cerrando el programa...");
                break;
        }
    }
    
    
}
