package May2024.ex_07052024;

public class lab157 {
    public static void main(String[] args) {
        f1();
        String[] names={"Viji", "Ruby"};
        f1(names);

    }

    static void f1(){
        f2();
        System.out.println("F1");
    }
    static void f1(String[] a){
        for(String name :a) //for each loop
            System.out.println(name);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
    static void f2(){
        System.out.println("F2");
    }
}
