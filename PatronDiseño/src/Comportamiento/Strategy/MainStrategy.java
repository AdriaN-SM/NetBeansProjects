package Comportamiento.Strategy;

public class MainStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Context context = new Context();
        context.method();

        context.setStrategyA();
        context.method();

        context.setStrategyB();
        context.method();

    }

}
