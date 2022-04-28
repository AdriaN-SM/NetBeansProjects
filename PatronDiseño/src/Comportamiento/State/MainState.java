package Comportamiento.State;

public class MainState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        State state = new ConcreteStateA();
        Context context = new Context();
        context.setState(state);
        context.request();
                
        state = new ConcreteStateB();
        context.setState(state);
        context.request();

    }
}
