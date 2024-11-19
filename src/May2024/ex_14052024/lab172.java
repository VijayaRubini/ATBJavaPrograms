package May2024.ex_14052024;

public class lab172 {
    public static void main(String[] args) {

        BankAccount sbiRef = new BankAccount();
        sbiRef.printDetails();

        BankAccount hdfcRef = new BankAccount("HDFC","hdfc0012", 12300);
        hdfcRef.printDetails();

    }
}
