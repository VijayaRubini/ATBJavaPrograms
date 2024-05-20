package May2024.ex_16052024.MultilevelInheritance.apiAutomation;

public class Test extends BaseTest{

    void accessExcelAndSQL(){
        openExcelFile();
        openSQLConnection();
        System.out.println(API_VERSION);
        System.out.println(VERSION);
    }

    void openJSON(){
        System.out.println("Test");
    }
}

