package Estructural.Facade;

/**
 * Aglutinar diferentes clases en una sola para dar servicio al cliente, ademas
 * de abstraerle de su implementacion
 * 
 * Seria como designar un portavoz/representante de una organizacion
 * 
 * https://www.dotnettricks.com/learn/designpatterns/facade-design-pattern-dotnet
 * https://www.tutorialspoint.com/design_pattern/facade_pattern.html
 * 
 * 
 * Seria la clase Facade
 */
public class CarFacade {

    private CarModel model;
    private CarEngine engine;
    private CarBody body;
    private CarAccessories accessories;

    public CarFacade() {
        model = new CarModel();
        engine = new CarEngine();
        body = new CarBody();
        accessories = new CarAccessories();
    }

    public void CreateCompleteCar() {
        
        System.out.println("******** Creating a Car **********\n");
        model.SetModel();
        engine.SetEngine();
        body.SetBody();
        accessories.SetAccessories();
        System.out.println("\n******** Car creation complete **********");
    }
}
