/*
 throws keyword is used in method signatures to indicate that 
 the method may throw certain types of exceptions.
but does not handle them directly.
the caller of the method is responsible for catching and handling the exception.
-------------------------------------------------------------------------------
suppose if we take a example in real life , create a situation in mind like
you are a software Developer if someday client comes ask you about the project problems
usally you say to them contact to my manager or project head so here a exception occurs for 
software developer he threw the exception(using throws keyword) to the its calling function means the manager
& manager have to handle this situation.
-------------------------------------------------------------------------------
Best case to use the throws keyword instead of handling with try and catch:
throws keyword can be an appropriate way to handle exceptions in certain cases, such as when a method is part of a larger 
program and the exception handling is being handled at a higher level. It can also be useful when creating reusable code that may 
be used in a variety of contexts, where it's not clear how the exceptions should be handled.
*/



class M{
    public void show() throws ClassNotFoundException{
        Class.forName("Demo");
    }
}
public class exception5 {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        M obj=new M();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            /*
This method prints a stack trace for this Throwable object on the error output 
stream that is the value of the field System.err. The first line of output contains 
the result of the toString() method for this object. Remaining lines represent 
data previously recorded by the method fillInStackTrace(). The format of this 
information depends on the implementation, but the following example may be 
regarded as typical:
java.lang.NullPointerException 

        at MyClass.mash(MyClass.java:9)
         at MyClass.crunch(MyClass.java:6)
         at MyClass.main(MyClass.java:3)
             */
        }
        System.out.println("Bye");
        
    }
}
