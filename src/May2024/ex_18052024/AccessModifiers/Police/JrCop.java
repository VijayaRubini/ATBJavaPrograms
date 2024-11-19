package May2024.ex_18052024.AccessModifiers.Police;

public class JrCop {
    public static void main(String[] args) {


        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        cop.canIShoot();
    }
}
