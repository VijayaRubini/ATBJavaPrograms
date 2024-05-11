package April2024.ex_20042024;

import java.util.Locale;

public class lab064 {
    public static void main(String[] args) {
        String password = "Pramod@123";
        String pass_u = password.toLowerCase();
        System.out.println(password==pass_u);// false- ref of (Pramod@123) ==(pramod@123)
        System.out.println(password.equals(pass_u)); // false - values are checked
        System.out.println(password.equalsIgnoreCase(pass_u));// true- case is ignored and only values checked

        System.out.println(password.substring(0,3)); // index start nd num of chars - 0, 3- Pra
        System.out.println( password.indexOf("d"));

    }
}
