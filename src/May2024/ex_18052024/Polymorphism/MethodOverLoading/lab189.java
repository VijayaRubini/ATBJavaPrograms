package May2024.ex_18052024.Polymorphism.MethodOverLoading;

public class lab189 {
    //constructor overloading
    lab189(){

    }
    lab189(int a){

    }
    lab189(int a,int b){

    }
    lab189(int a, String b){

    }
    // order of arquments also checked
    //method overloading - same function name with diff arguments.
    void Gift(String a){
        System.out.println("A is a string : "+a);
    }
    
    int Gift(int x){
        System.out.println("X is an integer : "+x);
        return x;
    }
    
    int Gift(float x){
        System.out.println("X is float : "+x);
        return 89;
    }

    void Gift(double x){
        System.out.println("X is a double : "+x);

    }

    public static void main(String[] args) {
        lab189 p= new lab189();
        p.Gift(10);

    }

}
