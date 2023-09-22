import java.util.ArrayList;
import java.util.Vector;

public class vector1 {
    public static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<Integer>();//1. No waste of memory 2.ThreadSafe 3.Fast
    //     Vector<Integer> values= new Vector<Integer>();//1.Waste of Memory 2. Not threadSafe 3.Slow
    //     values.add(1);
    //     values.add(2);
    //     values.add(3);
    //     values.add(4);
    //     values.add(5);
    //     values.add(6);
    //     values.add(7);
    //     values.add(8);
    //     values.add(9);
    //     values.add(10);
    //     values.add(11);
    //     System.out.println(values.capacity());
    values.add(0,2);
    values.add(0,3);
    values.add(0,4);
    values.add(0,5);
    

    }

}
