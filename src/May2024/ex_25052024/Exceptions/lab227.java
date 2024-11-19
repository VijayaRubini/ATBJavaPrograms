package May2024.ex_25052024.Exceptions;

public class lab227 {
    public static void main(String[] args) throws Exception {

        Bank sbi=new Bank("INR",100);
        Bank jpMorgan = new Bank("USD", 10);
        Bank  icici=new Bank("USD", 200);

        Integer total= sbi.add(jpMorgan);
        Integer total1= sbi.add1(icici);

        System.out.println(total);
        System.out.println(total1);
    }
}
