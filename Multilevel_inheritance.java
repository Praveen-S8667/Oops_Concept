class grandfather{
    void land()
    {
        System.out.println("10 acers of land");
    }
}
class father extends grandfather{
    void house()
    {
        System.out.println("2 block house");
    }
}
class son extends father{
    void car()
    {
        System.out.println("BMW car");
    }
}

public class Multilevel_inheritance {
    public static void main(String args[])
    {
        son obj=new son();
        obj.land();
        obj.house();
        obj.car();

    }
    
}
