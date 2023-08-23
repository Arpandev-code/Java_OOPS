class Human1{
   private int age;// If we private instance variable , we can acress it in between the class 
   private String name;
   
   public void setAge(int a){
    age=a;
   }

   //Getter & Setter method
   public int getAge(){// we can acress the private variable outside of the classby using methods
    return age;
   }
   public void setName(String n){
    name=n;
   }
   public String getName(){
    return name;
   } 
}


public class encapsulation2 {
    public static void main(String[] args) {
        Human1 obj= new Human1();
        obj.setAge(12);
        obj.setName("Arpandev");
        System.out.println(obj.getAge()+" : "+obj.getName());
    }
}
