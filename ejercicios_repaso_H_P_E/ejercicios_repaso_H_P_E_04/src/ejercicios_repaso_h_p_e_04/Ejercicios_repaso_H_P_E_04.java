/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_repaso_h_p_e_04;

/**
 *
 *
 *
 * @since 17.02.2022
 * Fecha de modificación: 17.02.2022
 * @author Adrian Solanas
 */
public class Ejercicios_repaso_H_P_E_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro p = new Perro("Riley", 4, "Corriendo", "18-2-2018", "Labrador", false);
        Perro p2 = new Perro("Riley", 4, "Corriendo", "18-2-2018", "Labrador", false);
        
        System.out.println("Método mostrar");
        p.mostrar();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Método sout");
        System.out.println(p);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Método toString");
        System.out.println(p.toString());
        p.tienePulgas();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Método equals: " + p.equals(p2));
    }

}
