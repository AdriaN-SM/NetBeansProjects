/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java2_12;

/**
 *
 * @author adria
 */
public class Ejercicio_java2_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        
        
        for (i = 00000; i <= 99999; i++) {
            if ((i - 3) % 10 != 0) {
                System.out.print(i / 1 - i / 10 * 10);
            }
            else {
                System.out.print("E");
            }
            if ((i / 10 - 3) % 10 != 0) {
                System.out.print(i / 10 - i / 100 * 10);
            }
            else {
                System.out.print("E");
            }
            if ((i / 100 - 3) % 10 != 0) {
                System.out.print(i / 100 - i / 1000 * 10);
            }
            else {
                System.out.print("E");
            }
            if ((i / 1000 - 3) % 10 != 0) {
                System.out.print(i / 1000 - i / 10000 * 10);
            }
            else {
                System.out.print("E");
            }
            if ((i / 10000 - 3) % 10 != 0) {
                System.out.println(i / 10000);
            }
            else {
                System.out.print("E");
            }
        }
        
    }
    
}
