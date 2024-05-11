package April2024.ex_20042024;

public class lab055 {
    public static void main(String[] args) {

        String s1="Vijaya";
        String s2=s1;
        //String is immutable
        System.out.println(s2);

        System.out.println("-----------");
        String s3="TheTestingAcademy";
        s3.toLowerCase(); //thetestingacademy- but not assigned
        System.out.println(s3);// TheTestingAcademy
        s3=s3.toLowerCase();
        System.out.println(s3);




    }
}
