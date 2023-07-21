/*This code is for getting and setting the private variable 
value by using the getter and setter method */
class Rectangle{
    private int length,width;
    //Getter method...
    int getlength()
    {   
        return length;
    }
    int getwidth()
    {   
        return width;
    }
    //Setter method...
    void setlength(int l)
    {   
        length=l;
    }
    void setwidth(int m)
    {   
        width=m;
    }

    int area()
    {
        int a =length*width;
        return a;
    }

}

public class Getter_Setter {
    public static void main (String args[])
    {
        Rectangle obj=new Rectangle();
        obj.setlength(10);
        obj.setwidth(10);
        System.out.println("Area of the rectangle:"+obj.area());
        System.out.println("Length:"+obj.getlength());
        System.out.println("Width:"+obj.getwidth());

    }
    
}
