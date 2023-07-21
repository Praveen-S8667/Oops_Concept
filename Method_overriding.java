class user{
    String name;
    int age;
    user(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);

    }
}
class programmer extends user{
    String company;
    programmer(String name,int age,String company)
    {
        super(name,age);
        this.company=company;

    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(company);


    }
}

public class Method_overriding {
    public static void main(String args[])
    {
        programmer obj=new programmer("praveen",19,"Rently");
        obj.display();
    }
    
}
