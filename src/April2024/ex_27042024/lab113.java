package April2024.ex_27042024;

public class lab113 {
    public static void main(String[] args) {
        //continue keyword -----> if this is true then continue

        for(int i=0;i<10;i++)
        {
            System.out.println(i);

            if(i==5)    //0 after, 1 after,2 after, 3 after, 4 after, 5, 6 after, 7 after...9 after
            {
                continue;
            }
            System.out.println("After!!!");
        }

    }
}
