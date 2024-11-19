package May2024.ex_25052024.Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception {
        //Creating customized exception

        if (!bankName.currency.equalsIgnoreCase("INR")) {
            throw new Exception("Currency Doesn't match");
        }
        Integer sum = this.amount + bankName.amount;
        return sum;

    }

    public Integer add1(Bank bankName1) {

        try {
            if (!bankName1.currency.equalsIgnoreCase("INR")) {
                throw new Exception("Currency Doesn't match");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Integer sum1 = this.amount + bankName1.amount;
        return sum1;

    }
}
