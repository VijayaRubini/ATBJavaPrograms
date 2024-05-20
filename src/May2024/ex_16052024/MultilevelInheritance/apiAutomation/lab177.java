package May2024.ex_16052024.MultilevelInheritance.apiAutomation;

public class lab177 {
    public static void main(String[] args) {

        Test t1 = new Test();
        t1.openExcelFile();
        t1.openSQLConnection();
        int a = t1.API_VERSION;

        CommonToAll c = new Test();
        c.openExcelFile();
        c.openJSON();


    }
}
