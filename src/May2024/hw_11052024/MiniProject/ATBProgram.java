package May2024.hw_11052024.MiniProject;

public class ATBProgram {
    public static void main(String[] args) {

        Student s1= new Student("Arun",28, 98765401234l, "arun1234@gmail.com");
        Student s2= new Student("Priya", 30, 6758490321l, "priya1287@gmail.com");
        Student s3= new Student("Kumar", 35, 9845782341l, "kumar9876@yahoo.com");


        Course c1= new Course("ATB6X","4 Months","Online");
        Course c2= new Course("ATB4X", "6 Months", "Online");

        Payment p1= new Payment(10000, "Online", "DebitCard", "Full Payment", 10000);
        Payment p2= new Payment(9000,"Online", "Credit Card", "EMI",3000);

        System.out.println("**********Student 1 Details**************");
        s1.printStudentDetails();
        c2.printCourseDetails();
        p1.printPaymentDetails();

        System.out.println("**********Student 2 Details**************");
        s2.printStudentDetails();
        c1.printCourseDetails();
        p2.printPaymentDetails();


        System.out.println("**********Student 3 Details**************");
        s3.printStudentDetails();
        c1.printCourseDetails();
        p1.printPaymentDetails();


    }
}
