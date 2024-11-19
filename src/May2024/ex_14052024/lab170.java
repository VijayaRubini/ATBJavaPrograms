package May2024.ex_14052024;

public class lab170 {
    public static void main(String[] args) {
        ATBPerson amitRef = new ATBPerson();
        ATBPerson swapnilRef = new ATBPerson();
        // constructor- created 1 time
        // called 2 times

        ATBPerson premRef= new ATBPerson("Prem");
        System.out.println(premRef.name);
        System.out.println(premRef.phone);

        ATBPerson ratulRef = new ATBPerson("Ratul");
        System.out.println(ratulRef.name);
        System.out.println(ratulRef.phone);

        ATBPerson arunRef = new ATBPerson("Arun", 9876344290l);
        System.out.println(arunRef.name);
        System.out.println(arunRef.phone);

        ATBPerson vijiRef = new ATBPerson("Viji", 6543239876l);
        System.out.println(vijiRef.name);
        System.out.println(vijiRef.phone);

        ATBPerson pramodRef = new ATBPerson("Pramod", 9876123405l, "pramod1234@gmail.com",false, "ATB6X");
        System.out.println(pramodRef.name);
        System.out.println(pramodRef.phone);
        System.out.println(pramodRef.email);
        System.out.println(pramodRef.isMarried);
        System.out.println(pramodRef.courseName);

    }


}
