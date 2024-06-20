package May2024.ex_21052024.Abstraction.RealEx;

abstract class BaseClass {
    //web automation
    //Hierarchical inheritance: base class- child1, child 2

    abstract void openBrowser();
    abstract void closeBrowser();

    void printLog(){
        System.out.println("Logs");
    }
}
