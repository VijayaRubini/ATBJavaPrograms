package May2024.ex_21052024.Abstraction.Interface;

public interface Engine {
    void startEngine();
    void stopEngine();

    default void haltEngineJustStart(){
        System.out.println("Halt the Engine");
    }

    default void haltEngineJustStop(){
        System.out.println("Halt the Engine");
    }

    static void m1(){
        System.out.println("M1");
    }

    /**
     *  Cannot have complete method. it can have only, default or  static methods

    * void m2(){
        System.out.println("M2");

    }
    */
}
