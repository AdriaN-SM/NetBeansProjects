package debuged;

/**
 * @see #ejecutarCase(java.lang.Integer) 
 * @author jLopez
 */
public class DocumentacionException {

    /**
     * Saber si el numero es primo o no
     * 
     * @param condicion Entero 
     * @return Texto notificando si es primo o no
     */
    public String ejecutarCase(Integer condicion) {

        String divisible;
        switch (condicion) {

            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            case 13:
                divisible = "Número primo";
                break;
            case 5 - 1:
            case 8:
                divisible = "Divisible por 2";
                break;
            case 9:
                divisible = "Divisible por 3";
                break;
            case 6:
            case 12:
                divisible = "Divisible por 2";
                divisible += " - Divisible por 3";
                break;
            case 10:
                divisible = "Divisible por 2";
                divisible += " - Divisible por 5";
                break;
            default:
                divisible = "Valor no divisible";
        }
        return divisible;
    }

    /**
     * Calcular el factorial
     * @throws ArithmeticException error en la hora de ejecutar el calculo
     * @param iteracion - valor del factoriala calcular
     * @return el valor entero factor del numero
     */
    public Integer ejecutarFactorial(Integer iteracion) throws ArithmeticException {
        Integer factorial = 1;
        for (int i = 1; i <= iteracion; i++) {
            // System.out.println("Este es el valor actual del indice " + i);
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Calcula una multiplicacion de 2 números sumando de 1 en 1
     * @exception NullPointerException error si los parametros no son correctos
     * @param iteracionExterior 1º operando
     * @param iteracionInterior 2º operando
     * @return multiplicacon
     */
    public Integer ejecutarMultiplicacion(Integer iteracionExterior, Integer iteracionInterior) {
        Integer sumatorio = 0;
        for (int j = 0; j < iteracionExterior; j++) {
            for (int i = 0; i < iteracionInterior; i++) {
//                System.out.println("Este es el valor actual del indice interior "
//                        + i + " y el valor del indice exterior " + j);
                sumatorio += 1;
            }
        }
        return sumatorio;
    }

}
