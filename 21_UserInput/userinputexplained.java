import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class userinputexplained {
    public static void main(String[] args) throws IOException{ //Not recommaned to use throws keyword in main method 
        System.out.println("Enter a number(Using BufferedReader)");
        /*
         System.out.println() used to display the output in the console
         println is a method of  printStream class that means if you want to call
         println we have to create object of PrintStream class but don't worry 
         we don't have craete a object the beauty is the object is already craeted but 
         the object is created that's is static which is in System class soo we can direacty 
         say system.out without creating a system class object & then call the println method
         i.e. System.out.println()
         */
        //using BufferReader(Now a no one use it)
        InputStreamReader sc= new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(sc);
        int num= Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();
        
        //Using Scanner Class
        System.out.println("Enter a number(using Scanner Class)");
        Scanner s= new Scanner(System.in);
        int num1 = s.nextInt();
        System.out.println(num1);
        s.close();

    }
}
