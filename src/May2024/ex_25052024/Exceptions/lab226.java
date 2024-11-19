package May2024.ex_25052024.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab226 {
    public static void main(String[] args) {

        try {
            int  a=10/0;  //unchecked -  JVM dont knw
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader f= new FileReader("C://a.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
