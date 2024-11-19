package May2024.ex_18052024.AccessModifiers.Police;

public class Cop {

    public int gun;
    private String idCard;

    public Cop(int gun){
        this.gun=gun;
    }

    protected void canIShoot(){
        System.out.println("Ofcourse, Shoot!!");

    }
}
