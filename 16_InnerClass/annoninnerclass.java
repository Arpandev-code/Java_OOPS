class A{
   public void dance(){
    System.out.println("Dancing.... in A");
   } 
}
// class B extends A{
//     public void dance(){
//         System.out.println("IN B");
//     }
// } 
/*
 Anonymous means something that does not have a name.
- In overriding, to provide a new implementation of a method, we need to create a new class and extend it with the parent class. After extending the class, we override the method.
- We can avoid the overriding and do not need to create a new class for this particular task.
- We can use the inner class concept to give a new implementation of a method.
 */


public class annoninnerclass {
    public static void main(String[] args) {
        A Object= new A()
        {
            public void display(){
                System.out.println("in New a");//anonymous inner class
            }
        };
        /*
- We can create a new anonymous inner class after creating an object of a class that contains the method.
- We do not need to use a class keyword with an anonymous inner class.
- It just starts with braces and contains the method and its new implementation.
- Anonymous inner class starts just the creation of an object and ends with the semicolon of that object.
         */
        Object.dance();
        
        
    }
}
