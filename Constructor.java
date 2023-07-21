class Rectangle{
    int length;
    int width;
    /*Constructor call when the object is created */
    Rectangle()//Default constructor
    {
        length=10;
        width=20;
    }
    Rectangle(int x,int y)//Parameterised constructor
    {
        length=x;
        width=y;
    }
    
    int area()
    {
        int a=length*width;
        return a;
    }

}
public class Constructor {
    public static void main(String args[])
    {
        Rectangle obj1=new Rectangle();
        Rectangle obj2=new Rectangle(10,10);
        System.out.println("Area:"+obj1.area());
        System.out.println("Area:"+obj2.area());


    }
    
}
