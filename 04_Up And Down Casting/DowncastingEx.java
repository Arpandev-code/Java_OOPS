class parent
{
    void cry()
    {
        System.out.println("Parents Crying");

    }
    void sleep()
    {
        System.out.println("Parents sleeping");
    }
    void eat()
    {
        System.out.println("Parents Eating");
    }

}
class child extends parent{
    void eat()
    {
        System.out.println("Child Eating Junk food");
    }
    void smoking()
    {
        System.out.println("Child Smoking");
    }
}



public class DowncastingEx {
    public static void main(String[] args) {
        //We are creating child object which are refearing by parent type So prarent know that his/her child eating junk food 
        parent obj=new child();
        obj.eat();
        //Parent don't know about smoking ,If parents want to know then we have to downcat the object refernce type to child
        // obj.smoking();
        ((child)obj).smoking();
    }
    
}
