//Alternative Way to replace this keyword but using this keyworld is better
class Human3{
    private String name;
    private int age;
    
    public void setAge(int age, Human3 obj){
    Human3 obj1=obj;
    obj1.age=age;

   }

   //Getter & Setter method
   public int getAge(){
    return age;
   }
   public void setName(String name, Human3 obj){
   // name=name;//No error or Exceptions but the setName method doesn't work , doesn't assign value
    Human3 obj1=obj;
    obj1.name=name;
    }

   public String getName(){
    return name;
   } 
}





public class thiskeyword {
    public static void main(String[] args) {
        Human3 obj=new Human3();
        obj.setAge(23,obj);
        obj.setName("Arpandev", obj);
        System.out.println(obj.getAge()+ " : "+obj.getName());
    }
}
