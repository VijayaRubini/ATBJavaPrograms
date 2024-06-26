package May2024.ex_21052024.Interface;

public class lab198 {
    public static void main(String[] args) {

        Cars c1 = new Cars();
        c1.startEngine();
        c1.applyBrake();
        c1.stopEngine();

        //default methods
        c1.haltEngineJustStart();
        c1.haltEngineJustStop();

        //static
       // Engine.m1();
    }
}