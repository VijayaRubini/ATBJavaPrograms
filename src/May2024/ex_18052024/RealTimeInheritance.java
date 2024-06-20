package May2024.ex_18052024;

public class RealTimeInheritance {
    public static void main(String[] args) {

        BaseClass t1=new Test();
        t1.setBrowser("Edge", true);
        t1.openBrowser();
        t1.closeBrowser();
    }

}

class Test extends BaseClass{
    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
        System.out.println("I am done!!");
    }
}

class BaseClass{

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
       if(isAuth) {
           this.browser = browser;
       }
       else{
           System.out.println("Not Allowed!!!");
       }
    }

    void openBrowser(){
        System.out.println("Open Browser");
    }
    void openBrowser(String browserName){
        System.out.println("Open Browser : "+browserName );
    }

    void closeBrowser(){
        System.out.println("Close Browser");
    }

}