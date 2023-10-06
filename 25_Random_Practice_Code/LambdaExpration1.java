
@FunctionalInterface
interface A 
{
    final static int i=10; // always final static cuz we can't change the value of varible not even makes sense as we can't create object of A interface, for same reason it's static 
    public abstract void show();// Always public abstrct if you're not even mention i always there
}





class LambdaExpration1{
    public static void main(String[] args) {
        // A obj=new A() //We are  craeting annonimus inner class
        // {
        //     public void show()
        //     {
        //         System.out.println("In New Show");
        //     }
        // };
        A obj= ()-> System.out.println("In New Show");// If there is any functional interface we can use Lambda Expration
        obj.show();
    }
}