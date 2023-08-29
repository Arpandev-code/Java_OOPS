/*
 class-class-> extends
 class-interface->implements
 interface-interface->extends
 */


interface Server{
    public void run();
}
interface device{
    public void config();

}

interface Server2 extends Server{
    
}
class Client implements Server2{
    public void run(){
        System.out.println("Server running......");
    }
    //Note: if you don't mention public Acess Spacifier run method show a error->
    //Cannot reduce the visibility of the inherited method from Server
}
class FullApp implements Server,device{
    public void run(){
        System.out.println("Full App Running.....");
    }
    public void config(){
        System.out.println("Config.....");
    }
}








public class interface2 {
    public static void main(String[] args) {
       FullApp obj= new FullApp();
       obj.run();
        obj.config();
        Server obj1= new FullApp();
        obj1.run();
       // obj1.config();

        /*
         Whenever you create a reference of an interface and create an object of a class, 
         then you can only call those methods by that 
         reference that are present in that interface of which the refernce is created.
         Methods of another interface can be called by using another reference 
         variable for that interface with the object of a class.

        */

    }
}
