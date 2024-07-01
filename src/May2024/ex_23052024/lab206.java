package May2024.ex_23052024;

public class lab206 {
    public static void main(String[] args) {
        Car c=new Car("Lambo");
       // c.drive();
        Car.Engine engine =c.new Engine("400cc");
        engine.start();
        c.drive();
        //Nested class- to shield the inner classes

    }
}

class Car{

    String  make;

    public Car(String make) {
        this.make = make;
    }

    //method

    void  drive(){
        System.out.println("You can drive the car");
    }

    class Engine{

        //instance variable
        String horsePower;

        public Engine(String horsePower) {
            this.horsePower = horsePower;
        }

        //instanc method

        void start(){
            System.out.println("Engine is started...!!!"+make);
        }

        class GearBox{

            void m2(){
                System.out.println("M2");
            }
        }
    }

}
