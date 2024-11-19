package May2024.ex_25052024.ENUM;

public class lab217 {
    public static void main(String[] args) {
        //Only test related to login

        APIENDPOINTS ref = APIENDPOINTS.LOGIN;
        System.out.println(ref.getPage());
        System.out.println(ref.getUrl());
       // driver.get(ref.getUrl()) - vl be used in selenium
    }
}
