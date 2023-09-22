import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection1 {
    public static void main(String[] args) {
        Collection values=new ArrayList();
        /*
         As Collection is a Interface so we can't create of it so we have to use ArrayList
         class which implements Collection interface
         Reason for yellow line:
         Collection is a raw type. 
         References to generic type Collection<E> should be parameterized
         here the type is Object (Raw type),

         */

        values.add(2);
        values.add("Arapndev");
        values.add(2.5f);

        Iterator j= values.iterator();
        while(j.hasNext())
        {
            System.out.println(j.next());
        }
         /*
         Two ways we can iterate the values
         1. Using Iterator
         2. Using Enhanced for loop
          */   
        for(Object i : values )
        {
            System.out.println(i);
        }
    }
}
