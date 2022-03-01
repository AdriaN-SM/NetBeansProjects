package cohesion;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Secuencia de ordenes para realizar una tarea en concreto
 */
public class Procedural {

    public class comprobarTexto {

        private String texto;

        public Boolean checkText() {

            if (texto == null) {
                return false;
            }

            texto = texto.trim();

            if (texto.length() < 1) {
                return false;
            }

            Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
            Matcher match = pattern.matcher(texto);
            if (match.find()) {
                return false;
            }
            return true;
        }

    }

}
