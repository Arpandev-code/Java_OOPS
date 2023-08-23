

class Human{
   private int age=11;// If we private instance variable , we can acress it in between the class 
   private String name="Arpandev";
   
   
   public int getAge(){// we can acress the private variable outside of the classby using methods
    return age;
   }
   public String getName(){
    return name;
   } 
}



public class encapsulation1 {
    public static void main(String[] args) {
        Human obj=new Human();
        System.out.println(obj.getAge() + obj.getName());
    }
}
