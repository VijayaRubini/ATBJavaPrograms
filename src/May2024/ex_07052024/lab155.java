package May2024.ex_07052024;

public class lab155 {
    public static void main(String[] args) {
//return examples
    int money=giveMoneyToFriend(100);
        System.out.println(money);
        giveMoneyToBeg();

    }

    static void giveMoneyToBeg() {
        System.out.println("Blessings!!!");
    }

    static int giveMoneyToFriend(int i) {
        //after 6 month return
        return i*6;
    }
}
