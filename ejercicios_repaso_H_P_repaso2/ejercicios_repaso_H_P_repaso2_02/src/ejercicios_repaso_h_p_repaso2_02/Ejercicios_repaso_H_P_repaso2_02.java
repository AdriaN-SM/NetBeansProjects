/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_repaso_h_p_repaso2_02;

/**
 *
 *
 *
 * @since 09.03.2022
 * Fecha de modificación: 09.03.2022
 * @author Adrian Solanas
 */
public class Ejercicios_repaso_H_P_repaso2_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Comercial c1 = new Comercial();
        Comercial c2 = new Comercial(1100, "Adrian", "Solanas", 20, 2.0);
        Comercial c3 = new Comercial(1100, "Adrian", "Solanas", 20, 2.0);
        Tecnico t1 = new Tecnico();
        Tecnico t2 = new Tecnico(1100, "Adrian", "Solanas", 20, 2.0);
        Tecnico t3 = new Tecnico(1100, "Adrian", "Solanas", 20, 2.0);
        
        
        Empleado[] arrEmpleados = new Empleado[6];
        arrEmpleados[0] = c1;
        arrEmpleados[1] = c2;
        arrEmpleados[2] = c3;
        arrEmpleados[3] = t1;
        arrEmpleados[4] = t2;
        arrEmpleados[5] = t3;
        
        
        
        System.out.println("Los objetos son los siguientes:");
        for (int i = 0; i<arrEmpleados.length; i++) {
            System.out.println((i+1) + ". " + arrEmpleados[i].toString());
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("¿El empleado 3 y el 5 son iguales? " + c3.equals(t2));
        System.out.print("\n¿El empleado 1 y el 2 son iguales? " + c1.equals(c2) + "\n");
        
        c2.setComision(4);
        if (c2.plus(2)) {
            System.out.println("El empleado " + c2.getNombre() + " tiene un aumento");
        }
        else {
            System.out.println("El empleado " + c2.getNombre() + " no tiene aumento");
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Los objetos modificados:");
        for (int i = 0; i<arrEmpleados.length; i++) {
            System.out.println((i+1) + ". " + arrEmpleados[i].toString());
        }
        System.out.println("\nPrograma finalizado...");
        
    }

}
