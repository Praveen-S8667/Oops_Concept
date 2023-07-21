interface phone
{
    void call();
    void message();
}
interface smartphone{
    void camera();
    void browser();
}
class application{
    void app()
    {
        System.out.println("you can use application");
    }
}
class mobile extends application implements phone,smartphone{
    public void call()
    {
        System.out.println("you can call");
    }
    public void message()
    {
        System.out.println("you can message");  
    }
    public void camera()
    {
        System.out.println("you can take pictures"); 
    }
    public void browser()
    {
        System.out.println("you can browse using internet");
    }

    
}

public class Interfaceclass {
    public static void main(String args[])
    {
        mobile obj=new mobile();
        obj.call();
        obj.message();
        obj.camera();
        obj.browser();
        obj.app();
    }
    
}
