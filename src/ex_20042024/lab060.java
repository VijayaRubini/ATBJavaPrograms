package ex_20042024;

public class lab060 {
    public static void main(String[] args) {

        String s1=new String("Vijaya");
        String s2=new String("Vijaya");

        System.out.println(s1==s2); //false - diff references are created for each variable
        System.out.println(s1.equals(s2));

        System.out.println("----------");
        String a1="ABC";
        String a2="ABC"; //when values are same then their references points to the same SCP.
        System.out.println(a1==a2); //both ref are same//true
        System.out.println(a1.equals(a2)); //values are also same //true

    }
}
