class varargs{
    static void string(String... names)
    {
        for(String name:names)
        {
            System.out.println(name);
        }

    }
}

public class Method_varargs {
    public static void main(String args[])
    {
        varargs obj=new varargs();
        obj.string("Naruto","Hinata","Sakura");
    }
    
}
