/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo3v1.pkg0;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumnoDAM
 */
public class Trabajo3v10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String []nombre = {"manzana ---> 1.2€","pera ---> 1.3€","sandia ---> 2.5€","melon ---> 1.8€","naranja ---> 0.8€","uva ---> 2€","melocoton ---> 1.5€","platano ---> 1.8€","kiwi ---> 1€","cereza ---> 1.1€"};
        Scanner tecladoString = new Scanner(System.in);
        System.out.println("╔═════════════════════════╗");
        System.out.println("║          MENU           ║");
        System.out.println("║                         ║");
        System.out.println("║  1. Añadir producto     ║");
        System.out.println("║  2. Eliminar producto   ║");
        System.out.println("║  3. Crear factura       ║");
        System.out.println("╚═════════════════════════╝");
        int opciones =0;
        int factura = 0;
        int opcion =0;
        String producto ;
        int numF =0;
        double total =0, precio = 0;
        double media = 0;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Elige la opción:");
        opciones = teclado.nextInt();

        switch (opciones) {
            case 1:
                System.out.println("-------------------------");
                System.out.println("Los productos:");
                //System.out.println(nombre.length);
                productos();
                AñadeProducto();


            break;

            case 2:
            productos();
            eliminarProducto();

            break;


            case 3:

                    System.out.println("Los productos:");
                    productos();
                    System.out.println("---------------------------------");
                        System.out.println("Cuantas facturas quiere: ");
                        factura = teclado.nextInt();
                        while(numF<factura){
                        numF=numF+1;
                        System.out.println("---------------------------------");   
                        System.out.println("Factura nº " + numF);
                        System.out.print("Escriba el producto: "); 
                        producto = tecladoString.nextLine();  
                        System.out.print("Escriba el precio en €: ");
                        precio= teclado.nextDouble();
                        total = precio + total;
                        media = total / factura;
                    } 

                      do{
                      System.out.println("---------------------------------");
                      System.out.println("Quiere consultar estas opciones:");
                      System.out.println("╔════════════════════════════════╗");
                      System.out.println("║  1. Facturación Total      ║");
                      System.out.println("║  2. Facturación Media      ║");
                      System.out.println("║  3. Factura mayor y menor  ║");
                      System.out.println("║  4. Consulta factura mayor ║");
                      System.out.println("╚════════════════════════════════╝");
                      System.out.println("Para terminar pulse 0");
                      opciones = teclado.nextInt();


                      switch(opciones){

                          case 1:

                              facturaTotal(total);
                          break;

                          case 2:
                              facturaMedia(media);
                          break;

                          case 3:
                             compararFactura(precio, numF);

                          break;

                          case 4:

                          break;

                      }
                      }while(opciones!=0) ;
            break;

        }
    }
    
        public static void AñadeProducto(){
            String []nombre = {"manzana ---> 1.2€","pera ---> 1.3€","sandia ---> 2.5€","melon ---> 1.8€","naranja ---> 0.8€","uva ---> 2€","melocoton ---> 1.5€","platano ---> 1.8€","kiwi ---> 1€","cereza ---> 1.1€"};
            Scanner tecladoString = new Scanner(System.in);
            int tamArray = nombre.length;
                        nombre = Arrays.copyOf(nombre, tamArray + 1);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Añade un producto de la forma producto ---> precio (1.2€):");
                        //System.out.println(nombre.length);

                        nombre[nombre.length-1]= tecladoString.nextLine();
                        System.out.println("*******************");
                        Arrays.sort(nombre);
                        for(int i = 0; i < nombre.length; i++){
                            System.out.println(nombre[i]);
                        }

        }
        public static void eliminarProducto(){
            String []nombre = {"manzana ---> 1.2€","pera ---> 1.3€","sandia ---> 2.5€","melon ---> 1.8€","naranja ---> 0.8€","uva ---> 2€","melocoton ---> 1.5€","platano ---> 1.8€","kiwi ---> 1€","cereza ---> 1.1€"};
            Scanner tecladoString = new Scanner(System.in);
            int tamArray = nombre.length;
                        nombre = Arrays.copyOf(nombre, tamArray + 1);
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Añade un producto de la forma producto ---> precio (1.2€):");
                        //System.out.println(nombre.length);

                        nombre[nombre.length-1]= tecladoString.nextLine();
                        System.out.println("*******************");
                        Arrays.sort(nombre);
                        for(int i = 0; i < nombre.length; i++){
                            System.out.println(nombre[i]);
                        }

        }

        public static void productos(){
           String []nombre = {"manzana ---> 1.2€","pera ---> 1.3€","sandia ---> 2.5€","melon ---> 1.8€","naranja ---> 0.8€","uva ---> 2€","melocoton ---> 1.5€","platano ---> 1.8€","kiwi ---> 1€","cereza ---> 1.1€"};
           Arrays.sort(nombre);
                        for(int i = 0; i < nombre.length; i++){
                            System.out.println(nombre[i]);
                        }

        }

   
        
        public static void facturaTotal(double total){
                
                System.out.println("La facturación total es: ");
                System.out.println(total + "€");                     
        }
        
        public static double facturaMedia(double media){
            
                 System.out.println("La facturacion media es: ");
                 System.out.println(media + "€");  
                 return media;
        }
    
        public static void compararFactura(double precio, int numF){
            double comparar =0;
            double comparar1 =0;
            if(numF ==1){
                comparar = comparar + precio; 
            }
            if(numF ==2){
                comparar1 = comparar1 + precio; 
            }
            if(comparar < comparar1){
                System.out.println("La factura con mayor importe es: " + comparar);
            }else{
                System.out.println("La factura con mayor importe es: " + comparar1);
            }
        }
    }



