import java.util.ArrayList;
import java.util.Collection;

public class collection2 {
    public static void main(String[] args) {
        Collection<Integer> values=new ArrayList<>();
        /*
         Now it's a Integer generic type so we can add Integer values
         */
        values.add(5);
        values.add(2);
        for(int i:values)// autoboxing: automatically convert Integer generic type(Object type) to premetive int data type

        {
            System.out.println(i);
        }
        
    }
}
