
package Creacion.FactoryMethod;

/**
 * Abstraer la creacion de objetos o instancias al cliente segun el valor de 
 * los parametros del objeto o segun su numero
 * 
 * https://migranitodejava.blogspot.com/2011/05/factory-method.html
 * https://es.wikipedia.org/wiki/Factory_Method_(patr%C3%B3n_de_dise%C3%B1o)
 */

public abstract class Creator {
    // Definimos método abstracto
    public abstract Product factoryMethod();
    public abstract Product factoryMethod(int i);
}
