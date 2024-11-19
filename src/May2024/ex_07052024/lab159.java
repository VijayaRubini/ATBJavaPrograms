package May2024.ex_07052024;

public class lab159 {
    public static void main(String[] args) {
        //realtime example of functions

        openBrowser();
        testLoginPage1();
        testLoginPage("Page2");
        closeBrowser();

        openBrowser();
        testLoginPage("Page3");
        closeBrowser();

        openBrowser();
        testLoginPage("Page4");
        closeBrowser();

        openBrowser();
        testLoginPage("Page5");
        closeBrowser();

        openBrowser();
        testLoginPage("Page6");
        closeBrowser();
    }

    static void testLoginPage1() {
        System.out.println("Testing page1 opened");
    }

    static void testLoginPage(String page) {
        System.out.println("Testing -> "+page);
    }


    static void openBrowser() {
        System.out.println("Chrome browser opened");
    }
    static void closeBrowser() {
        System.out.println("Chrome browser closed");
    }
}
