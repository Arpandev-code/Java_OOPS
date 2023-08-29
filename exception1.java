/*
 In Java, the try-catch block is used to handle exceptions. It allows you to write code that handles exceptions that may be thrown during the execution of your program. 
 */

public class exception1 {
    public static void main(String[] args) {
        int i=0;
        int j=8;
        try{
            j=j/i;
        }catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("Bye");


        
    }
}
