package debuged;

import java.util.Objects;

/**
 * Como comentar los constructores
 * 
 * @author jLopez
 */
public class DocumentacionConstructor {
    
    /**
     * Comentario para el parametro nombre
     */
    private String nombre;
    private Integer numero;
    private Boolean cierto;

    /**
     *  Constructor vacio
     */
    public DocumentacionConstructor() {
    }

    /**
     * Constructor con 3 paraemtros de entrada. 
     * Lo que hace cada parametro esta inventado
     * 
     * @param nombre nombre de la instancia
     * @param numero numero de instancias
     * @param cierto si ya existe una instacia
     * 
     */
    public DocumentacionConstructor(String nombre, Integer numero, Boolean cierto) {
        this.nombre = nombre;
        this.numero = numero;
        this.cierto = cierto;
    }

    /**
     * Codigo hash
     * 
     * @return hash
     */
    @Override
    /**
     * Generar un hasCode
     */
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.numero);
        hash = 97 * hash + Objects.hashCode(this.cierto);
        return hash;
    }

    /**
     * Compara 2 objetos
     * 
     * @param obj objeto a comparar
     * @return <ul>
     *           <li> true: el objeto es igual </li> 
     *           <li> false: la instancia del objeto no es igual </li> 
     *        </ul>
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DocumentacionConstructor other = (DocumentacionConstructor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.cierto, other.cierto)) {
            return false;
        }
        return true;
    }
    
    
    
}
