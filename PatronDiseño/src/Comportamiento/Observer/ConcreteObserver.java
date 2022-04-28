package Comportamiento.Observer;

public class ConcreteObserver extends Observer {

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("State changed: " + subject.getState());
    }

}
