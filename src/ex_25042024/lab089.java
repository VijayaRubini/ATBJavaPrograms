package ex_25042024;

public class lab089 {
    public static void main(String[] args) {
        char code='B';
        int val= switch(code){ // int val=66 based switch statement
            case 'A':
                yield 65; //yield- return
            case 'B':
                yield 66;

            default:
                System.out.println("Not able to find");
                throw new IllegalStateException("Error");
        };
    }
}
