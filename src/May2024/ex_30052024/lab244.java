package May2024.ex_30052024;

import javax.print.attribute.HashAttributeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab244 {
    public static void main(String[] args) {

        List myMarks= new ArrayList();
        myMarks.add(99);
        myMarks.add(97);
        myMarks.add(95);
        myMarks.add(90);
        Collections.sort(myMarks);
        System.out.println(myMarks);

        Student student1 = new Student(1,"Pramod");
        Student student2 = new Student(5,"Shan");
        Student student3 = new Student(3, "Vijay");

        List<Student>  students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
        Collections.sort(students,new SortByIdAsc());
        System.out.println(students);
        Collections.sort(students,new SortByIdDsc());

        System.out.println(students);
        Collections.sort(students,new SortByNameAsc());

        System.out.println(students);
        Collections.sort(students,new SortByNameDsc());

        System.out.println(students);












    }
}
