/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_herenciapolimorfismo_01_herencia_y_polimorfismo;

/**
 *
 *
 *
 * @since 31.01.2022
 * Fecha de modificación: 31.01.2022
 * @author Adrian Solanas
 */
public class Ejercicios_herenciaPolimorfismo_01_Herencia_y_polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado E1 = new Empleado("Rafa");
        Empleado E2 = new Empleado("Adrián");
        Directivo D1 = new Directivo("Mario");
        Operario OP1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo");
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
        
        if (E1.equals(E2) == false) {
            System.out.println(E1.toString() + " Y " + E2.toString() + " No son iguales.");
        }
        else {
            System.out.println(E1.toString() + " Y " + E2.toString() + " Son iguales.");
        }
        
    }

}
