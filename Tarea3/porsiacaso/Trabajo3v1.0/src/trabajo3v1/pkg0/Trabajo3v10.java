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
    public static String[] nombre = {"manzana ---> 1.2€",
                                    "pera ---> 1.3€",
                                    "sandia ---> 2.5€",
                                    "melon ---> 1.8€",
                                    "naranja ---> 0.8€",
                                    "uva ---> 2€",
                                    "melocoton ---> 1.5€",
                                    "platano ---> 1.8€",
                                    "kiwi ---> 1€",
                                    "cereza ---> 1.1€"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opciones;
        Scanner tecladoString = new Scanner(System.in);
        do {
            System.out.println("╔═════════════════════════════╗");
            System.out.println("║          MENU           ║");
            System.out.println("║                         ║");
            System.out.println("║  1. Añadir producto     ║");
            System.out.println("║  2. Eliminar producto   ║");
            System.out.println("║  3. Crear factura       ║");
            System.out.println("╚═════════════════════════════╝");
            
            int factura = 0;
            int opcion =0;
            
            Scanner teclado = new Scanner (System.in);
            System.out.println("Elige la opción:");
            opciones = teclado.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("Los productos:");
                    //System.out.println(nombre.length);
                    productos();
                    AgnadeProducto();


                    break;

                case 2:
                    productos();
                    eliminarProducto();

                    break;


                case 3:
                    
                    String producto;
                    int numF = 0;
                    double cantidad = 0;
                    double total = 0, precio = 0;
                    double media = 0;
                    System.out.println("Los productos:");
                    productos();
                    System.out.println("---------------------------------");
                    System.out.println("Cuantas facturas quiere: ");
                    factura = teclado.nextInt();
                    double[] totalF = new double[factura];
                    int i = 0;
                    while(numF<factura){
                        double total1 = 0;
                        numF=numF+1;
                        System.out.println("---------------------------------");   
                        System.out.println("Factura nº " + numF);
                        do {
                            System.out.print("Escriba el nombre del producto (F para salir): "); 
                            producto = tecladoString.nextLine(); 
                            if (producto.equals("F") == false) {
                                System.out.print("Escriba la cantidad (en Kg): ");
                                cantidad = teclado.nextDouble();
                                System.out.print("Escriba el precio en €: ");
                                precio= teclado.nextDouble();
                                System.out.println("");
                                total = total + (precio * cantidad);
                                total1 = total1 + (precio * cantidad);
                            }
                            
                        }while(producto.equals("F") == false);
                        totalF[i] = total1;
                        i++;
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
                    opcion = teclado.nextInt();


                    switch(opcion){

                        case 1:

                            facturaTotal(total);
                            break;

                        case 2:
                            facturaMedia(media);
                            break;

                        case 3:
                            compararFactura(totalF);

                            break;

                        case 4:
                            facturaMayor(totalF);
                            break;
                    }
                }while(opcion!=0) ;
                break;

            }
            
        }while(opciones != 0);
    }
    
        public static void AgnadeProducto(){
            String nombreP;
            double precio;
            Scanner tecladoString = new Scanner(System.in);
            int tamArray = nombre.length + 1;
            nombre = Arrays.copyOf(nombre, tamArray);
            System.out.println("----------------------------------------------------------");
            System.out.println("Añade un producto:");
            System.out.println("Nombre del producto: ");
            nombreP = tecladoString.nextLine();
            System.out.println("Precio del producto: ");
            precio = tecladoString.nextDouble();
            
            nombre[tamArray-1] = nombreP + " ---> " + precio + "€";
            System.out.println("*******************");

        }
        public static void eliminarProducto(){
            //String []nombre = {"manzana ---> 1.2€","pera ---> 1.3€","sandia ---> 2.5€","melon ---> 1.8€","naranja ---> 0.8€","uva ---> 2€","melocoton ---> 1.5€","platano ---> 1.8€","kiwi ---> 1€","cereza ---> 1.1€"};
            int numP;
            Scanner tecladoString = new Scanner(System.in);
            System.out.println("----------------------------------------------------------");
            System.out.println("Elimina un producto:");
            System.out.println("Número de producto: ");
            numP = tecladoString.nextInt();
            
            nombre[numP - 1] = "z";
            Arrays.sort(nombre);
            nombre = Arrays.copyOf(nombre, nombre.length - 1);
            System.out.println("*******************");

        }

        public static void productos(){
           //String []nombre = {"manzana ---> 1.2€","pera ---> 1.3€","sandia ---> 2.5€","melon ---> 1.8€","naranja ---> 0.8€","uva ---> 2€","melocoton ---> 1.5€","platano ---> 1.8€","kiwi ---> 1€","cereza ---> 1.1€"};
            Arrays.sort(nombre);
            System.out.println("Productos:");
            for(int i = 0; i < nombre.length; i++){
                System.out.println((i+1) + "." + nombre[i]);
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
        
        public static void compararFactura(double[] totalF){
            double mayor = 0;
            
            for(int i = 0; i < totalF.length; i++){
                if(mayor < totalF[i]){
                    mayor = totalF[i];
                }
            }
            double menor = mayor;
            for(int i = 0; i < totalF.length; i++){
                if(menor > totalF[i]){
                    menor = totalF[i];
                }
            }
            if(mayor == menor){
                System.out.println("Las dos facturas valen " + mayor + "€");
            }
            System.out.println("La factura mayor es de " + mayor + "€");
            System.out.println("La factura menor es de " + menor + "€");
        }
        
        public static void facturaMayor(double[] totalF){
            Scanner teclado = new Scanner(System.in);
            double cantidad;
            System.out.println("Escriba la cantidad de referencia: ");
            cantidad = teclado.nextDouble();
            for(int i = 0; i < totalF.length; i++){
                if(totalF[i] >= cantidad){
                    System.out.println("Hay una factura de " + totalF[i] + "€");
                }
            }
            
        }
    }



