/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea3_adrian_solanas;
import java.util.*;
import java.util.Scanner;

/**
 *
 *
 *
 * @since 10.01.2022
 * Fecha de modificación: 10.01.2022
 * @author Adrian Solanas
 */
public class Tarea3_adrian_solanas {
    //array de objetos en el que almacenamos los Productos
    public static Producto[] arrProductos = new Producto[10];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion;
        
        //añadimos los 10 productos predeterminamos al array
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
        
        //bucle general del programa
        do {
            Menu();//mostramos al usuario las opciones
            System.out.print("* Elige una opción: ");//pedimos al usuario que elija una opcion
            opcion = entradaEntero();
            Opciones(opcion);//entramos en la función de las opciones pasándole la opción elegida por el usuario como parámetro
        } while (opcion != 0);//do while
        
    }//main
    
    //función de las opciones del menú principal
    public static void Opciones(int opcion) {
        switch (opcion) {
            case 1:
                //Ver la lista de productos
                String volver;
                mostrarLista();//Llamamos a la funcion que muestra la lista de productos
                //bucle para volver al menú principal
                System.out.print("\nIntroduce 'v' para volver: ");
                do {
                    volver = entradaString();
                    volver = volver.toLowerCase();
                    if (volver.equals("v") == false) {
                        System.out.print("Debes introducir 'v' para volver: ");
                    }
                }while(volver.equals("v") == false);//do while
                break;
            case 2:
                //Añadir un producto nuevo a la lista
                agnadirProducto();//llamamos a la funcion de añadir productos a la lista
                break;
            case 3:
                //Eliminar un producto de la lista
                eliminarProducto();//llamamos a la funcion de eliminar productos de la lista
                break;
            case 4:
                //Crear x facturas
                facturas();//llamamos a la funcion para crear facturas
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
    
    //función que muestra el menú principal
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
    }//menu
    
    //función para introducir números tipo Integer por teclado
    public static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
    //función para introducir números tipo Double por teclado
    public static double entradaDouble() {
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
    
    //función para introducir cadenas de texto por teclado
    public static String entradaString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    
    //función para añadur un producto a la lista
    public static void agnadirProducto() {
        String nombre;
        double precio;
        int posicion;
        
        mostrarLista();//mostramos la lista
        
        //pedimos los datos del nuevo productos
        System.out.println("*          AÑADIR UN PRODUCTO:");
        System.out.print("* Nombre del producto: ");
        nombre = entradaString();
        System.out.print("* Precio (€/Kg): ");
        precio = entradaDouble();
        
        //creamos una copia del array con 1 hueco más
        arrProductos = Arrays.copyOf(arrProductos, arrProductos.length + 1);
        posicion = arrProductos.length - 1;//guardamos la posición en la que va el nuevo producto
        arrProductos[posicion] = new Producto(nombre, precio);//introducimos el nuevo producto
        
        System.out.println("\nEl producto '" + nombre + "' a " + precio + " €/Kg se ha añadido correctamente.");
    }
    
    //función para eliminar un producto de la lista
    public static void eliminarProducto() {
        int producto, posicion;
        
        mostrarLista();//mostramos la lista
        
        //pedimos al usuario que producto quiere eliminar
        System.out.println("*         ELIMINAR UN PRODUCTO:");
        System.out.print("* Introduce el número de producto a eliminar: ");
        producto = entradaEntero();
        producto -= 1;//le restamos 1 para coger la posición correcta del producto
        
        System.out.println("* El producto '" + arrProductos[producto].getNombre() + "' a " + arrProductos[producto].getPrecio() + " €/Kg se ha eliminado correctamente.");
        
        //le cambiamos el nombre al producto por 20 cetas para que cuando ordenemos
        // el array, el producto que quiere eliminar el usuario esté en la última posición
        // y asi poder generar una copia del array pero quitándole el último hueco, es decir,
        // quitándole el último producto, que es el elegido por el usuario.
        arrProductos[producto].setNombre("zzzzzzzzzzzzzzzzzzzz");
        arrProductos[producto].setPrecio(0.0);
        Arrays.sort(arrProductos);//ordenamos el array
        posicion = arrProductos.length;
        
        arrProductos = Arrays.copyOf(arrProductos, posicion - 1);
        
    }
    
    //funcion para mostrar la lista de productos
    public static void mostrarLista() {
        int i;
        
        Arrays.sort(arrProductos);//ordenamos el array por nombre de producto
        System.out.println("*           LISTA DE PRODUCTOS:");
        //con este bucle recorremos el array
        for (i = 0; i < arrProductos.length; i++) {
            System.out.print("* " + (i+1) + ". ");
            arrProductos[i].mostrar();//mostramos cada posición del array con el método mostrar definido en la clase Productos
        }
    }
    
    //función para crear facturas
    public static void facturas() {
        
        int numFacturas;
        String volver;
        double cantidad;
        double precio;
        double Total = 0;//facturación total
        double media = 0;
        
        //introducimos el número de facturas que vamos a crear
        System.out.println("*              CREAR FACTURA/S:");
        System.out.print("* ¿Cuantas facturas quieres crear? ");
        numFacturas = entradaEntero();
        mostrarLista();//mostramos la lista de productos
        //definimos un array en el que guardaremos el total de cada factura
        //su tamaño es igual al número de facturas
        double[] totalPorFactura = new double[numFacturas];
        int cont = 0;
        int i = 0;
        
        //bucle para crear facturas
        while(cont<numFacturas){
            int cont1 = 1;
            cont++;
            double totalFactura = 0;
            
            
            System.out.println("*****************************************");
            System.out.println("* Factura Nº." + cont + "                          *");
            
            //función para introducir la fecha de la factura
            fechaFactura(cont);
            
            //bucle para para introducir productos
            do {
                //bucle para verificar que se introduce almenos 1 producto en cada factura
                do {
                    System.out.print("*\n"
                                   + "* Introduce el nombre del producto a\n"
                                   + "* añadir o pulsa 'F' para pasar a la\n"
                                   + "* siguiente factura/salir: ");
                    volver = entradaString();
                    
                    if (volver.equals("F") == true && cont1 == 1) {
                        System.out.println("ERROR. Debes introducir almenos un producto por factura.");
                    }
                    else {
                        cont1++;
                    }
                }while (volver.equals("F") == true && cont1 == 1);//bucle para verificar que se introduce almenos 1 producto en cada factura
                
                //condición para seguir introduciendo el producto en la factura
                if (volver.equals("F") == false) {
                    System.out.print("* Introduce la cantidad (en Kg): ");
                    cantidad = entradaDouble();
                    System.out.print("* Introduce el precio (€/Kg): ");
                    precio = entradaDouble();
                    Total = Total + (precio * cantidad);
                    totalFactura = totalFactura + (precio * cantidad);
                }
                
            }while(volver.equals("F") == false);//bucle para introducir productos
            
            //cálculos de la factura
            media = Total/numFacturas;
            totalPorFactura[i] = totalFactura;//guardamos el total de cada factura
            i++;
            //cálculos de la factura
        }//bucle para introducir facturas
        
        int opcion;
        
        //bucle del menú de consultas de las facturas
        do {
            System.out.println("*****************************************");
            System.out.println("*              CONSULTAR:               *");
            System.out.println("* 1. Facturación Total                  *");
            System.out.println("* 2. Facturación Media                  *");
            System.out.println("* 3. Factura mayor y menor              *");
            System.out.println("*                                       *");
            System.out.println("* 4. Mostrar opciones 1, 2 y 3          *");
            System.out.println("*                                       *");
            System.out.println("* 5. Facturas mayores de X              *");
            System.out.println("*                                       *");
            System.out.println("* 0. No consultar nada                  *");
            System.out.println("*****************************************");
            System.out.print("* Opción: ");
            opcion = entradaEntero();
            switch (opcion) {
                case 1:
                    //Facturación Total
                    System.out.println("* La facturación total es: " + Total + "€.");
                    break;
                case 2:
                    //Facturación Media
                    System.out.println("* La facturación media es de: " + media + "€.");
                    break;
                case 3:
                    //Factura mayor y menor 
                    facturaMayorYMenor(totalPorFactura);//función para mostrar la factura de mayor importe y la de menor importe
                    break;
                case 4:
                    //Mostrar las opciones 1, 2, 3 
                    System.out.println("* La facturación total es: " + Total + "€.");
                    System.out.println("* La facturación media es de: " + media + "€.");
                    facturaMayorYMenor(totalPorFactura);
                    break;
                case 5:
                    //Facturas mayores de X
                    facturasMayorX(totalPorFactura);//función para mostrar las facturas mayores al importe introducido por el usuario
                    break;
                default:
                    //Salir y control de errores
                    if (opcion == 0) {
                        System.out.println("Saliendo de las consultas...");
                    }
                    else {
                        System.out.println("ERROR. Opción Incorrecta");
                    }
                    break;
            }
        }while(opcion != 0);//bucle del menú de consultas de las facturas
    }//función para crear facturas
    
    //creamos un array para guardar la fecha de la factura
    public static int[] arrFecha = new int[3];
    
    //función para introducir la fecha de la factura
    public static void fechaFactura(int cont) {
        String fecha, dias, meses, anyos;
        int dia, mes, anyo;
        boolean correcto = false;
        
        
        Scanner in = new Scanner(System.in);
        
        //bucle para verificar si la fecha es correcta
        do {
            //si es la primera factura, pedimos la fecha completa
            if (cont == 1) {
                System.out.println("Introduce la fecha de facturación.\n"
                                 + "El formato de la fecha debe ser dd-mm-aaaa (05-01-0123)");
                System.out.print("Introduce la fecha: ");
                fecha = in.nextLine();
                
                //filtro para comprobar que la fecha tiene el formato correcto
                if (fecha.length() == 10) { // Filtramos la fecha por longitud para que coincida con la del formato de ejemplo
                    if (fecha.charAt(2) == '-' && fecha.charAt(5) == '-') { // Comprobamos que haya 2 guiones en la posición 2 y 5
                        dias = fecha.substring(0, 2); // hacemos una subcadena para guardar el dia
                        meses = fecha.substring(3, 5); // hacemos una subcadena para guardar el mes
                        anyos = fecha.substring(6); // hacemos una subcadena para guardar el año
                        if (dias.charAt(0) >= '0' && dias.charAt(0) < '4' && dias.charAt(1) >= '0') { // filtramos los números que se pueden introducir en los 2 dígitos de la cadena dias
                            if (meses.charAt(0) == '0' || meses.charAt(0) == '1' && meses.charAt(1) >= '0' && meses.charAt(1) <= '2') { // filtramos los números que se pueden introducir en los 2 dígitos de la cadena meses
                                if (anyos.charAt(0) >= '0' && anyos.charAt(1) >= '0' && anyos.charAt(2) >= '0' && anyos.charAt(3) >= '0' ) { // filtramos los números que se pueden introducir en los 4 dígitos de la cadena años
                                    dia = Integer.valueOf(dias); // pasamos las variables dias, meses y años a integer
                                    mes = Integer.valueOf(meses);
                                    anyo = Integer.valueOf(anyos);
                                    if (dia <= 0) { // si el día es menor o igual a 0
                                        System.out.println("ERROR. El día debe ser superior a 0.");
                                    }
                                    else {
                                        //comprobamos que el día corresponde con el mes con la funcion comprobarDias
                                        if (comprobarDias(mes, dia, anyo) == true) {
                                            correcto = true;
                                            //guardamos la fecha en el array
                                            arrFecha[0] = dia;
                                            arrFecha[1] = mes;
                                            arrFecha[2] = anyo;
                                        }
                                    }
                                }
                                else {
                                    System.out.println("ERROR. Formato de año incorrecto.");
                                }
                            }
                            else {
                                System.out.println("ERROR. Formato de mes incorrecto.");
                            }
                        }
                        else {
                            System.out.println("ERROR. Formato de día incorrecto.");
                        }
                    }
                    else {
                        System.out.println("ERROR. Formato incorrecto. El formato de la fecha debe ser dd-mm-aaaa (05-01-0123)");
                    }
                }
                else {
                    System.out.println("ERROR. Formato incorrecto. El formato de la fecha debe ser dd-mm-aaaa (05-01-0123)");
                }//filtro para comprobar que la fecha tiene el formato correcto
            }
            
            //si no es la primera factura, pedimos solo el dia
            if (cont > 1) {
                mes = arrFecha[1];
                anyo = arrFecha[2];
                System.out.print("Introduce el día para el mes " + mes + ": ");
                dia = entradaEntero();
                //comprobamos que el día corresponde con el mes con la funcion comprobarDias
                if (comprobarDias(mes, dia, anyo) == true) {
                    correcto = true;
                }
            }
        }while(correcto == false);//bucle para verificar si la fecha es correcta
    }//función para introducir la fecha de la factura
    
    //funcion para comprobar que el dia corresponde al mes
    public static boolean comprobarDias(int mes, int dia, int anyo) {
        String sDia = String.valueOf(dia); // pasamos el dia, mes y año a String
        String sMes = String.valueOf(mes);
        String sAno = String.valueOf(anyo);
        if (sDia.length() == 1) { // si la longitud de la cadena del dia es 1
            sDia = "0" + sDia; // añadimos un 0 delante del dia
        }
        if (sMes.length() == 1) { // si la longitud de la cadena del mes es 1
            sMes = "0" + sMes; // añadimos un 0 delante de del mes
        }
        if (sAno.length() == 1) { // si la longitud de la cadena del año es 1
            sAno = "0" + sAno; // añadimos un 0 delante del año
        }
        
        switch (mes) { // dependiendo del mes introducido comprobamos los días
            case 1: // enero
                if (dia <= 31) { // enero tiene 31 días como máximo, asi que los días deben ser menores o igual a 31
                    System.out.println("* Fecha factura: " + sDia + "-" + sMes + "-" + sAno); // mostramos la fecha de la factura
                    System.out.println("* Factura de Enero"); // mes de facturación
                    return true;
                }
                else { // si los dias son superiores a 31, mensaje de error
                    System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                }
                break; // terminamos el case
            case 2:
                if (dia <= 28) {
                    System.out.println("* Fecha factura: " + sDia + "-" + sMes + "-" + sAno);
                    System.out.println("* Factura de Febrero");
                    return true;
                }
                else {
                    System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 28 días. :(");
                }
                break;
            case 3:
                if (dia <= 31) {
                    System.out.println("* Fecha factura: " + sDia + "-" + sMes + "-" + sAno);
                    System.out.println("* Factura de Marzo");
                    return true;
                }
                else {
                    System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                }
                break;
            case 4:
                if (dia <= 30) {
                    System.out.println("* Fecha factura: " + sDia + "-" + sMes + "-" + sAno);
                    System.out.println("* Factura de Abril");
                    return true;
                }
                else {
                    System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 30 días. :(");
                }
                break;
            case 5:
                if (dia <= 31) {
                    System.out.println("* Fecha factura: " + sDia + "-" + sMes + "-" + sAno);
                    System.out.println("* Factura de Mayo");
                    return true;
                }
                else {
                    System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                }
                break;
            case 6:
                if (dia <= 30) {
                    System.out.println("* Fecha factura: " + sDia + "-" + sMes + "-" + sAno);
                    System.out.println("* Factura de Junio");
                    return true;
                }
                else {
                    System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 30 días. :(");
                }
                break;   
            case 7:
                if (dia <= 31) {
                    System.out.println("* Fecha factura: " + sDia + "-" + sMes + "-" + sAno);
                    System.out.println("* Factura de Julio");
                    return true;
                }
                else {
                    System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                }
                break;    
            case 8:
                if (dia <= 31) {
                    System.out.println("* Fecha factura: " + sDia + "-" + sMes + "-" + sAno);
                    System.out.println("* Factura de Agosto");
                    return true;
                }
                else {
                    System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                }
                break;
            case 9:
                if (dia <= 30) {
                    System.out.println("* Fecha factura: " + sDia + "-" + sMes + "-" + sAno);
                    System.out.println("* Factura de Septiembre");
                    return true;
                }
                else {
                    System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 30 días. :(");
                }
                break;    
            case 10:
                if (dia <= 31) {
                    System.out.println("* Fecha factura: " + sDia + "-" + sMes + "-" + sAno);
                    System.out.println("* Factura de Octubre");
                    return true;
                }
                else {
                    System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                }
                break;    
            case 11:
                if (dia <= 30) {
                    System.out.println("* Fecha factura: " + sDia + "-" + sMes + "-" + sAno);
                    System.out.println("* Factura de Noviembre");
                    return true;
                }
                else {
                    System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 30 días. :(");
                }
                break;    
            case 12:
                if (dia <= 31) {
                    System.out.println("* Fecha factura: " + sDia + "-" + sMes + "-" + sAno);
                    System.out.println("* Factura de Diciembre, hay que comprar más uvas");
                    return true;
                }
                else {
                    System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                }
                break;
            default: // en el caso de que se introduzca un 0 en el mes, mostramos un error.
                System.out.println("ERROR. El mes debe ser superior a 0.");
                break;
        }
        return false;
    }//funcion para comprobar que el dia corresponde al mes
    
    //función para mostrar la factura de mayor importe y la de menor importe
    public static void facturaMayorYMenor(double[] arr) {
        
        double mayor = 0;
        int i;
        
        
        for (i = 0; i < arr.length; i++) {
            if (mayor < arr[i]) {
                mayor = arr[i];
            }
        }
        
        double menor = mayor;
        
        for (i = 0; i < arr.length; i++) {
            if (menor > arr[i]) {
                menor = arr[i];
            }
        }
        
        if (mayor == menor) {
            System.out.println("* La factura más baja y la más alta tienen el mismo valor: " + menor + "€.");
        }
        System.out.println("* La factura de mayor importe es de: " + mayor + "€.");
        System.out.println("* La factura de menor importe es de: " + menor + "€.");
    }
    
    //función para mostrar las facturas mayores al importe introducido por el usuario
    public static void facturasMayorX(double[] arr) {
        
        double cantidad;
        int i;
        
        
        System.out.print("* Introduce un valor para obtener\n"
                + "* las facturas superiores a dicho valor: ");
        cantidad = entradaDouble();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > cantidad) {
                System.out.println("* La factura de " + arr[i] + "€ es superior a " + cantidad + "€.");
            }
        }
    }
    
    //clase* para crear objetos Producto.
    // *Esta clase implementa la interfaz "Comparable" para sobrescribir el método
    //  "compareTo" y asi poder comparar productos y asi ordenarlos.
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
        
        //método para mostrar productos por pantalla.
        public void mostrar() {
            System.out.println(nombre + ": " + precio + " €/Kg");
        }
        
        //sobreescribimos el método "compareTo" para poder comparar productos y asi ordenarlos.
        @Override
        public int compareTo(Producto o) {
            return this.nombre.compareToIgnoreCase(o.nombre);
        }
        
        
    }

}