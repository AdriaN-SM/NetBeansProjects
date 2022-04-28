package Estructural.Bridge;

public class Client {

    public static void main(String[] args) {

        Truck truck = new Truck("Camion");
        PaintWork paintWork = new PaintWork();
        PolishWork polishWork = new PolishWork();
        truck.add(paintWork);
        truck.add(polishWork);
        truck.applyChange();
        Car car = new Car("Kar");
        car.add(paintWork);
        car.applyChange();
  
    }
}
