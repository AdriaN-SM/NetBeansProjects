package debuged;

/**
 * Anotaciones para comentar metodos.
 * Indicar que se puede usar notacion HTML para
 * estructurar y mostrar mejor el resuldado en el Javadoc
 * 
 * @author jlopez
 * @version 1.0
 * @since version 2.0
 */
public class DocumentacionMetodo {
    
    /**
     * Esto no sale en el javadoc
     */
    private DocumentacionException calculo;
    /**
     * 
     * Al ser generado el javadoc en formato web, se puede incrustar hmlt en los comentarios
     * <h1>
     *  Obtener la califacición a partir de la nota
     * </h1>
     * 
     * @param nota Nota obtenida
     * @return la calificacion <ul>
     *                              <li> 0 - 4.99: Suspenso </li> 
     *                              <li> 5 - 5.99: Aprobrado </li> 
     *                              <li> 6 - 6.99: Bien </li> 
     *                              <li> 7 - 8.99: Notable </li> 
     *                              <li> 9 - 10: Sobresaliente </li>
     *                         </ul>
     */
    public String obtenerCalificacion(Double nota) {

        String calificacion = null;

        if (nota >= 0 && nota < 5) {

            calificacion = "Suspenso";

        } else if (nota >= 5 && nota < 6) {

            calificacion = "Aprobado";

        } else if (nota >= 6 && nota < 7) {

            calificacion = "Bien";

        } else if (nota >= 7 && nota < 9) {

            calificacion = "Notable";

        } else if (nota >= 9 && nota <= 10) {

            calificacion = "Sobresaliente";

        }
        return calificacion;

    }

    /**
     * Setter de calculo, asigna un valor a la propiedad calculo
     * @param calculo valor a asignar
     */
    public void setCalculo(DocumentacionException calculo) {
        this.calculo = calculo;
    }
    
    
}
