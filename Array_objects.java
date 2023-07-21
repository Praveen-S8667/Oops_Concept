//import java.util.*;
class Student
{
    int roll;
    String name;
    Student(int r,String n)
    {
        roll=r;
        name=n;
    }
    void print()
    {
        System.out.println("Roll:"+ roll);
        System.out.println("Roll:"+ name);
        System.out.println("-------------------------------");
    }

}

public class Array_objects {
    public static void main(String []args)
    {
        //Scanner sc=new Scanner(System.in);
        Student[]obj=new Student[2];
        obj[0]=new Student(10,"Dhivya");
        obj[1]=new Student(20,"Bharathi");
        for(int i=0;i<2;i++)
        {
            obj[i].print();
        }
    }
    
}
