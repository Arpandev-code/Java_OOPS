/*
throw keyword in Java is used to explicitly throw an exception. 
When an exception is thrown using the throw keyword, 
the execution of the current method is stopped.
 */


public class exception3 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            //handle the exception using throw
            j=18/i;
            if(j==0) throw new ArithmeticException("I don't want zero");
            // throw new ArithmeticException() is non parametrized constructor
            /*
             throw keyword is used to throw exceptions, not to catch them. To catch exceptions, you need to use a try-catch block.
            if you do not use try-catch then the control is passed, where the method is called.
            when you want to pass message to an exception 
            then you should use the parametrized constructor instead non parameterized constructor 
             */
        }
        catch(ArithmeticException obj){
            j=18/1;
            System.out.println("Backup Database connected "+obj+" and J value "+j);
        }
    }
}
