/*
 Java provides a set of built-in exceptions that cover most of 
 the common error scenarios in a program.
there may be cases where we need to define 
our own exception class to represent an error 
specific to your program
 */
// this class is own exception class defined by according to our need
//MyException is a custom exception class that extends the Exception class.

class ArpandevException extends Exception{

    /*
     Now we want to pass some message 
    -- we need a constructor that takes a String message,
     which is passed to the parent constructor using the super keyword.
     */
    public ArpandevException(String str){
        super(str);
    }
}
//Note: we can add additional properties and methods to your custom exception class as needed, 
//just like you would with any other Java class.


public class exception4 {
 public static void main(String[] args) {
    int i=20;
    int j=0;

    try{
        j=18/i;
        if(j==0) new ArpandevException("Error Found in Database");

    }catch(Exception e){
        System.out.println();
    }
 }   
}
/*
 Important Notes:
-- we can create a custom exception by extending the Throwable class in Java 
-- we can create a custom exception by extending the Exception class in Java
-- we can create a custom exception by extending  the Exception class or one of its subclasses, such as RuntimeException.
 */