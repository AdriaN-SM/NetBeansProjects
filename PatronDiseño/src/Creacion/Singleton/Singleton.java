package Creacion.Singleton;

/**
 * Permite restringir la creación de objetos pertenecientes a una clase 
 * a un único objeto, ya que es la propia clase es responsable de crear 
 * la única instancia
 * https://es.wikipedia.org/wiki/Singleton
 * http://avitevet.com/design-patterns/when-to-use-it-singleton-pattern/ 
 * https://www.geeksforgeeks.org/singleton-design-pattern/
 * https://refactoring.guru/design-patterns/singleton
 * https://migranitodejava.blogspot.com/search/label/Singleton
 * 
 * Usos:
 * Mantener una sola estancia, por ejemplo de loggin o acceso a base de datos, 
 * acceso unico a un recurso compartido
 * 
 * 
 */
public class Singleton {
    
    // tipo de dato de la clase
    private static Singleton singleton;
    private Integer contador = 0;
    
    /**
     * El constructor debe tener visibilidad privada para que no sea 
     * instanciable directamente
     */
    private Singleton(){};
    
    /**
     * Funcion que instancia una vez el atributo y lo devuelve
     * Permite el acceso global a dicha instancia mediante un método de clase
     * @return 
     */
    public static Singleton instanciar(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador += contador;
    }
    
    
}
