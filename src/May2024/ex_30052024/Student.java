package May2024.ex_30052024;


import java.util.Comparator;

class  SortByIdAsc   implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class  SortByIdDsc   implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}

class  SortByNameAsc   implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class  SortByNameDsc   implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

public class Student implements Comparable<Student> {
      String name;
      Integer id;

    public Student(Integer  id, String name) {
        this.id= id;
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String toString(){
        return "{Student "+
                "id = "+id+
                ",name ='"+name+'\''+
                '}';



   }

    @Override
  //  public int compareTo(Student o) {
    //    return Integer.compare(this.id,o.id);
    //}

    public int compareTo(Student o) {
        return CharSequence.compare(this.name,o.name);
    }
}
