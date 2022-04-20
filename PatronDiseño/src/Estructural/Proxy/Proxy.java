package Estructural.Proxy;

// https://en.wikipedia.org/wiki/Proxy_pattern

public class Proxy implements Subject {

    private RealSubject realSubject;
    private String name;

    public Proxy(String name) {
        this.name = name;
    }

    @Override
    public void doSomething() {
        if (realSubject == null) {
            realSubject = new RealSubject(name);
        }
        realSubject.doSomething();
    }

}
