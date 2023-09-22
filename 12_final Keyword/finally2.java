/*
 try with resource:
try-with-resources statement, we can simplify this code and avoid the 
need for a finally block:

 */

import java.util.Scanner;

public class finally2 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in))
        {
            int num2=sc.nextInt();
            System.out.println(num2);
        }
        /*
    In Java, you can use the try-with-resources statement to close multiple resources automatically. 
   The try-with-resources statement is a feature introduced in Java 7 that allows you to declare resources 
   within a try block and ensure that they are closed automatically when the block is exited, whether normally 
   or due to an exception.
   
   if you check in Scanner Class , it's implementing Closeable interface which also extended a Autocloseble class
   the class extends AutoCloseble or implements Closeble interface we can use try with resourse statement
   "public final class Scanner implements Iterator<String>, Closeable {"

         */
    }
}
