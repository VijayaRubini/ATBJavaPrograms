package May2024.ex_04052024;

public class lab140 {
    public static void main(String[] args) {

        int n=3;
        for (int i=0;i<n;i++){
           // for(int j=0;j<n;j++){
            for(int j=0;j<i;j++){
                System.out.print(i);
                System.out.print('\t');
                System.out.print(j);
                //System.out.print('\t');
            }
            System.out.println();
        }


        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("Viji  ");
            }
            System.out.println("");

        }


        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
