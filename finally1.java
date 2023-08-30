import java.util.Scanner;

public class finally1 {
    public static void main(String[] args) {
         Scanner sc= null;
        try{
            sc=new Scanner(System.in);
            int num= sc.nextInt();
            System.out.println(num);
        }
        finally{
          /*
           finally always execute either exception occured 
            or not  so that it is  used to close the resources.
            basically if you have to close something like database connection etc. you 
            can use the finally block to close the connection.
           */
          sc.close();
          //next part we will see the alternative way to close the resouce :)

        }
    }
}
