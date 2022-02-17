package debuged.valoresLimite;

/**
 * Las pruebas de particion de iguales combinadas con las valores limite se
 * realizan sobre un metodo con un unico parametro de entrada
 */
public class ValoresLimite {

    public static final String SUSPENSO = "Suspenso";
    public static final String APROBADO = "Aprobado";
    public static final String BIEN = "Bien";
    public static final String NOTABLE = "Notable";
    public static final String SOBRESALIENTE = "Sobresaliente";

    /* Valores invalidos
    * ( -infinito, 0) -> null
    * (10, +infinito) -> null
    * 
    * Valores validos 
    * [0, 5) -> Suspenso
    * [5, 6) -> Aprobado
    * [6, 7) -> Bien
    * [7, 9) -> Notable
    * [9, 10] -> Sobresaliente
    * 
    */
    public static String obtenerCalificacion(Double resultado) {

        String calificacion = null;

        if (resultado >= 0 && resultado < 5) {

            calificacion = SUSPENSO;

        } else if (resultado >= 5 && resultado < 6) {

            calificacion = APROBADO;

        } else if (resultado >= 6 && resultado < 7) {

            calificacion = BIEN;

        } else if (resultado >= 7 && resultado < 9) {

            calificacion = NOTABLE;

        } else if (resultado >= 9 && resultado <= 10) {

            calificacion = SOBRESALIENTE;

        }
        return calificacion;

    }

    /* Valores invalidos
    * ( -infinito, 1) -> "Valor no divisible"
    * [14, +infinito) -> "Valor no divisible"
    * 
    * Valores validos 
    * [1, 3], [5], [7], [11], [13] -> "Número primo"
    * [4), [8) -> "Divisible por 2"
    * [9] -> "Divisible por 3"
    * [6), [12) -> "Divisible por 2 y 3"
    * 
    */
    public static String ejecutarCase(Integer condicion) {

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
                divisible = "Divisible por 2 y 3";
                break;
            default:
                divisible = "Valor no divisible";
        }
        return divisible;
    }
    
    
    public Boolean esPar(Integer numero){
        return numero % 2 == 0;
    }
}
