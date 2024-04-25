package ex_18042024;

public class lab043 {
    public static void main(String[] args) {

        float course=100;
        float gst=18.45f;
        double total=course+gst;
        System.out.println(total); // 118.44999694824219

        double total1=course+(int)gst; //explicit casting
        System.out.println(total1); // 118.0



    }
}
