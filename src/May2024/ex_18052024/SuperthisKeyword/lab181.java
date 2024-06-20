package May2024.ex_18052024.SuperthisKeyword;

public class lab181 {
    //Super - keyword- reference to parent class
    //method or variable
    //Constructor

    public static void main(String[] args) {

        Car c= new Car();
      //  int speed= c.maxSpeed;
        //System.out.println(speed);
        c.display();

    }
}

class Car extends Vehicle{
    //if maxspeed is set to private , then main() cant access the variable.
    private int maxSpeed=180;
   // int maxSpeed=180;
    void display(){
        System.out.println("Max speed of  Vehicle  is   "+super.maxSpeed);
        System.out.println("Max speed of car is   "+this.maxSpeed);

    }
}

class Vehicle{
int maxSpeed= 100; //Instance Variable

    void message(){

        System.out.println("This is a vehicle class");
    }

}
