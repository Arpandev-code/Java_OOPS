/*
 Every constructor in java has a method which is there, even if we don't mention it
 that's the super method.
 */

class A{
    public A(int n){
        super();
        System.out.println("in A int");
    }
    public A(){
        super();
         /*
          NOTE: Every class in java extends the object class which is in java.lang
        package. so this super method will class the object class constructor before 
        printing below value.
         */
        System.out.println("in A constructor");
    }
}
class B extends A{
    public B(int n){
        this();// this method will execute the constructor of the same class
        //super(); // super method will execute the constructor of the super class
        System.out.println("In B int");
    }
    public B(){
        super();
        System.out.println("in B constructor");
    }
}


public class thisandsupermethod {
    public static void main(String[] args) {
        B obj= new B();
    }
}
