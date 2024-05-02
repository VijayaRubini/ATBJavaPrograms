package ex_02052024;

public class lab124 {
    public static void main(String[] args) {

        int[] age={27,28,29,30,31}; //fixed elements

        int[] ages2=new int[5]; //arrays are non primitive, all values are  0 by default
        //here default values - 0
        System.out.println(ages2[0]); //0
        System.out.println(ages2[4]); //0

        ages2[0]=15;
        System.out.println(ages2[0]); //15

        String[] breakfast_items={"idli","Dosa","coffee","tea","poha","fruits"};
        System.out.println(breakfast_items.length);//6
    }
}
