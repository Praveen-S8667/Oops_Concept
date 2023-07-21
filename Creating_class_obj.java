
/*This code is for accessing the other class by creating the object */
class Rectangle{

    int area()
    {
        int a =length*width;
        return a;
    }

}

public class Creating_class_obj {
    public static void main(String args[])
    {
        Rectangle obj=new Rectangle();
        obj.length=10;
        obj.width=20;
        System.out.println("Area of the rectangle:"+obj.area());

    }
    
}
