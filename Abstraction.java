abstract class Mobile{
    void voicecall()
    {
        System.out.println("You can make call");
    }
    abstract void camera();
    abstract void display();

}
class Realme extends Mobile{
    void camera()
    {
        System.out.println("64 maga pixel camera");
    }
    void display()
    {
        System.out.println("6 inch display");
    }
    void fingerprint()
    {
        System.out.println("with finger print sensor");
    }

}
class Vivo extends Mobile{
    void camera()
    {
        System.out.println("48 maga pixel camera");
    }
    void display()
    {
        System.out.println("5 inch display");
    }

}

public class Abstraction {
    public static void main(String args[])
    {
        Realme obj1=new Realme();
        obj1.camera();
        obj1.display();
        obj1.fingerprint();
        obj1.voicecall();
        
        System.out.println("---------------------------------------");

        Vivo obj2=new Vivo();
        obj2.camera();
        obj2.display();
        obj2.voicecall();
    }
    
}
