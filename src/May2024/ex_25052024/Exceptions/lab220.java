package May2024.ex_25052024.Exceptions;

import java.io.FileInputStream;

public class lab220 {
    public static void main(String[] args) {

        //Exception
        //Checked - JVM knows
        //Unchecked - JVM  doesnt knws

        //checked - JVM knws the file it is present or not
       // FileInputStream f=new FileInputStream("c:/log.txt");
        //file io-open;

        try{
            FileInputStream f=new FileInputStream("c:/log.txt");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        //unchecked- JVM knows while execution only. It doesnt knws initially
        int a=10;
        int c=a/0;
        System.out.println(c);

        String sh=null;
        sh.trim();


    }
}
