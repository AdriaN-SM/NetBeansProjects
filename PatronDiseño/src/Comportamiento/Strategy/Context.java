package Comportamiento.Strategy;

public class Context {

    Strategy c;

    public Context() {
        this.c = new Strategy() {
            @Override
            public void behaviour() {
                System.out.println("Not supported");
            }
        };
    }

    public void setStrategyA() {
        this.c = new ConcreteStrategyA();
    }

    public void setStrategyB() {
        this.c = new ConcreteStrategyB();
    }

    //Método de estrategia 'c'
    public void method() {
        c.behaviour();
    }
}
