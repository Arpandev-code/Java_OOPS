enum Laptops{
    Mac(2000), XPS(2200),ThinkPad(1900),Surface(4000);
    private int price;
    private Laptops(int price){
        this.price=price;
    }
    public void setPrice(int price){
        this.price=price;
        //- The constructor in an enum will be called the number of times as much the number of objects created.
        System.out.println("In Laptop"+this.name());
    }
    public int getPrice(){
        return price;
    }
    
}
/*
 Enum and Constructor:
- enum contains a constructor and it is executed separately for each enum constant at the time of enum class loading.
- We can create a constructor in an enum that can take any parameter, and that value of a parameter might be different in every object of an enum.
- Instance variables in an enum are private and we can access them in another class by using getters and setters.
- We can print the value of all objects of an enum through a loop and .values() method is used to iterating over all objects.
- If any parameterized constructor is present inside an enum, then the default constructor will not be considered.
- We create private variables and private constructors in an enum because we use them or create an object for constructors in the same class only.
 */




public class enum6 {
    public static void main(String[] args) {

        Laptops s= Laptops.Mac;
        System.out.println(s.getPrice());
        
    }
}
