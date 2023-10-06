/*
 Normal interface 
Normal interface contains two or more abstract method.
It can have any number of static and default methods and also even public methods of Object classes.
you can declare variable which are public static final by deault
eg:
 */
interface A{
    void show();
    void play();
}
/*
 Functional Interface:
Functional Interface is an interface that has only pure one abstract method.
It can have any number of static and default methods and also even public methods of Object classes
e.g Runnable interface : It contains only  run()  method 
 */
interface B{
    void show();
}
/*
 Marker Interface:
An interface that does not contain any methods, fields, Abstract Methods, and any Constants is Called a Marker interface.
Also, if an interface is empty, then it is known as Marker Interface.
The Serializable and the Cloneable interfaces are examples of Marker interfaces.
 */
interface C{

}

/* suppose we created a object in heap memory it have some data &
the process to store that the object's data in hard drive called Serialization & destroy the object
now if we recrate the object & the process of restoring the data in object called deserialization.

Every objects aren't allowed to do that , so we need marker interface

reallife eg:
if we are playing games suddenly we closed it & the data stores in harddrive
when we resume the game the data got retrive from the hard drive 

*/






public class interface3 {
    
}

