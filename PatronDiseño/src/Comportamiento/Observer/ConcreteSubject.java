
package Comportamiento.Observer;

public class ConcreteSubject extends Subject{
    
    @Override
    public void setState(int state) {
        super.setState(state);
        notifyAllObservers();
    }
}
