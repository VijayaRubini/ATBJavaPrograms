package May2024.ex_25052024.ENUM;


public class lab216 {
    public static void main(String[] args) {
        APIENDPOINTS e=APIENDPOINTS.LOGIN;
        switch(e){
            case  LOGIN-> System.out.println("LOGIN page code should be executed");
            case DASHBOARD -> System.out.println("DASHBOARD page code should be executed");
        }
    }
}
