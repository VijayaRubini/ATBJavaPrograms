package May2024.ex_25052024.WrapperClass;

public class lab211 {
    public static void main(String[] args) {
        int x=231;
        //wrapper class
        //String s1=x;
        //String s1= (String)x; - not possible
        String s1=String.valueOf(x);

        System.out.println(s1);

        Character ch='a';
        char val=ch; // wrapper to primitive- unboxing- it happens automatically.
        Boolean b1=true;
        Long l1=5498l;
        Float f1=56.32f;
        Double d1=4738.21;

        //Wrapper class is used to convert primitive data type into objects.
        //This is used in collection framework, API and automation testing

        Integer intObject= Integer.valueOf(34);
        System.out.println(intObject);

        Integer a2= 56; //autoboxing -Primitive-> Wrapper class - happens automatically

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(3,7));
        System.out.println(Integer.min(54,98));

      //  Integer i1= new Integer(5);
        Integer i2= Integer.valueOf(5); // both are same.,  obj is created at the end.




    }
}
