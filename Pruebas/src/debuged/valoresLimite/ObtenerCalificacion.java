/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debuged.valoresLimite;

public class ObtenerCalificacion {
    
    public static final String SUSPENSO = "Suspenso";
    public static final String APROBADO = "Aprobado";
    public static final String BIEN = "Bien";
    public static final String NOTABLE = "Notable";
    public static final String SOBRESALIENTE = "Sobresaliente";

   /**
    * Obtener una calificacion a partir de la nota
    * @param resultado
    * @return 
    * 
    * Valores invalidos
    * ( -infinito, 0) -> null
    * (10, +infinito) -> null
    * 
    * Valores validos 
    * [0, 5) -> Suspenso
    * [5, 6) -> Aprobado
    * [6, 7) -> Bien
    * [7, 9) -> Notable
    * [9, 10] -> Sobresaliente
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
}
