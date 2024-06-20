package May2024.ex_18052024.Encapsulation;

public class lab193 {
    public static void main(String[] args) {

        ICICIBank i= new ICICIBank("Viji",198);
        System.out.println(i.getBalance());
        i.setBalance(-100);
        //i.name="admin";- not possible
        //i.setName("Admin");
        System.out.println(i.getBalance());

    }
}
