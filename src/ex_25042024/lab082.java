package ex_25042024;
import java.util.Scanner;

public class lab082 {
    public static void main(String[] args) {
        // Take a user input as char and tell the user it is vowel or not
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a char, will tell u if it is vowel or not");

        char user_input = sc.next() .charAt(0);

        System.out.println(user_input);

        switch(user_input){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");

        }
        sc.close();

    }
}
