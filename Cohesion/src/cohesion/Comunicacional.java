package cohesion;


import java.util.ArrayList;
import java.util.List;

/**
 * Comunicacion entorno al uso compartido de diferntes metodos del mismo atributo
 */
public class Comunicacional {

    public class GestionLista {

        private List<String> listaTexto;

        public GestionLista() {
            listaTexto = new ArrayList();
        }

        public Boolean addTexto(String texto) {
            return listaTexto.add(texto);
        }

        public Boolean removeTexto(String texto) {
            return listaTexto.remove(texto);
        }

        public Boolean removeTexto(Integer posicion) {
            return listaTexto.remove(listaTexto.get(posicion));
        }

        public List<String> getListaTexto() {
            return listaTexto;
        }
        
    }
}
