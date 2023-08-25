abstract class Car{ //Abstract class
    abstract public void Drive();// Abstract Method
    /*
     Abstract method:-
- >  Instead of defining the method, we can declare the method.
- >  If we put a semicolon at the end of a method, it means that you only declare the method like:
    public void drive();
-   This method does not contain any features and you will not be able to create an object of it.
-   You need to add an abstract keyword to only declare a method.
     */
    public void playMusic(){
        System.out.println(" Playing......");
    }
}
abstract class WagonR extends Car{ // Abstract class
    /*
     Abstract class:-
- Abstract methods can only be defined in an abstract class.
- We need to add an abstract keyword before a class to make it an abstract class.
- Objects of an abstract class can not be created.
- If you are extending an abstract class, then it is compulsory to define all abstract methods.
- It is not necessary that an abstract class should have an abstract method.
- Abstract class can have an abstract or a normal method or both.
- An abstract class can have more than one abstract method.
     */
    public abstract void fly();
    public void Drive(){
        System.out.println("Driving.....");
    }

}
class AdvWagonR extends WagonR{ //Concrit class
    /*
     Concrete class: A class extends an abstract class is known as a concrete class.
- An object of a concrete class can be created.
     */
    public void fly(){
        System.out.println("Welcome to fly mode");
    }
}


public class abstract1 {
    public static void main(String[] args) {
        AdvWagonR obj= new AdvWagonR();
        obj.playMusic();
        obj.Drive();
        obj.fly();
    }
}
