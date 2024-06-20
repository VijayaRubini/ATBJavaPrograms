package May2024.ex_21052024.Interface;

public class Cars implements Brake,Engine{

    @Override
    public void applyBrake() {
        System.out.println("Applying Brake");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the Car");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the Car");
    }
}
