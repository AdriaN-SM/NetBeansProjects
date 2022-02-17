/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testeos;

import java.util.Arrays;
import java.util.Scanner;
import testeos.Testeos.Producto;

/**
 *
 *
 *
 * @since 09.02.2022
 * Fecha de modificación: 09.02.2022
 * @author Adrian Solanas
 */
public class Testeos {
    
    public static Producto[] arrProductos = new Producto[10];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion;
        
        
        arrProductos[0] = new Producto("Manzana reineta", 4.70);
        arrProductos[1] = new Producto("Manzana golden", 1.69);
        arrProductos[2] = new Producto("Manzana fuji", 1.49);
        arrProductos[3] = new Producto("Pera de agua", 1.95);
        arrProductos[4] = new Producto("Sandía", 2.75);
        arrProductos[5] = new Producto("Melón", 3.25);
        arrProductos[6] = new Producto("Naranja", 1.20);
        arrProductos[7] = new Producto("Mandarina", 1.15);
        arrProductos[8] = new Producto("Kiwi", 2.29);
        arrProductos[9] = new Producto("Plátano", 2.79);
        
        System.out.println("*****************************************");
        System.out.println("* BIENVENIDO AL PROGRAMA DE FACTURACIÓN *");
        System.out.println("*            DE LA FRUTERÍA             *");
        
        
        do {
            Menu();
            System.out.print("* Elige una opción: ");
            opcion = entradaEntero();
            Opciones(opcion, arrProductos);
        } while (opcion != 0);
        
    }//main
    
    public static void Opciones(int opcion, Producto[] arrProductos) {
        switch (opcion) {
            case 1:
                //Ver la lista de productos
                String volver;
                mostrarLista();
                System.out.print("\nIntroduce 'v' para volver: ");
                do {
                    volver = entradaString();
                    volver = volver.toLowerCase();
                    if (volver.equals("v") == false) {
                        System.out.print("Debes introducir 'v' para volver: ");
                    }
                }while(volver.equals("v") == false);
                break;
            case 2:
                //Añadir un producto nuevo a la lista
                agnadirProducto();
                break;
            case 3:
                //Eliminar un producto de la lista
                eliminarProducto();
                break;
            case 4:
                //Crear x facturas
                System.out.println("*            CREAR FACTURAS:");
                break;
            default:
                //Salir y control de errores
                if (opcion == 0) {
                    System.out.println("Programa finalizado...");
                }
                else {
                    System.out.println("ERROR. Opción Incorrecta");
                }
                break;
        }
    }//Opciones
    
    public static void Menu() {
        System.out.println("*****************************************");
        System.out.println("*           MENU DE OPCIONES:           *");
        System.out.println("* 1. Ver la lista de productos          *");
        System.out.println("* 2. Añadir un producto                 *");
        System.out.println("* 3. Eliminar un producto               *");
        System.out.println("* 4. Crear factura/s                    *");
        System.out.println("*                                       *");
        System.out.println("* 0. Salir del programa                 *");
        System.out.println("*****************************************");
        
        
//        System.out.println("* 4. Facturación Total                  *");
//        System.out.println("* 5. Facturación Media                  *");
//        System.out.println("* 6. Factura mayor y menor              *");
//        System.out.println("* 7. Facturas mayores de X              *");
    }//menu
    
    public static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
    public static double entradaDouble() {
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
    
    public static String entradaString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    
    public static void agnadirProducto() {
        String nombre;
        double precio;
        int posicion;
        
        mostrarLista();
        
        System.out.println("*          AÑADIR UN PRODUCTO:");
        System.out.print("* Nombre del producto: ");
        nombre = entradaString();
        System.out.print("* Precio (€/Kg): ");
        precio = entradaDouble();
        
        arrProductos = Arrays.copyOf(arrProductos, arrProductos.length + 1);
        posicion = arrProductos.length - 1;
        arrProductos[posicion] = new Producto(nombre, precio);
        mostrarLista();
//        System.arraycopy(arrProductos, 0, arrProductos, 0, arrProductos.length+1);
        
        System.out.println("\nEl producto '" + nombre + "' se ha añadido con un precio de " + precio + " €/Kg");
    }
    
    public static void eliminarProducto() {
        int producto, posicion;
        
        mostrarLista();
        
        System.out.println("*         ELIMINAR UN PRODUCTO:");
        System.out.print("* Introduce el número de producto a eliminar: ");
        producto = entradaEntero();
        producto -= 1;
        
        System.out.println("* El producto '" + arrProductos[producto].getNombre() + "' a " + arrProductos[producto].getPrecio() + " €/Kg se ha eliminado correctamente.");
        
        arrProductos[producto].setNombre("ZZZZZZZZZZZZZZZZZZZZ");
        arrProductos[producto].setPrecio(0.0);
        Arrays.sort(arrProductos);
        posicion = arrProductos.length;
        
        arrProductos = Arrays.copyOf(arrProductos, posicion - 1);
        
    }
    
//    public static void facturas() {
//        
//    }
    
    public static void mostrarLista() {
        int i;
        
        Arrays.sort(arrProductos);
        System.out.println("*          LISTA DE PRODUCTOS:");
        for (i = 0; i < arrProductos.length; i++) {
            System.out.print("* " + (i+1) + ". ");
            arrProductos[i].mostrar();
        }
    }
    
    
    public static class Producto implements Comparable<Producto> {
        String nombre;
        Double precio;
        

        public Producto() {
        }
        
        public Producto(String nombre, Double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Double getPrecio() {
            return precio;
        }

        public void setPrecio(Double precio) {
            this.precio = precio;
        }
        
        public void mostrar() {
            System.out.println(nombre + ": " + precio + " €/Kg");
        }

        @Override
        public int compareTo(Producto o) {
            return this.nombre.compareToIgnoreCase(o.nombre);
        }
        
        
    }

}
