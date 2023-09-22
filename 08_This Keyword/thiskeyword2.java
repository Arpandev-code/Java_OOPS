class Human3{
    private String name;
    private int age;
    
    public void setAge(int age){
    
        this.age=age;
   }

   //Getter & Setter method
   public int getAge(){
    return age;
   }
   public void setName(String name){
   // name=name;//No error or Exceptions but the setName method doesn't work , doesn't assign value
     this.name=name; //this is keyword which represent the current object(the object calling the method)
    }

   public String getName(){
    return name;
   } 
}





public class thiskeyword2 {
    public static void main(String[] args) {
        Human3 obj=new Human3();
        obj.setAge(23);
        obj.setName("Arpandev");
        System.out.println(obj.getAge()+ " : "+obj.getName());
    }
}
