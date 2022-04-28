package Comportamiento.Observer;

public class MainObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();

        new ConcreteObserver(subject);
        new ConcreteObserver(subject);
        new ConcreteObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
