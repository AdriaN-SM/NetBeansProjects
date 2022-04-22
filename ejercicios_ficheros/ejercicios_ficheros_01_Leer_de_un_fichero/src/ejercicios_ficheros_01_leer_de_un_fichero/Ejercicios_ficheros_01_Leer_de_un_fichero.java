/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_ficheros_01_leer_de_un_fichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 *
 *
 * @since 21.04.2022
 * Fecha de modificación: 21.04.2022
 * @author Adrian Solanas
 */
public class Ejercicios_ficheros_01_Leer_de_un_fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        File archivo = null;
        FileReader fr = null;

        try {
            archivo = new File (".\\Ejercicio1.txt");
            fr = new FileReader (archivo);
            int caracter;
            if(archivo.exists()){
                while((caracter=fr.read())!=-1)
                if (caracter != ' ') {
                    System.out.print((char)caracter);
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
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
    }
}