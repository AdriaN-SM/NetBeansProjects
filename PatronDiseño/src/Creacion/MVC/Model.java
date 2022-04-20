
package Creacion.MVC;

import java.util.HashMap;


public class Model {
    
    private HashMap <Integer, String> listaTexto = new HashMap();

    public HashMap<Integer, String> getListaTexto() {
        return listaTexto;
    }
    
    public void cargarTexto(){
        listaTexto.put(0, "Hola");
        listaTexto.put(1, "Adios");
        listaTexto.put(2, "Hasta luego");
        listaTexto.put(3, "Buenas");
        
    }

    void actualizar(Integer index, String texto) {
        listaTexto.replace(index, texto);
    }
    
    
}
