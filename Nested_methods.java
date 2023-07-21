class summa{
    int m,n;
    summa(int x,int y)
    {
        m=x;
        n=y;
    }
    int largest()
    {
        if(m>n)
        {
            return m;
        }
        else
            return n;
    }
    void display()
    {
        int large=largest();
        System.out.println(large);
    }
}

public class Nested_methods {
    public static void main(String args[])
    {
        summa obj=new summa(10,20);
        obj.display();
    }
    
}
