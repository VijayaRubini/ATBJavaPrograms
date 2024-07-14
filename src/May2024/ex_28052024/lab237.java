package May2024.ex_28052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab237 {
    public static void main(String[] args) {
        //API Endpoints
        //Pages-  Login page,   dashboard, Homepage
        List url_pages = new ArrayList();
        url_pages.add("Login Page");
        url_pages.add("Dashboard");
        url_pages.add("Home Page");
        System.out.println(url_pages);

        System.out.println("Print-1");
        for(int i=0;i< url_pages.size();i++)
        {
            System.out.println(url_pages.get(i));
        }

        System.out.println("Print-2");
        for(Object itr : url_pages)
        {
            System.out.println(itr);
        }

        System.out.println("Print  -3 ");
        Iterator obj = url_pages.iterator();
        while (obj.hasNext())
        {
            System.out.println(obj.next());
        }




    }
}
