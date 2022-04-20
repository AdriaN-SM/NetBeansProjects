
package Comportamiento.Iterator;
// https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
// https://refactoring.guru/design-patterns/iterator
public interface Iterator {
    
    public boolean hasNext();
    public Object next();

    public void reset();
}
