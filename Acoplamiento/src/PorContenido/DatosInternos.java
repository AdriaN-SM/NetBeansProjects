package PorContenido;

/**
 *
 */
public class DatosInternos {

    public void factorial(Integer i) {

        Integer factorial = 1;

        for (int j = 2; j < i; j++) {
            factorial = new CalcularDatos().multiplicacion(factorial, j);
        }

    }

    private class CalcularDatos {

        public Integer multiplicacion(Integer a, Integer b) {
            return a * b;
        }

    }

}
