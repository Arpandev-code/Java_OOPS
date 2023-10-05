//So in last file we saw the tight coupling we are going solve it now.
//So Now we are creating a parent class Computer which is a logical entity there will be empty run method 
//Computer class will be extened by laptop & desktop class so we have create object of laptop or desktop class
//& refernce  of type Computer so we have to create the object of developer class & call the devApp function which passes the Arrument of computer type & call the run mrthod 
//In Next file we will see the better emplemention of this

class Computer
{
    public void run()
    {

    }
}

class desktop extends Computer
{
    public void run()
    {
        System.out.println("Code,Compile,Run....");
    }
}


class Laptop extends Computer
{
    public void run()
    {
        System.out.println("Code,Compile,Run...");
    }
}
class Developer{
    public void devApp(Computer comp)
    {
       comp.run();
    }
}




public class interface5 {
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer desk=new desktop();
        Developer Arpandev =new Developer();
        Arpandev.devApp(lap);
    }

}
