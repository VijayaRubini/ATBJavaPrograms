package May2024.ex_21052024.Abstraction.CarEx;

abstract class Car extends Engine{

    @Override
    void start() {
        System.out.println("Start the car");
    }

    @Override
    void stop() {
        System.out.println("Stop the car");

    }

    @Override
    void parts() {
        System.out.println("Assemble the gear box");
    }

    @Override
    void openCar() {
        System.out.println("Open the car");
    }

    abstract void brakeMech();
}
