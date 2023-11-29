import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        sc.close();
        boolean isPrime=true;
        if(n<2)
        {
            isPrime=false;
        }
        else{
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                isPrime=false;
                break;
            }
        }
        String result= isPrime? "Prime":"Not prime";
        System.out.println("The given no "+n+ " is "+result);
    }
}
