// In Java, a lambda expression is a concise way to implement a functional interface. 
// So the questions comes into mind what is functional interface
//Ans-> A functional interface is an interface that has only one abstract method, and it can be implemented using a lambda expression.
@FunctionalInterface
interface Lam{
    public int show(int i,int j);
}



public class lambdaExp {
   public static void main(String[] args) {
        // Lam obj=new Lam() {
        //     public void show(){
        //         System.out.println("In show main");
        //     }
        // };
        //Note: We can short the code using Lambda Expression here :)Lets try it

      //  Lam obj= () -> System.out.println("In Show main");//Lambda Expression

    //   Lam obj =i -> System.out.println("in Show"+i);

            
    //   obj.show(5);
    
    // if we have a single statement you do not need of curly braces , not even we need
    //return keyword
    Lam obj=(int i,int j ) ->i+j;
    int result = obj.show(5, 6);
    System.out.println(result);
   } 
}
/*
 #2 Properties of the lambda expression
Concise syntax: Lambda expressions provide a concise and expressive syntax for defining functional interfaces. 
They allow you to define the behaviour of a functional interface in a single line of code.

Functional programming: Lambda expressions are a key component of functional programming in Java. 
They allow you to write code that is more declarative and expressive, and less verbose than traditional imperative code.

No need for anonymous inner classes: Lambda expressions provide an alternative to anonymous inner classes, which are often 
used to implement functional interfaces in Java. Lambda expressions are more concise and easier to read than anonymous inner classes.
 */
