package May2024.ex_14052024;

public class BankAccount {

    String bankName;
    int balance;
    String bankCode;

    BankAccount(){
        bankName = "SBI";
        balance = 10890;
        bankCode = "SBIN000021";

    }

    BankAccount(String bankName, String bankCode, int balance){
        this.bankName= bankName;
        this.bankCode= bankCode;
        this.balance= balance;

    }

    void printDetails(){
        System.out.println("Print the account Details");
        System.out.println("Bank Name -> "+bankName);
        System.out.println("Bank Code -> "+bankCode);
        System.out.println("Bank Balance -> "+balance);
    }
}
