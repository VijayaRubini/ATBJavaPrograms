package April2024.ex_25042024;
import java.util.Scanner;

public class lab081 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browsername = sc.nextLine();
        browsername = browsername.toLowerCase();

        switch(browsername){

            case "firefox":
                System.out.println("Starting the firefox browser");
                //code for  firefox browser
                break;
            case "chrome":
                System.out.println("Starting the chrome browser");
                //code for chrome browser
                break;
            case "edge":
                System.out.println(" Execute the edge code");
                break;
            default:
                System.out.println("Enter the valid browser name");

        }
        sc.close();
    }
}
