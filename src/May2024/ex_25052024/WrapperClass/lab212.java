package May2024.ex_25052024.WrapperClass;

public class lab212 {
    public static void main(String[] args) {


    }
}

class PersonATB{

    Integer rollNo;
    String name;
    Long phoneNumber;

    public PersonATB(Integer rollNo, String name, Long phoneNumber) {
        this.rollNo = rollNo;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}