/*
 Enum is a short term used for Enumeration.
Enumerations serve the purpose of representing a 
group of named constants in a programming language.
Suppose for the below example we have a enum Status which have
some specific constants or error codes. which return some status of the server eg.
Running, Loading, Failed, Sucess
 */


enum Status{
    Running,Loading,Failed, Sucess;
}



public class enum1 {
    public static void main(String[] args) {
        //enum is also treated as a class in Java. 
        //Objects can also be created for enum like:
        //Every enum constant represents an object of type enum.

        Status s=Status.Failed;
        System.out.println(s);
        /*
         In enum, all the name constants are defined by using numbers.
        ordinal() method is used to get the index of the name constant present in the enum.
        values() method is used to get all the statuses or name constants of enums.
         */

        Status [] s1= Status.values();// Note: values() method will give an array.
        for(Status ss:s1){
            System.out.println(ss+" : "+ss.ordinal());
        }
        

    }
}
