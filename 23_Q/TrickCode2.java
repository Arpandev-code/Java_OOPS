//Write a code to print numbers from 1 to 10 without using loops


public class TrickCode2 {
    public static void NumberPrint(int n)
    {   
        if(n>0)
        NumberPrint(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        NumberPrint(10);
    }
}
