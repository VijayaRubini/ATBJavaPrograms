package May2024.ex_25052024.WrapperClass;

public class lab214 {
    public static void main(String[] args) {

        Integer x=200, y=200;

        if(x==y){
            System.out.println("Both are Same");
        }
        else {
            System.out.println("Both are not same");
        }


        Integer a=new Integer(40), b=new Integer(40);

        if(a==b){
            System.out.println("Both are same");
        }
        else
            System.out.println("Both are not same");


        Integer a1=20, b1=20;
        if(a1==b1)
            System.out.println("Same");
        else
            System.out.println("Not same");


        Integer x1=new Integer(10);
        Integer y1=10;

        System.out.println(x1==y1);
    }

}
