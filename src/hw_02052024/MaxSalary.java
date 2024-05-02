package hw_02052024;

import java.util.Scanner;

public class MaxSalary {
    public static void main(String[] args) {
        int[] salary={30,50,60,90,10,100,99};
        int max=0;
        for (int i = 0; i < salary.length; i++) {
            if(salary[i]>max){
                max=salary[i];
            }
        }
        System.out.println("Maximum of given numbers is "+max);
    }
}
