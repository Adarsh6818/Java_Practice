package abstractPackage;

public class AbstractDemo {
    public static void main(String[] args) {
        Car c1 = new ElectricCar();
        Car c2 = new FuelCar();

        c1.start();
        c1.accelerate();
        c1.brake();

        c2.start();
        c2.accelerate();
        c2.brake();
    }
}

abstract class Car{

   // Concrete methods
    void start() {
        System.out.println("Cas has been started");
    }
    // Abstract Methods - Must be overridden
    abstract void accelerate() ;
    abstract void brake() ;
}

class ElectricCar extends Car{

    @Override
    void accelerate() {
        System.out.println("Electric car is accelarating");
    }

    @Override
    void brake() {
        System.out.println("Electric car is braking");
    }
}

class FuelCar extends Car{
    @Override
    void accelerate() {
        System.out.println("Fuel car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Fuel car is braking");
    }
}
