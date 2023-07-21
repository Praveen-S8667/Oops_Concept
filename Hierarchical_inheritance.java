import java.util.*;
class circle{
    Scanner sc=new Scanner(System.in);
    void area0()
    {
        float p=3.14f;
        float r,area;
        r=sc.nextFloat();
        System.out.println("Area of circle:" + (area=p*r*r));
    }
}

class sqr extends circle{
    Scanner sc =new Scanner(System.in);
    void area1()
    {
        int l,area;
        l=sc.nextInt();
        System.out.println("Area of square:" + (area=l*l));
        
    }
}

class rect extends circle{
    Scanner sc =new Scanner(System.in);
    void area2()
    {
        int l,b,area;
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Area of circle:" + (area=l*b));
        
    }
}

public class Hierarchical_inheritance {
    public static void main(String args[])
    {
        sqr obj1=new sqr();
        rect obj2=new rect();
        obj1.area1();
        obj1.area0();
        obj2.area2();


    }
    
}
