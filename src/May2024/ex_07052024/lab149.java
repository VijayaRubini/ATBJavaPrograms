package May2024.ex_07052024;

public class lab149 {
    public static void main(String[] args) {
        //Function which will sayHi

        sayHi();
        sayHi();
        sayHi();
        //using for loop
        System.out.println("Using For loop");
        for (int i = 0; i < 3; i++) {
            sayHi();
            sayBye();
            rama();
        }
    }

     static void rama() {
         System.out.println("Rama");
    }

    static void sayBye() {
         System.out.println("Bye!!!");
    }

    static  void sayHi(){
        System.out.println("Hello...Hi!!!");
    }
}
