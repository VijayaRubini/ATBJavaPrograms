package ex_25042024;

public class lab087 {
    public static void main(String[] args) {
        int itemcode=001;
        switch(itemcode){ //JDK > 13, -> arrow function, no need of break command

            case 001-> System.out.println("It is a laptop");
            case 002-> System.out.println("It is a desktop");
            case 003,004 -> System.out.println("It is a mobile phone");
            default -> System.out.println("Hello");
        }

        char ch = 'a';
        switch(ch){
            case 'a','e','i','o','u' -> System.out.println("Vowel");

            default -> System.out.println("Consonant");
        }
    }
}
