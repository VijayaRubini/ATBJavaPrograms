package May2024.ex_18052024.Encapsulation;

public class ICICIBank {
    // private- variables
    //use getter and setters with condition for data members
    //hide data members

    private String name;
    private long balance;
   // String address;
   // long phoneno;


    public ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Not Allowed!!!");
        }
    }
}
