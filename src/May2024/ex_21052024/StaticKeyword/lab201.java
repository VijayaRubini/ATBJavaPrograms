package May2024.ex_21052024.StaticKeyword;

public class lab201 {

    //Static keyword- Data member, function or class
    //static loads when class loaded

    public static void main(String[] args) {
        ATB A=new ATB();
        A.courseId=1;
        System.out.println(A.courseName);
    }

}

class ATB{

    static String courseName = "ATB";
    int courseId;

}