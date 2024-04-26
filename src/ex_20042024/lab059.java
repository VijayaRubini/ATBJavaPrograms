package ex_20042024;

public class lab059 {
    public static void main(String[] args) {
        String name="The Testing Academy"; //scp
        String name1="The Testing Academy"; //scp
        String name2=new String("The Testing Academy"); //heap area or OA

        System.out.println(name==name1); //checks for references and not the values -true
        System.out.println(name.equals(name1)); // checks for the values -true

        System.out.println(name==name2); //false - ref are different
        System.out.println(name.equals(name2)); //true - values are same


    }

}
