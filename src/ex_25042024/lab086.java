package ex_25042024;

public class lab086 {
    public static void main(String[] args) {
        int itemcode=010;

        switch(itemcode){
            //JDK>13
            case 001,002,003:
                System.out.println("It is an Electronic Gadget");
                break;
            case 004,005,006:
                System.out.println("It is a Mechanical Gadget");
                break;

            default:
                System.out.println("None");
        }
    }
}
