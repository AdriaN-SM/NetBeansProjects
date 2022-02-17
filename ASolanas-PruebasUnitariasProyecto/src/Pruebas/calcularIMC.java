package Pruebas;

/**
 *
 * @author adria
 */
public class calcularIMC {
    /**
    * Calcula el índice de masa corporal según el peso y la altura de una persona
    *
    * @param peso Peso de una persona en kilos
    * @param altura Altura de una persona en metros
    * @return Clasificación según IMC
    */
    public static String calcularIMC(float peso, float altura) {
        // IMC, comprobar el valor de la variable
        float indice = (float) (peso / Math.pow(altura, 2));
        // según valor de la variable, se obtiene calificación
        if (indice < 18.5) {
            return "Delgadez";
        } else if (indice < 25) {
            return "Normal";
        } else if (indice < 30) {
            return "Sobrepeso";
        } else if (indice >= 30) {
            return "Obesidad";
        } else {
            return "Desconocido";
        }
    }
}
