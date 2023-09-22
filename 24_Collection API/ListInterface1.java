import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface1 {
    public static void main(String[] args) {
        List<Integer> values= new ArrayList<>();
        values.add(0, 1);
        values.add(1, 2);
        values.add(2, 3);
        values.add(3, 4);
        /*
A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements. The  ArrayList, which is used for better-performing implementation.
 The add and addAll operations always append the new element(s) to the end of the list. 
We can't sort the values in collection cuz sort doesn't work for collection interface
         
*/

        Collections.sort(values);
        for(int i:values)
        {
            System.out.println(i);
        }

    }
}
