package May2024.ex_07052024;

public class lab156 {
    public static void main(String[] args) {
        //not calling the function

        System.out.println("Start of the program");
        System.out.println("End of the program");
        main(10);
        main("Viji");

    }
    static void main(int a){
        System.out.println(a);
    }
    static void main(String a){
        System.out.println(a);
    }
    static String main(String[] a,String b){
    System.out.println(a);
    return "Hello";
}
   // static void god(){
     //     main(new String[]("12"));

   // }

    static void giveMoneyToBeg() {
        System.out.println("Blessings!!!");
    }

    static int giveMoneyToFriend(int i) {
        //after 6 month return
        return i*6;
    }
}




