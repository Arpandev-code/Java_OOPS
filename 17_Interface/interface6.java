interface Computer
{
    public void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code,Compile,Run...");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code,Compile,Run...Faster");
    }
}



class Developer
{
    public void devApp(Computer comp)
    {
        comp.code();
    }
}




public class interface6 {
    public static void main(String[] args) {
        Computer desk=new Desktop();
        Computer lap=new Laptop();
        Developer Arpan= new Developer();
        Arpan.devApp(lap);
    }
}
