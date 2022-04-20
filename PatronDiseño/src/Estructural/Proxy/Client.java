package Estructural.Proxy;

public class Client {

    public static void main(String[] args) {

        Subject subject1 = new Proxy("Real Subject A"); 
        Subject subject2 = new Proxy("Real Subject B"); 
        
        subject1.doSomething();
        subject1.doSomething();
        subject2.doSomething();
        subject2.doSomething();
        subject1.doSomething();
  
    }
}
