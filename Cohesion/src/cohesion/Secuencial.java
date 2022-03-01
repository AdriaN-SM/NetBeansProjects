package cohesion;


import java.util.Scanner;


/**
 *  Secuencia de llamadas a metodos
 */
public class Secuencial {
    
    public String  ObtenerRaizCuadrada(){
        
        return String.valueOf(Math.sqrt(new Scanner(System.in).nextDouble()));
        
    }
    
    
}
