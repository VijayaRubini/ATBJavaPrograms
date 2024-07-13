package May2024.ex_25052024.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab225 {
    public static void main(String[] args) throws FileNotFoundException {
        
        readFile("C://a.txt");
        

        
    }

    private static void readFile(String s) throws FileNotFoundException {

        int  a=10/10;
        int c=0;
//int b= 10/c;
       /*
        try{
            FileReader  fileReader= new FileReader("C://a.txt");

        }catch(Exception e){
            System.out.println("File not found");

        }
        */

        FileReader  fileReader= new FileReader("C://a.txt");


    }
}
