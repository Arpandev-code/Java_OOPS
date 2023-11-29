import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String");
        String s1=sc.nextLine();
        System.out.println("Enter 2nd String");
        String s2=sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        sc.close();
        if(s1.length()==s2.length())
        {
            char [] c1=s1.toCharArray();
            char [] c2=s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            boolean isAnagram=Arrays.equals(c1, c2);
            if(isAnagram)
            {
                System.out.println("Anagram");
            }else
            {
                System.out.println("Not Anagram");
            }
            
        }
        else
        {
            System.out.println("Not Anagram");
        }

    }
}
