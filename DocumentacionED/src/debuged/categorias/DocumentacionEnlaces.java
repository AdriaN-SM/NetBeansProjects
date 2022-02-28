
package debuged.categorias;

import debuged.DocumentacionMetodo;

/**
 * Como realizar enlaces, tanto internos como externos.<br>
 * 
 * Enlace interno usando la anotación {@literal @}link, similar a la anotación {@literal @}see {@link debuged.DocumentacionMetodo#obtenerCalificacion(java.lang.Double)} 
 * Enlace externo, generado con html <a target='_blank' href='https://blog.idrsolutions.com/2015/08/writing-better-javadoc-in-netbeans-ide/'> 
 * escribir javadocs con netbeans</a> <br>
 * Cuidado con como usan la anotacion see, porque primero hay que poner la ruta y usar el simbolo almohadilla # para enlacer al metodo correspondiente
 * como es un metodo interno con la almohadilla es suficiente
 * {@link #main(java.lang.String[]) }
 * primero escribir la ruta y despues # y el metodo a enlazar
 * {@link debuged.DocumentacionMetodo#obtenerCalificacion(java.lang.Double)} 
 * si no se escribe nada, se muestra el enlace, si no se ha de escribir el 
 * @see debuged.DocumentacionMetodo
 * @see debuged.DocumentacionMetodo#obtenerCalificacion(java.lang.Double) Seccion see, si no se escribe nada aparece el enlace con el texto del enlace, sino este texto
 * @see debuged.DocumentacionMetodo#obtenerCalificacion(java.lang.Double)
 * para definir un enlace externo, usar HTML
 * @see <a href="http://google.com">http://google.com</a>
 * @author jLopez
 */
public class DocumentacionEnlaces {

    /**
     * Metodo creado para comprobar las diferentes funcionalidades de debug
     * 
     * @param resultado calificacin final
     * @return el resultado según rango en forma de literal
     */
    public static String obtenerNotaFinal(Double resultado) {
        String nota = new DocumentacionMetodo().obtenerCalificacion(resultado);
        if (nota == null) {
            nota = "Nota erronea";
        }
        return nota;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        obtenerNotaFinal(5.0);
    }

}
