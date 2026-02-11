import java.util.*;

public class Student implements Comparable<Student> {

    Scanner sc=new Scanner(System.in);

    int age;
    String name;


    Student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }


    public int compareTo(Student that)
    {
        if(this.age > that.age)
        {
            return 1;
        }else
        {
            return -1;
        }
    }


    
    public static void main(String[] args) {
        


        List<Student> ob=new ArrayList<Student>();
        ob.add(new Student(45, "Sahil"));
        ob.add(new Student(5, "Jack"));
        ob.add(new Student(25, "Jill"));


        
        Collections.sort(ob);
        for(Student i:ob)
        {
            System.out.println("Name :"+i.name+" Age :"+i.age);
        }
        

        



    }


}
