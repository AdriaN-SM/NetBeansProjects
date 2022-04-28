/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_ficheros_04;

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
 * @since 25.04.2022
 * Fecha de modificación: 25.04.2022
 * @author Adrian Solanas
 */
public class Ejercicios_ficheros_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //ESCRIBIR EN EL FICHERO
        FileWriter fw = null;
        PrintWriter pw = null;
        String fichero = null;
        try {
            System.out.print("Introduce el nombre del fichero a crear: ");
            fichero = teclado();
            fw = new FileWriter("./"+fichero+".txt");
            System.out.print("Introduce el contenido del fichero: ");
            String contenido = teclado();
            pw = new PrintWriter(fw);
            pw.println(contenido);
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
        //LEER EL FICHERO
        File archivo = archivo = new File ("./"+fichero+".txt");
        FileReader fr = null;
        BufferedReader br = null;
        try {

            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            if(archivo.exists()){
                String linea;
                while((linea=br.readLine())!=null) {
                    System.out.print(cambioMayusMinus(linea));
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
        
    }
    
    public static String teclado() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static String cambioMayusMinus(String texto){
        
        String cadena = "";
        
        for(int i = 0; i < texto.length(); i++){
            
            char caracter = texto.charAt(i);
            if(caracter == Character.toLowerCase(caracter)){
                caracter = Character.toUpperCase(caracter);
            }else{
                caracter = Character.toLowerCase(caracter);
            }
            
            cadena = cadena + caracter;
        }
        return cadena;
    }
}
