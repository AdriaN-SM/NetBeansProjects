package Estructural.Facade;

public class Client {

    public static void main(String[] args) {

       CarFacade facade = new CarFacade();
        facade.CreateCompleteCar();

    }
}
