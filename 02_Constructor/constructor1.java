class Human4{
    private int age;
    private String name;
    

    /*
     Constructor is the special type of Method which has same name as the class name 
     doesn't have any return type like normal method, Not even void it automatically
     called when object is created.
     */
   public Human4(int age, String name){ //paramitazied constructor
       // System.out.println("I'm a Constructor");
        this.age=age;
        this.name=name;
    }
   public int getAge(){// we can acress the private variable outside of the classby using methods
     return age;
   }
   public String getName(){
    return name;
   }
}





public class constructor1 {

    public static void main(String[] args) {
        Human4 obj= new Human4(12,"Arpandev");
        System.out.println(obj.getAge()+ " "+obj.getName());

    }
}
