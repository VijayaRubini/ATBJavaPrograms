package May2024.ex_25052024.ENUM;

public enum APIENDPOINTS {
    HOME("https://app.vwo.com","Home Page"),
    LOGIN("https://app.vwo.com/login","Login Page"),
    DASHBOARD("https://app.vwo.com/dashboard","Dashboard Page");

    String url;
    String page;
    //url- http://app.vwo.com :  home page
    //url- https://app,vwo.com/login : login page
    //url- https://app,vwo.com/dashboard : dashboard page

    APIENDPOINTS(String url, String page) {
        this.url = url;
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
