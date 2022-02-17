/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_repaso_h_p_e_01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *
 *
 * @since 14.02.2022
 * Fecha de modificación: 14.02.2022
 * @author Adrian Solanas
 */
public class Ejercicios_repaso_H_P_E_01 {
    
    public static CuerpoCeleste[] arrCuerpos = new CuerpoCeleste[3];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int salir;
        
//        Estrella e1 = new Estrella("Sol", 1.9E30, 1.4E9);
//        Planeta p1 = new Planeta("Tierra", 5.9E24, 12742, 365.2);
//        Satelite s1 = new Satelite("Luna", 1.2E10, 5000, 28);
//        
//        System.out.println(e1.toString());
//        System.out.println(p1.toString());
//        System.out.println(s1.toString());
        
        arrCuerpos[0] = new Estrella("Sol", 1.9E30, 1.4E9);
        arrCuerpos[1] = new Planeta("Tierra", 5.9E24, 12742, 365.2);
        arrCuerpos[2] = new Satelite("Luna", 1.2E10, 5000, 28);
        
        
        do {
            mostrarLista();
            agnadirCuerpo();
            System.out.print("Introduce 0 para salir: ");
            salir = entradaEntero();
        }while(salir != 0);
        
    }
    
    public static void agnadirCuerpo() {
        
        int opcion;
        String nombre;
        double masa;
        double diametro;
        double periodoRotacion;
        
        
        
        do {
            System.out.println("AÑADIR:");
            System.out.println("1. Estrella");
            System.out.println("2. Planeta");
            System.out.println("3. Satélite");
            System.out.println("");
            System.out.println("0. SALIR");
            System.out.print("Opción: ");
            opcion = entradaEntero();
            
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre: ");
                    nombre = entradaString();
                    System.out.print("Introduce la masa: ");
                    masa = entradaDouble();
                    System.out.print("Introduce el diámetro: ");
                    diametro = entradaDouble();
                    arrCuerpos = Arrays.copyOf(arrCuerpos, arrCuerpos.length + 1);
                    arrCuerpos[arrCuerpos.length - 1] = new Estrella(nombre, masa, diametro);
                    break;
                case 2:
                    System.out.print("Introduce el nombre: ");
                    nombre = entradaString();
                    System.out.print("Introduce la masa: ");
                    masa = entradaDouble();
                    System.out.print("Introduce el diámetro: ");
                    diametro = entradaDouble();
                    System.out.print("Introduce el periodo de rotación: ");
                    periodoRotacion = entradaDouble();
                    arrCuerpos = Arrays.copyOf(arrCuerpos, arrCuerpos.length + 1);
                    arrCuerpos[arrCuerpos.length - 1] = new Planeta(nombre, masa, diametro, periodoRotacion);
                    break;
                case 3:
                    System.out.print("Introduce el nombre: ");
                    nombre = entradaString();
                    System.out.print("Introduce la masa: ");
                    masa = entradaDouble();
                    System.out.print("Introduce el diámetro: ");
                    diametro = entradaDouble();
                    System.out.print("Introduce el periodo de rotación: ");
                    periodoRotacion = entradaDouble();
                    arrCuerpos = Arrays.copyOf(arrCuerpos, arrCuerpos.length + 1);
                    arrCuerpos[arrCuerpos.length - 1] = new Satelite(nombre, masa, diametro, periodoRotacion);
                    break;
                default:
                    System.out.println("adios");
                    break;
            }
        }while(opcion != 0);
    }
    
    public static void mostrarLista() {
        int i;
        
        
        //con este bucle recorremos el array
        for (i = 0; i < arrCuerpos.length; i++) {
            System.out.println(arrCuerpos[i].toString());
        }
    }
    
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

}
