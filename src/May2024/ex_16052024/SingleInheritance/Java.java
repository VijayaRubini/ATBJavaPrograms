package May2024.ex_16052024.SingleInheritance;

public class Java extends Programming{
    //Single Inheritance - is A
    //Java is a programming language
    //Python is a programming language

    String newFeature;
    Java(){
        System.out.println("DC");
    }

    Java(String newFeature){
        this.newFeature = newFeature;

    }

    void printInfo(){
        System.out.println("Feature is ->  "+this.newFeature);

        bhk3();
    }


}
