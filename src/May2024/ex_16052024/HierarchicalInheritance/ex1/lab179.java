package May2024.ex_16052024.HierarchicalInheritance.ex1;

public class lab179 {
    public static void main(String[] args) {

        Car c = new Car();
        c.vehicleHasTopSpeed();

        Vehicle v2 = new Vehicle();
        v2.vehicleHasTopSpeed();

        Vehicle v1= new Car();
        v1.vehicleHasTopSpeed();
    }
}
