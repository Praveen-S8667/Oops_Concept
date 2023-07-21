class Math_operation{
    int operation(int a)
    {
        int res=a+a;
        return res;
    }
    int operation(int a,int b)
    {
        int res=a-b;
        return res;
    }
    void operation(int a,int b,int c)
    {
        int res=a*b*c;
       // return res;
       System.out.println(res);
    }
}
public class Method_overloading {
    public static void main(String args[])
    {
        Math_operation obj=new Math_operation();
        System.out.println(obj.operation(2));
        System.out.println(obj.operation(2,4));
       // System.out.println(obj.operation(2,3,4));
        obj.operation(2,3,4);





    }
    
}
