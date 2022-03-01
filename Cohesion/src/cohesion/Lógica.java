package cohesion;


import java.util.Scanner;


/**
 * Relacion entre elementos de diferente tipo 
 */
public class Lógica {
    
    
    public class EntradasSalidas{
        
        private Scanner scanner = new Scanner(System.in);
        
        public String leerTexto(){
            return scanner.nextLine();
        }
        
        public Integer leerEntero(){
            return Integer.valueOf(scanner.nextLine());
        }
        
        public Double leerReal(){
            return Double.valueOf(scanner.nextLine());
        }
        
        public void  mostrarTexto(String texto){
            System.out.print(texto);
        }
        
        public void  mostrarEntero(Integer entero){
            System.out.print(entero);
        }
        
        public void  mostrarReal(Double real){
            System.out.print(real);
        }
    }
    
}
