/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_colecciones_03;

/**
 *
 *
 *
 * @since 31.03.2022
 * Fecha de modificación: 31.03.2022
 * @author Adrian Solanas
 */
public class Ejercicios_colecciones_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Inventario inv = new Inventario();
        
        inv.insertarAnimal(new Perro("Tobey", 3, "Durmiendo", "01/04/2019", "Labrador", false));
        inv.insertarAnimal(new Loro("Lorichu", 1, "Volando", "01/01/2021", "Azul", true, "Desconocido", true));
        inv.insertarAnimal(new Perro("Riley", 2, "Jugando", "15/12/2020", "Pastor Alemán", false));
        
        inv.mostrarListaAnimales2();
        
        System.out.println("***************************************************************");
        inv.mostrarUnAnimal(0);
        System.out.println("***************************************************************");
        inv.mostrarTodosAnimales2();
        System.out.println("\nPrograma finalizado...");
    }

}
