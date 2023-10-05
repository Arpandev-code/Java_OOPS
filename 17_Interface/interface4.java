
class Laptop
{
    public void run()
    {
        System.out.println("Code,Compile,Run...");
    }
}

//Here tightCopuleing happening as the developer Dependant on laptop only but developer shouldn't be dependant 
//on Laptop only he/she should be able to code on both desktop & laptop, solution of this problem in next file
class Developer{
    public void devApp(Laptop lap)
    {
       lap.run();
    }
}



public class interface4 {
    public static void main(String[] args) {
        Laptop lap= new Laptop();

    }
}
