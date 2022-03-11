/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej2_adrian_2ev;

/**
 *
 *
 *
 * @since 11.03.2022
 * Fecha de modificación: 11.03.2022
 * @author Adrian Solanas
 */
public class Ej2_Adrian_2ev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos el array de Perros
        Perro[] arrPerros = new Perro[2];
        
        //Instanciamos los objetos 
        Perro p1 = new Perro("Riley", 13, "Macho");
        Perro p2 = new Perro("Tobey", 2, "Macho");
        
        //Introducimos los objetos en el array
        arrPerros[0] = p1;
        arrPerros[1] = p2;
        
        //Mostramos los perros por primera vez
        System.out.println("Perros iniciales:");
        p1.mostrar();
        p2.mostrar();
        System.out.println("-------------------------------------------------");
        //hacemos que coman 2 unidades los 2 perros
        p1.come(2);
        System.out.println("Come perro 1 nivel " + p1.nivelAlimentacion);
        p2.come(2);
        System.out.println("Come perro 2 nivel " + p2.nivelAlimentacion);
        System.out.println("-------------------------------------------------");
        //Hacemos que los perros cacen y mostramos a los perros
        System.out.println("Perros cazando...");
        p1.caza();
        p2.caza();
        p1.mostrar();
        p2.mostrar();
        System.out.println("-------------------------------------------------");
        //mostramos si los perros son felices después de haber cazado
        System.out.println("El perro 1 es feliz: " + p1.esFeliz());
        System.out.println("El perro 2 es feliz: " + p2.esFeliz());
        System.out.println("-------------------------------------------------");
        //hacemos que cada perro cumpla 1 año y mostramos los perros
        System.out.println("Cumpleaños:");
        p1.envejece();
        p2.envejece();
        p1.mostrar();
        p2.mostrar();
        System.out.println("-------------------------------------------------");
        //Comprobamos si los perros están vivos después de haber cumplido 1 año
        System.out.println("El perro 1 está vivo: " + p1.estaVivo());
        System.out.println("El perro 2 está vivo: " + p2.estaVivo());
        
        System.out.println("\nPrograma finalizado...");
        
    }

}
