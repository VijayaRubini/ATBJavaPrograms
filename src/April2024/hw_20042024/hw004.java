package April2024.hw_20042024;

public class hw004 {
    public static void main(String[] args) {
        //find value of x, y ,z
        //cube root of ( x^2 + y^2 -|z|)

        int x=10;
        float y= 12.4f;
        float z= 56.78f;
        double result;

        result =  Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println("Result is  " + result);


    }
}
