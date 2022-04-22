/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_ficheros_02_escribir_en_un_fichero;

import java.io.BufferedReader;
import java.io.File;
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
public class Ejercicios_ficheros_02_Escribir_en_un_fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        FileWriter fichero = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        String contenido;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce la ruta absoluta de un fichero: ");
            String ruta = br.readLine();
            
            
            do {
                System.out.println("Escribe el contenido del fichero: ");
                contenido = br.readLine();
                fichero = new FileWriter(ruta);
                pw = new PrintWriter(fichero);
                pw.println(contenido);
            }while (contenido != "");
            
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{                    
                if( null != fichero ){   
                   fichero.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
        
        
        
        
    }

}
