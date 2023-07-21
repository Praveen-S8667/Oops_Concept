class Father
{
    void print(){
        System.out.println("I am Father");
    }
}
class Son extends Father
{
    void display(){
        System.out.println("I am son");
    }
}

public class Single_inheritance {
    public static void main(String args[])
    {
        Son obj=new Son();
        obj.print();
        obj.display();
        
    }
    
}
