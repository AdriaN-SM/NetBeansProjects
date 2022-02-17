package Pruebas;

/**
 *
 * @author adria
 */
public class obtenerFormato {
    /**
    * A partir de un texto, devuelve el texto formateado
    *
    * @param texto texto a formatear
    * @param mayusculas si el texto se devuelve con todos sus carácteres en mayúsculas o minúsculas
    * @param espacio si se eliminan o no todos los espacios que contiene el texto
    * @return el texto formateado
    */
    public static String obtenerFormato (String texto, Boolean mayusculas, Boolean espacio) {
        // transformar los caracteres en mayúsculas o minúsculas
        if (mayusculas) {
            texto = texto.toUpperCase(); // texto en mayúsculas
        } else {
            texto = texto.toLowerCase(); // texto en minúsculas
        }
        // eliminar o no todos los espacios
        if (espacio) {
    // reemplazar los espacios del texto por un sin espacio
        texto = texto.replace(" ", "");     	
    }
        return texto;
    }
}
