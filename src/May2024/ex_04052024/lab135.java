package May2024.ex_04052024;

public class lab135 {
    public static void main(String[] args) {
        //max salary for array

        int[] salaries={30,50,60,90,10,100,999};
        //loop logic - for
        //salaries[i]>max
        int max_salary=Integer.MIN_VALUE;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(max_salary);
        System.out.println(Integer.MAX_VALUE);

        for(int i=0;i<salaries.length;i++)
        {
            if(salaries[i]>max_salary)
            {
                max_salary=salaries[i];
            }
        }
        System.out.println("Max salary is  "+ max_salary);

        int j=0;
        while(j<salaries.length){
            if(salaries[j]>max_salary) {
                max_salary = salaries[j];
            }
            j++;
        }
        System.out.println("Max salary is  "+max_salary);
    }
}
