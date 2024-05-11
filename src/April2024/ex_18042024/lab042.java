package April2024.ex_18042024;

public class lab042 {
    public static void main(String[] args) {
        int a1=300;   // int- 32 bits
       // byte b1=a1;   byte= 8 bits
        byte b1=(byte)a1; //explicit casting  44- // last 8 bits of int is stored in byte.
        System.out.println(b1); // data conversion happend from 300 to 44 as for byte data type

    }
}
