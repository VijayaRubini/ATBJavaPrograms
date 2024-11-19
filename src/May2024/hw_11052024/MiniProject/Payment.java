package May2024.hw_11052024.MiniProject;

public class Payment {

    int courseFees; //amount
    String paymentType; //card or cash
    String paymentMode;// Debit card or credit card
    String paymentOption; // full payment or emi
    int payableAmount;

    Payment(int courseFees, String paymentType, String paymentMode,String paymentOption, int payableAmount) {
        this.courseFees = courseFees;
        this.paymentType = paymentType;
        this.paymentMode = paymentMode;
        this.paymentOption = paymentOption;
        this.payableAmount = payableAmount;
    }

    void printPaymentDetails(){
        System.out.println("Course Fees : "+this.courseFees);
        System.out.println("Payment Type : "+this.paymentType);
        System.out.println("Payment Mode : "+this.paymentMode);
        System.out.println("Payment Option  : "+this.paymentOption);
        System.out.println("Amount paid : "+this.payableAmount);

    }
}
