package May2024.hw_11052024.MiniProject;

public class Student {
    String name;
    int age;
    long phone_no;
    String email;

    Student(String name, int age, long phone_no, String email) {
        this.name = name;
        this.age = age;
        this.phone_no = phone_no;
        this.email = email;
    }


    void printStudentDetails(){
        //System.out.println("Student Details");
        System.out.println("Name :  "+this.name);
        System.out.println("Age  :  "+this.age);
        System.out.println("Phone No. :  "+this.phone_no);
        System.out.println("Email id :  "+this.email);
    }
}
