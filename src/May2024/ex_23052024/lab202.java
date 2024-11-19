package May2024.ex_23052024;

public class lab202 {

    public static void main(String[] args) {
        ATB amit = new ATB("+917896543219");
        ATB viji = new ATB("+14556789999");

        amit.printDetails();
        viji.printDetails();
        System.out.println(ATB.courseName);

        ATB ashok = new ATB("98765432123");
        //static block is called once that object is created for a class
        //1 obj and many ref
        //class is loaded only one time


    }
}

class ATB{

    static{ // static block
        System.out.println("I will be  executed when class is loaded, SIB- load one time");
        // called when class is loaded
    }

    {

        System.out.println("IIB-Instance Initiation Block, executed when object is created");
        //called when object is created
    }

    static  String courseName="ATB6X";//static variable- belongs to class
    String phoneNum;// Instance variable

    public ATB(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void printDetails(){
        System.out.println("Your phone Num is  " + phoneNum);
    }
}