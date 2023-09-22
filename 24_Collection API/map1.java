/*
now Instade of having index(like 0, 1,2) we want to assigen a name to the list index so
here map concept comes into playground :) Let's have fun with map there is two thing in Map
key & value , value conect the list values & keu=y content we can see index name!
in one word, Map is a collection of Key & Value pair
 */

import java.util.HashMap;
import java.util.Map;

public class map1 {
   public static void main(String[] args) {
    Map<String,Integer> students= new HashMap<>();
    students.put("Arpandev", 80);
    students.put("Priyam", 60);
    students.put("Sayan", 59);
    students.put("Suborno", 40);
    students.put("Atanu", 56);

   }
}
