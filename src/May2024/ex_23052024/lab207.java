package May2024.ex_23052024;

public class lab207 {
    public static void main(String[] args) {


        //  OOC oc =new OOC();
        OOC.SNIC snic = new OOC.SNIC();
        snic.show();
    }
}

class OOC{
    static int o=10;
    int oa=20;

    static class SNIC{
        void show(){
            System.out.println(o);
           // System.out.println(oa);- cannot access non static variables within static class
        }
    }
}
