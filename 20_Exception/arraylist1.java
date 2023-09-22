import java.util.ArrayList;
import java.util.List;

/*
 The collection interface belongs to java.util.Collection package. All classes and methods of collection interface belong to this java.util package.
- API means a library or some features that we can use directly, we do not need to define an implementation for it.
- Collections List, Queue, Map and Set simply extend the Collection interface and this collection interface must have its own class implementation.
- we can also convert a collection into an array.
 */

public class arraylist1 {
    public static void main(String[] args) {
        // To define the data types in collection API, we use Generics.
        //Here, we use Integer as it is a class, while int is a primitive data type.
        //ArrayList is a class that implements a list. The list does not have a method called get because it list works with an index in the values.
        List<Integer> nums= new ArrayList<Integer>();
//- We can add values in a collection by using the add() method.
//We do not have indexing for the collection API.
//In the array, we need to specify its type of it. While Collection API works with objects.
// All the data types classes like integer and float extend an object class and thus collection API directly use an object.
//It uses a dynamic array to store the duplicate element of different data types.        
        nums.add(5);
        nums.add(6);
        nums.add(7);

        System.out.println(nums.get(2));
        
        for(int n: nums){
            System.out.println(n);
        }
    }
}
