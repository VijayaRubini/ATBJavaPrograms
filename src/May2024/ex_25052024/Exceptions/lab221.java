package May2024.ex_25052024.Exceptions;

public class lab221 {
    public static void main(String[] args) {
       try {
           String sh = args[0];// 1- 5, 15 --String 5-> java.lang.ArrayIndexOutOfBoundsException
           int x = Integer.parseInt(sh);// 2--- java.lang.NumberFormatException ---- vijaya-string
           int a = 10 / x;//3-- java.lang.ArithmeticException

           System.out.println(a);
           System.out.println(x);
       }catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException a) {
           System.out.println("Problem with the code");
       }catch(Exception e){
         System.out.println(e.getMessage());
         System.out.println("Can you pls enter the correct input");

          // e.printStackTrace(); - red message with line num shown
     }
        /*
        * JVM will be initialised
        * Created and starts the main thread
        * Main thread vl do the following tasks
        * 1) Collects the command line Argument
        * 2) Creates the String array with CLA
        * 3) Calls main method by passing String array as parameter
        * ///////lab221.main(5)
        * Now control will be transferred from Main thread to Main Method
        * Control will come back to main thread in two ways
        * A) When problem comes in Main-> JVM
        * Creates the object of Identified Exception Class
        * Exception a= new Exception();
        *


         */
    }
}
