package Pruebas;

/**
 *
 * @author adria
 */
public class calcularFactorial {
    /**
    * Calcular el factorial de un numero entero
    * @param numero el valor del numero a calcular el factorial
    * @return el factorial
    */
    public static Integer calcularFactorial(Integer numero){
        Integer factorial = 0;
        if(numero == 0 || numero == 1){
            factorial = 1;
        }
        if(numero >= 2){
            factorial = 2;
        }
        for(int i = 3; i <=numero; i++){
            factorial *= i;
        }
        return factorial;
    }
}
