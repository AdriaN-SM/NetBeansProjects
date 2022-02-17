/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debuged.valoresLimite;

/**
 *
 * @author ChimoB
 */
public class Fibonacci {

    public Integer fibonacci(Integer n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);  //función recursiva
        } else if (n == 1) {  // caso base
            return 1;
        } else if (n == 0) {  // caso base
            return 0;
        } else { //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

    public void mostrarSerie(Integer size) {
        System.out.println("Lista de fibonnaci hasta el valor " + size);
        for (int i = 0; i < size; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

}
