package ex_27042024;

public class lab110 {
    public static void main(String[] args) {

        System.out.println("print the value of i, but I want to break when i =5 ");

        for(int i=1;i<=10;i++)
        {
            System.out.println("val of "+i);

            if(i==5)
            {
                break;
            }

            //System.out.println("val of " +i);
        }

        System.out.println("END");

    }
}
