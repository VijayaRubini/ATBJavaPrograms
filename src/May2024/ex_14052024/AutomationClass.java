package May2024.ex_14052024;

public class AutomationClass {

    // realtime example for Default constructor
    AutomationClass(){
        dataBaseConnection();
        excelOpen();

    }

    void dataBaseConnection(){

        System.out.println("My sql is created");
    }

    void excelOpen(){

        System.out.println("Excel is opened");
    }
    void testCase1(){
        System.out.println("TC1");
    }
    void testCase2(){
        System.out.println("TC2");
    }

    public static void main(String[] args) {

        AutomationClass a= new AutomationClass();
        a.testCase1();
        a.testCase2();



    }

}
